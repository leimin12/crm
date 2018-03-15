package com.zking.crm.controller;

import com.zking.crm.biz.ISysUserBiz;
import com.zking.crm.mapper.SysRoleMapper;
import com.zking.crm.model.SysRole;
import com.zking.crm.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private ISysUserBiz sysUserBiz;

    private SysRoleMapper sysRoleMapper;

    @RequestMapping("doLogin")
    public String doLogin(SysUser sysUser, HttpSession session) {
        SysUser user = sysUserBiz.doLogin(sysUser);
        session.setAttribute("user", user);
        return "redirect:/sysTreeNode/list?parentNodeId=-1";
    }

    @RequestMapping("list")
    public List<SysRole> list(SysRole sysRole){
        List<SysRole> list = sysRoleMapper.list(sysRole);
        return list;
    }

}

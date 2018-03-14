package com.zking.crm.controller;

import com.zking.crm.biz.ISysTreeNodeBiz;
import com.zking.crm.mapper.SysRoleMapper;
import com.zking.crm.model.SysTreeNode;
import com.zking.crm.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sysTreeNode")
public class SysTreeNodeController {

    @Autowired
    private ISysTreeNodeBiz sysTreeNodeBiz;

    @Autowired
    private SysRoleMapper sysRoleMapper;


    @RequestMapping("list")
    public String list(Model model, SysTreeNode sysTreeNode,HttpSession session) {
        List<SysTreeNode> list = sysTreeNodeBiz.list(sysTreeNode);
        SysUser user = (SysUser) session.getAttribute("user");
        String name = sysRoleMapper.getName(user.getUserRoleId());
        model.addAttribute("name", name);
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("listByParentId")
    @ResponseBody
    public List<Map<String, Object>> listByParentId(Model model, SysTreeNode sysTreeNode) {
        List<SysTreeNode> sysTreeNodes = sysTreeNodeBiz.listByParentId(sysTreeNode);
        List<Map<String, Object>> nodeList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;
        Map<String, Object> attributes;
        for (SysTreeNode t : sysTreeNodes) {
            map = new HashMap<String, Object>();
            map.put("id", t.getTreeNodeId());
            map.put("text", t.getTreeNodeName());
            map.put("state", t.isleaf() ? "open" : "closed");
            // 自定义属性
            attributes = new HashMap<String, Object>();
            attributes.put("url", t.getUrl());
            map.put("attributes", attributes);
            nodeList.add(map);
        }
        return nodeList;
    }
}

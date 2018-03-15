package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISysUserBiz;
import com.zking.crm.mapper.SysUserMapper;
import com.zking.crm.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserBiz implements ISysUserBiz {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser doLogin(SysUser sysUser) {
        return sysUserMapper.doLogin(sysUser);
    }

    @Override
    public List<SysUser> list(SysUser sysUser) {
        return sysUserMapper.list(sysUser);
    }


}

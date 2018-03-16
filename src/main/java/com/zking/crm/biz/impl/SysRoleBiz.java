package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISysRoleBiz;
import com.zking.crm.mapper.SysRoleMapper;
import com.zking.crm.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysRoleBiz implements ISysRoleBiz {
  @Autowired
  private SysRoleMapper sysRoleMapper;
    @Override
    public List<SysRole> list(SysRole sysRole) {
        return sysRoleMapper.list(sysRole);
    }

    @Override
    public SysRole load(Integer Id) {
        return sysRoleMapper.selectByPrimaryKey(Id);
    }
}

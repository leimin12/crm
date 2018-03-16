package com.zking.crm.biz;

import com.zking.crm.model.SysRole;

import java.util.List;

public interface ISysRoleBiz {
    List<SysRole> list(SysRole sysRole);

    SysRole load(Integer Id);
}

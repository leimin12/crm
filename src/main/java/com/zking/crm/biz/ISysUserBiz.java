package com.zking.crm.biz;

import com.zking.crm.model.SysUser;

import java.util.List;

public interface ISysUserBiz {
    SysUser doLogin(SysUser sysUser);

    List<SysUser> list();

}

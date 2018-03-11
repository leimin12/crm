package com.zking.crm.mapper;

import com.zking.crm.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long usrId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long usrId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
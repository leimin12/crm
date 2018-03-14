package com.zking.crm.mapper;

import com.zking.crm.model.Lost;

import java.util.List;

public interface LostMapper {
    int deleteByPrimaryKey(Long lstId);

    int insert(Lost record);

    int insertSelective(Lost record);

    Lost selectByPrimaryKey(Long lstId);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);

    List<Lost> listLost(Lost lost);

}
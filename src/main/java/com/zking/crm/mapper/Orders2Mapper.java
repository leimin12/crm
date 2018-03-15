package com.zking.crm.mapper;

import com.zking.crm.model.Orders2;

import java.util.List;
import java.util.Map;

public interface Orders2Mapper {
    int deleteByPrimaryKey(Long odrId);

    int insert(Orders2 record);

    int insertSelective(Orders2 record);

    Orders2 selectByPrimaryKey(Long odrId);

    int updateByPrimaryKeySelective(Orders2 record);

    int updateByPrimaryKey(Orders2 record);

    List<Map<String,Object>> listCount(Orders2 orders2);

}
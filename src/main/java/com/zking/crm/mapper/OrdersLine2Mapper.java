package com.zking.crm.mapper;

import com.zking.crm.model.OrdersLine2;

public interface OrdersLine2Mapper {
    int deleteByPrimaryKey(Long oddId);

    int insert(OrdersLine2 record);

    int insertSelective(OrdersLine2 record);

    OrdersLine2 selectByPrimaryKey(Long oddId);

    int updateByPrimaryKeySelective(OrdersLine2 record);

    int updateByPrimaryKey(OrdersLine2 record);
}
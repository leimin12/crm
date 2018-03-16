package com.zking.crm.mapper;

import com.zking.crm.model.OrdersLine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersLineMapper {
    int deleteByPrimaryKey(Long oddId);

    int insert(OrdersLine record);

    int insertSelective(OrdersLine record);

    OrdersLine selectByPrimaryKey(Long oddId);

    int updateByPrimaryKeySelective(OrdersLine record);

    int updateByPrimaryKey(OrdersLine record);

    List<OrdersLine> list(OrdersLine ordersLine);

    String load(OrdersLine ordersLine);
}
package com.zking.crm.mapper;

import com.zking.crm.model.Orders;
import com.zking.crm.util.PageBean;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Long odrId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long odrId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> list(Orders orders);

    Orders load(Orders orders);
}
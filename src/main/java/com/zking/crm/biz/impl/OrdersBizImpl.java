package com.zking.crm.biz.impl;

import com.zking.crm.biz.IOrdersBiz;
import com.zking.crm.mapper.OrdersMapper;
import com.zking.crm.model.Orders;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersBizImpl implements IOrdersBiz {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> list(Orders orders, PageBean pageBean) {
        return ordersMapper.list(orders);
    }

    @Override
    public Orders load(Orders orders) {
        return ordersMapper.load(orders);
    }
}

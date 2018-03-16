package com.zking.crm.biz.impl;

import com.zking.crm.biz.IOrdersLineBiz;
import com.zking.crm.mapper.OrdersLineMapper;
import com.zking.crm.model.OrdersLine;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersLineBizImpl implements IOrdersLineBiz {

    @Autowired
    private OrdersLineMapper ordersLineMapper;

    @Override
    public List<OrdersLine> list(OrdersLine ordersLine, PageBean pageBean) {
        return ordersLineMapper.list(ordersLine);
    }

    @Override
    public String load(OrdersLine ordersLine) {
        return ordersLineMapper.load(ordersLine);
    }
}

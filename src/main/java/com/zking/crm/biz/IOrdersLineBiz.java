package com.zking.crm.biz;

import com.zking.crm.model.OrdersLine;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IOrdersLineBiz {

    List<OrdersLine> list(OrdersLine ordersLine, PageBean pageBean);

    String load(OrdersLine ordersLine);
}

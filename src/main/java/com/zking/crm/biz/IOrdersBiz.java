package com.zking.crm.biz;

import com.zking.crm.model.Orders;
import com.zking.crm.util.PageBean;
import org.aspectj.weaver.ast.Or;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface IOrdersBiz {

    List<Orders> list(Orders orders,PageBean pageBean);

    Orders load(Orders orders);

}

package com.zking.crm.controller;

import com.zking.crm.biz.IOrdersBiz;
import com.zking.crm.model.CstCustomer;
import com.zking.crm.model.Orders;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersBiz iOrdersBiz;

    @ModelAttribute
    public void init(Model model, HttpSession session){
        Orders orders = new Orders();
        model.addAttribute("or",orders);
    }

    @RequestMapping("/orderList")
    @ResponseBody
    public ResponseData list(Orders orders, Model model, HttpSession session, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Orders> orders1 = iOrdersBiz.list(orders,pageBean);
        model.addAttribute("orders1",orders1);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(orders1);
        return responseData;
    }

    @RequestMapping("/listors")
    public String acList(Model model, Orders orders) {
        model.addAttribute("ors", orders);
        return "cust/cust/orders";
    }

    @RequestMapping("/orloadsssss")
    public String orload(Model model,Orders orders,HttpSession session){
        Orders order = iOrdersBiz.load(orders);
        model.addAttribute("order",order);
        return "forward:/ordersLine/orderLineList?oddOrderId="+order.getOdrId();
    }

}

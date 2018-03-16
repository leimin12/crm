package com.zking.crm.controller;

import com.zking.crm.biz.IOrdersLineBiz;
import com.zking.crm.model.OrdersLine;
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
@RequestMapping("/ordersLine")
public class OrdersLineController {

    @Autowired
    private IOrdersLineBiz iOrdersLineBiz;


    @ModelAttribute
    public void init(Model model, HttpSession session){
        OrdersLine ordersLine = new OrdersLine();
        model.addAttribute("orl",ordersLine);
    }

    @RequestMapping("/orderLineList")
    public String list(OrdersLine ordersLine, Model model, HttpSession session, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        String sums=iOrdersLineBiz.load(ordersLine);
        model.addAttribute("sums",sums);
        List<OrdersLine> ordersLines = iOrdersLineBiz.list(ordersLine,null);
        model.addAttribute("ordersLines",ordersLines);
        return "cust/cust/orders_detail";
    }

}

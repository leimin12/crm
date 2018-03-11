package com.zking.crm.controller;

import com.zking.crm.biz.ICstCustomerBiz;
import com.zking.crm.model.CstCustomer;
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
@RequestMapping("/cstCustomer")
public class CstCustomerController {

    @Autowired
    private ICstCustomerBiz iCstCustomerBiz;

    @ModelAttribute
    public void init(Model model, HttpSession session){
        CstCustomer cstCustomer = new CstCustomer();
        List<CstCustomer> listregion = iCstCustomerBiz.listregion(cstCustomer);
        List<CstCustomer> listmanagerid = iCstCustomerBiz.listmanagerid(cstCustomer);
        List<CstCustomer> listlevelint = iCstCustomerBiz.listlevelint(cstCustomer);
        List<CstCustomer> listsatisfy = iCstCustomerBiz.listsatisfy(cstCustomer);
        List<CstCustomer> listcredit = iCstCustomerBiz.listcredit(cstCustomer);

        model.addAttribute("listregion",listregion);
        model.addAttribute("listmanagerid",listmanagerid);
        model.addAttribute("listlevelint",listlevelint);
        model.addAttribute("listsatisfy",listsatisfy);
        model.addAttribute("listcredit",listcredit);

        model.addAttribute("cst",cstCustomer);

    }

    @RequestMapping("/cstList")
    @ResponseBody
    public ResponseData list(HttpServletRequest request,CstCustomer cstCustomer){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<CstCustomer> cstCustomerList = iCstCustomerBiz.list(cstCustomer,pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(cstCustomerList);

        return responseData;
    }

    @RequestMapping("/cstdel")
    public String cstdel(Model model,CstCustomer cstCustomer){
        iCstCustomerBiz.del(cstCustomer);
        return "forward:/cstCustomer/cstList";
    }

    @RequestMapping("/cstload")
    public String cstload(Model model,CstCustomer cstCustomer){
        CstCustomer customer=iCstCustomerBiz.load(cstCustomer);
        model.addAttribute("customer",customer);
        return "cust/cust/edit";
    }

    @RequestMapping("/cstedit")
    public String cstedit(CstCustomer cstCustomer){
        iCstCustomerBiz.edit(cstCustomer);
        return "forward:cstCustomer/cstList";
    }

    @RequestMapping("/list")
    public String toList(Model model) {
        return "cust/cust/list";
    }

}

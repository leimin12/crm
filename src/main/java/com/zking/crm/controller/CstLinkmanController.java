package com.zking.crm.controller;

import com.zking.crm.biz.ICstLinkmanBiz;
import com.zking.crm.model.CstLinkman;
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
@RequestMapping("/linkman")
public class CstLinkmanController {

    @Autowired
    private ICstLinkmanBiz iCstLinkmanBiz;



    @ModelAttribute
    public void init(Model model, HttpSession session){
        CstLinkman cstLinkman = new CstLinkman();
        model.addAttribute("www",cstLinkman);

    }

    @RequestMapping("/cstlinkman")
    @ResponseBody
    public ResponseData list(CstLinkman cstLinkman,Model model, HttpSession session,HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<CstLinkman> cstCustomerList = iCstLinkmanBiz.listman(cstLinkman,pageBean);
        model.addAttribute("cstCustomerList",cstCustomerList);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(cstCustomerList);
        return responseData;
    }

    @RequestMapping("/list")
    public String toList(Model model,CstLinkman cstLinkman) {
        model.addAttribute("cst1", cstLinkman);
        return "cust/cust/linkman";
    }


    @RequestMapping("/linkdel")
    @ResponseBody
    public int cstdel(Model model,CstLinkman cstLinkman){
        return iCstLinkmanBiz.del(cstLinkman);
    }

    @RequestMapping("/linkload")
    public String cstload(Model model,CstLinkman cstLinkman,HttpSession session){
        CstLinkman linkmans=iCstLinkmanBiz.loadedit(cstLinkman);
        model.addAttribute("linkmans",linkmans);
        return "cust/cust/linkman_edit";
    }

    @RequestMapping(value = "linkedit",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String cstedit(CstLinkman cstLinkman){
        iCstLinkmanBiz.edit(cstLinkman);
        return "修改成功";
    }

    @RequestMapping(value = "cstlinkAdd",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String cstlinkAdd(CstLinkman cstLinkman1,Model model) {
        iCstLinkmanBiz.add(cstLinkman1);
        return "增加成功";
    }

    @RequestMapping("/linkadd")
    public String linkadd(Model model,CstLinkman cstLinkman){
        return "cust/cust/linkman_add";
    }

}

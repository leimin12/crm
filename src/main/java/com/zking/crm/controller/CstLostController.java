package com.zking.crm.controller;

import com.zking.crm.biz.ICstLostBiz;
import com.zking.crm.model.CstLost;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RequestMapping("/cstLost")
public class CstLostController {

    @Autowired
    private ICstLostBiz iCstLostBiz;

    @ModelAttribute
    public void init(Model model,HttpSession session){
        CstLost cstLost = new CstLost();
        model.addAttribute("cstLost",cstLost);
        session.setAttribute("listid",cstLost.getLstId());
    }

    @RequestMapping("/lists")
    public String lists(Model model){
        return "cust/lost/list";
    }

    @RequestMapping("/lostList")
    @ResponseBody
    public ResponseData list(HttpServletRequest request, CstLost cstLost){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<CstLost> cstCustomerList = iCstLostBiz.list(cstLost,pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(cstCustomerList);
        return responseData;
    }

    @RequestMapping("/lostload")
    public String lostload(Model model, CstLost cstLost){
        CstLost cstLost1=iCstLostBiz.load(cstLost);
        model.addAttribute("cstLost1",cstLost1);
        return "cust/lost/relay";
    }

    @RequestMapping("/lostloads")
    public String lostloads(Model model,CstLost cstLost){
        CstLost cstLost2=iCstLostBiz.load(cstLost);
        cstLost2.setLstLostDate(new Date());
        model.addAttribute("cstLost2",cstLost2);
        return "cust/lost/confirm";
    }

    @RequestMapping(value = "edit",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String lostedit(Model model,CstLost cstLost){
        iCstLostBiz.edit(cstLost);
        return "修改成功";
    }

    @RequestMapping(value = "edits",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String lostedits(Model model,CstLost cstLost){
//        if(cstLost.getLstLostDate() == null){
//           cstLost.setLstLostDate(new Date());
//           iCstLostBiz.add(cstLost);
//        }
        iCstLostBiz.edits(cstLost);
        return "修改成功";
    }

}

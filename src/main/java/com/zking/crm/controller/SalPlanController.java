package com.zking.crm.controller;

import com.zking.crm.biz.ISalPlanBiz;
import com.zking.crm.model.SalPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("salPlan")
public class SalPlanController {

    @Autowired
    private ISalPlanBiz salPlanBiz;


    @RequestMapping("toPlanList")
    public String toPlanList() {
        return "sale/planList";
    }

    @RequestMapping("add")
    public void  add(SalPlan salPlan) {
        salPlanBiz.add(salPlan);
    }

    @RequestMapping("del")
    public void  del(SalPlan salPlan) {
        salPlanBiz.del(salPlan);
    }

    @RequestMapping("edit")
    public void  edit(SalPlan salPlan) {
        salPlanBiz.edit(salPlan);
    }

    @RequestMapping("load")
    public void  load(SalPlan salPlan, Model model) {
        SalPlan load = salPlanBiz.load(salPlan);
        model.addAttribute("load", load);
    }

    @RequestMapping("list")
    @ResponseBody
    public List<SalPlan> list(SalPlan salPlan, Model model, HttpServletRequest request) {
        return salPlanBiz.list(salPlan);
    }


}

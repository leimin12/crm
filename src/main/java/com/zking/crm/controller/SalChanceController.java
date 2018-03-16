package com.zking.crm.controller;

import com.zking.crm.biz.ISalChanceBiz;
import com.zking.crm.model.SalChance;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("SalChance")
public class SalChanceController {

    @Autowired
    private ISalChanceBiz salChanceBiz;

   /* //用来生成pageBean
    public PageBean initPageBean(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        request.setAttribute("pageBean", pageBean);
        return pageBean;
    }*/

    @RequestMapping("toSalChanceList")
    public String toSalChanceList() {
        return "sale/salChanceList";
    }

    @RequestMapping("toAddSalChance")
    public String toAddSalChance() {
        return "sale/addSalChance";
    }

    //机会的增加
    @RequestMapping(value = "add",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String add(SalChance salChance, Model model) {
        salChanceBiz.add(salChance);
        return "新建成功";
    }

    @RequestMapping("del")
    public void del(SalChance salChance, Model model) {
        salChanceBiz.del(salChance);
    }

    @RequestMapping(value = "edit",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String edit(SalChance salChance, Model model) {
        salChanceBiz.edit(salChance);
        return "修改成功";
    }

    @RequestMapping(value = "editStatusByDispatch",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String editStatusByDispatch(SalChance salChance, Model model) {
        salChanceBiz.editStatusByDispatch(salChance);
        return "指派成功";
    }

    @RequestMapping(value = "editStatusByPlanSuccess",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String editStatusByPlanSuccess(SalChance salChance) {
        salChance.setChcStatus("3");
        salChanceBiz.editStatusByPlan(salChance);
        return "开发成功!";
    }

    @RequestMapping(value = "editStatusByPlanFailed",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String editStatusByPlanFailed(SalChance salChance) {
        salChance.setChcStatus("4");
        salChanceBiz.editStatusByPlan(salChance);
        return "已终止!";
    }

    @RequestMapping("load")
    public String load(SalChance salChance, Model model) {
        SalChance load = salChanceBiz.load(salChance);
        model.addAttribute("load",load);
        if (salChance.getType() == 1) {
            return "sale/editSalChance";
        }else if(salChance.getType()==2) {
            return "sale/dispatch";
        }else if(salChance.getType()==3) {
            return "sale/plan";
        }else if(salChance.getType()==4) {
            return "sale/planLoad";
        }else{
            return "sale/planExecute";
        }
    }

    @RequestMapping("list")
    @ResponseBody
    public ResponseData list(SalChance salChance, Model model, HttpServletRequest request,PageBean pageBean,ResponseData responseData) {
        pageBean.setRequest(request);
        List<SalChance> list = salChanceBiz.list(salChance, pageBean);
        responseData.setTotal(pageBean.getTotalRecord());// 总行数
        responseData.setRows(list);// 类似于// List/Set/Array的集合
        return responseData;
    }

    @RequestMapping("listToPlan")
    @ResponseBody
    public ResponseData listToPlan(SalChance salChance, Model model, HttpServletRequest request,PageBean pageBean,ResponseData responseData) {
        salChance.setChcDueId(1);
        pageBean.setRequest(request);
        List<SalChance> list = salChanceBiz.listToPlan(salChance, pageBean);
        responseData.setTotal(pageBean.getTotalRecord());// 总行数
        responseData.setRows(list);// 类似于// List/Set/Array的集合
        return responseData;
    }
}
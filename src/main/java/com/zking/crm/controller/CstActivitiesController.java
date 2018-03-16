package com.zking.crm.controller;

import com.zking.crm.biz.ICstActivitiesBiz;
import com.zking.crm.model.CstActivity;
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
@RequestMapping("/Activity")
public class CstActivitiesController {

    @Autowired
    private ICstActivitiesBiz iCstActivitiesBiz;

    @ModelAttribute
    public void init(Model model, HttpSession session){
        CstActivity cstActivity = new CstActivity();
        model.addAttribute("csa",cstActivity);

    }

    @RequestMapping("/ActivityList")
    @ResponseBody
    public ResponseData list(CstActivity cstActivity, Model model, HttpSession session, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<CstActivity> cstActivities = iCstActivitiesBiz.list(cstActivity,pageBean);
        model.addAttribute("cstActivities",cstActivities);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(cstActivities);
        return responseData;
    }

    @RequestMapping("/lists")
    public String acList(Model model,CstActivity activity) {
        model.addAttribute("act", activity);
        return "cust/cust/activities";
    }


    @RequestMapping("/acdel")
    @ResponseBody
    public int acdel(Model model,CstActivity activity){
        return iCstActivitiesBiz.del(activity);
    }

    @RequestMapping("/acload")
    public String acload(Model model,CstActivity activity,HttpSession session){
        CstActivity activity1=iCstActivitiesBiz.load(activity);
        model.addAttribute("activity1",activity1);
        return "cust/cust/activities_edit";
    }

    @RequestMapping(value = "acedit",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String acedit(CstActivity activity){
        iCstActivitiesBiz.edit(activity);
        return "修改成功";
    }

    @RequestMapping(value = "/acadd",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String cstlinkAdd(CstActivity activity,Model model) {
        iCstActivitiesBiz.add(activity);
        return "增加成功";
    }

    @RequestMapping("/add")
    public String add(Model model){
        return "cust/cust/activities_add";
    }

}

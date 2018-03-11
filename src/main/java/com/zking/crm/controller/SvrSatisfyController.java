package com.zking.crm.controller;

import com.zking.crm.biz.IDIctIsEditableBiz;
import com.zking.crm.biz.ISvrSatisfyBiz;
import com.zking.crm.model.DictIsEditable;
import com.zking.crm.model.SvrSatisfy;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/svr")
public class SvrSatisfyController {
    @Autowired
    private ISvrSatisfyBiz iSvrSatisfyBiz;
    @Autowired
    private IDIctIsEditableBiz idIctIsEditableBiz;
    @ModelAttribute
    public void init(Model model){
        SvrSatisfy svrSatisfy = new SvrSatisfy();
        DictIsEditable dictIsEditable = new DictIsEditable();
        dictIsEditable.setDictType("服务类型");
        List<SvrSatisfy> svrSatisfyList = iSvrSatisfyBiz.list(svrSatisfy, new PageBean());
        List<DictIsEditable> dictIsEditableList = idIctIsEditableBiz.list(dictIsEditable, new PageBean());
        model.addAttribute("svrSatisty", svrSatisfy);
        model.addAttribute("svrSatisfyList", svrSatisfyList);
        model.addAttribute("dictIsEditableList", dictIsEditableList);
    }
    @RequestMapping("/toServiceAdd")
    public String ToServiceadd(Model model){
        return "cust/service/add";
    }
    @RequestMapping("/toServiceArch")//服务归档
    public String ToServicearch(Model model){
        return "cust/service/arch";
    }
    @RequestMapping("/toServiceDeal")//服务处理
    public String ToServiceDeal(Model model){
        return "cust/service/deal";
    }
    @RequestMapping("/toserviceDispatch")//服务分配
    public String ToServiceDispatch(Model model) {
        return "cust/service/dispatch";
    }
    @RequestMapping("/toserviceFeedBack")//服务反馈
    public String ToServiceFeedBack(Model model) {
        return "cust/service/feedback";
    }
    @RequestMapping("/Add")
    public void Add(Model model,SvrSatisfy svrSatisfy) {
        svrSatisfy.setSvrCreateId(1l);
        svrSatisfy.setSvrStatus("1");
        iSvrSatisfyBiz.add(svrSatisfy);
    }
    @RequestMapping("/ToList")
    @ResponseBody
    public ResponseData ToList(SvrSatisfy svrSatisfy, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<SvrSatisfy> svrSatisfyList = iSvrSatisfyBiz.list(svrSatisfy, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(svrSatisfyList);
        return responseData;
    }
}

package com.zking.crm.controller;

import com.zking.crm.biz.IDIctIsEditableBiz;
import com.zking.crm.biz.ISvrSatisfyBiz;
import com.zking.crm.biz.ISysRoleBiz;
import com.zking.crm.biz.ISysUserBiz;
import com.zking.crm.mapper.SysRoleMapper;
import com.zking.crm.model.DictIsEditable;
import com.zking.crm.model.SvrSatisfy;
import com.zking.crm.model.SysRole;
import com.zking.crm.model.SysUser;
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
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/svr")
public class SvrSatisfyController {
    @Autowired
    private ISvrSatisfyBiz iSvrSatisfyBiz;
    @Autowired
    private IDIctIsEditableBiz idIctIsEditableBiz;
    @Autowired
    private ISysRoleBiz iSysRoleBiz;
    @Autowired
    private ISysUserBiz iSysUserBiz;
    @ModelAttribute
    public void init(Model model, HttpSession session){
        SvrSatisfy svrSatisfy = new SvrSatisfy();
        SysRole sysRole = new SysRole();
        sysRole.setRoleDesc("客户经理");
        DictIsEditable dictIsEditable = new DictIsEditable();
        dictIsEditable.setDictType("服务类型");
        Object user = session.getAttribute("user");
        System.out.println("usr:"+user);
        SysUser sysUser=(SysUser) user;
        System.out.println("sysUser:"+sysUser);
        SysRole load = iSysRoleBiz.load(sysUser.getUserRoleId());
        List<SvrSatisfy> svrSatisfyList = iSvrSatisfyBiz.list(svrSatisfy, new PageBean());
        List<DictIsEditable> dictIsEditableList = idIctIsEditableBiz.list(dictIsEditable, new PageBean());
        List<SysRole> sysRoleList = iSysRoleBiz.list(sysRole);
        model.addAttribute("svrSatisty", svrSatisfy);
        model.addAttribute("svrSatisfyList", svrSatisfyList);
        model.addAttribute("dictIsEditableList", dictIsEditableList);
        model.addAttribute("sysRoleList", sysRoleList);
        model.addAttribute("load", load);
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
    public String Add(Model model,SvrSatisfy svrSatisfy) {
        svrSatisfy.setSvrStatus("1");
        iSvrSatisfyBiz.add(svrSatisfy);
        return "cust/service/dispatch";
    }
    @RequestMapping("/ToListDispatch")
    @ResponseBody
    public ResponseData ToListDispatch(SvrSatisfy svrSatisfy, HttpServletRequest request){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<SvrSatisfy> svrSatisfyList = iSvrSatisfyBiz.list(svrSatisfy, pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(svrSatisfyList);
        return responseData;
    }
    @RequestMapping("/toDel")
    @ResponseBody
    public int Del(SvrSatisfy svrSatisfy){
        return iSvrSatisfyBiz.del(svrSatisfy);
    }
    @RequestMapping("/ToEdit")
    @ResponseBody
    public int ToEdit(SvrSatisfy svrSatisfy){
        svrSatisfy.setSvrDueDate(new Date());
        iSvrSatisfyBiz.edit(svrSatisfy);
        return 1;
    }
    @RequestMapping("/ToDealLoad")
    public String ToLoadDeal(SvrSatisfy svrSatisfy,Model model){
        SvrSatisfy satisfy = iSvrSatisfyBiz.load(svrSatisfy);
        model.addAttribute("satisfy", satisfy);
        return "cust/service/deal_detail";
    }
    @RequestMapping("/ToArchLoad")
    public String ToLoadArch(SvrSatisfy svrSatisfy,Model model){
        SvrSatisfy satisfy = iSvrSatisfyBiz.load(svrSatisfy);
        model.addAttribute("satisfy", satisfy);
        return "cust/service/detail";
    }
    @RequestMapping("/ToFeedLoad")
    public String ToLoadFeed(SvrSatisfy svrSatisfy,Model model){
        SvrSatisfy satisfy = iSvrSatisfyBiz.load(svrSatisfy);
        model.addAttribute("satisfy", satisfy);
        return "cust/service/feedback_detail";
    }
    @RequestMapping("/ToDealEdit")
    public String DealEdit(SvrSatisfy svrSatisfy){
        svrSatisfy.setSvrDealId(3l);
        iSvrSatisfyBiz.edit(svrSatisfy);
        return"cust/service/deal";
    }
    @RequestMapping("/ToFeedEdit")
    public String FeedEdit(SvrSatisfy svrSatisfy){
        iSvrSatisfyBiz.edit(svrSatisfy);
        return "cust/service/feedback";}
}

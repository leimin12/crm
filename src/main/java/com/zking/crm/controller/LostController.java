package com.zking.crm.controller;

import com.zking.crm.biz.ILostBiz;
import com.zking.crm.model.Lost;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("lostCont")
public class LostController {

    @Autowired
    private ILostBiz lostBiz;

    @RequestMapping("doToLost")
    public String doToLost() {
        return "rept/lost";
    }

    @RequestMapping("listLost")
    @ResponseBody
    public ResponseData listLost(Lost lost1, HttpServletRequest request, PageBean pageBean, ResponseData responseData) {
        pageBean.setRequest(request);
        List<Lost> losts = lostBiz.listLost(lost1, pageBean);
        responseData.setTotal(pageBean.getTotalRecord());// 总行数
        responseData.setRows(losts);// 类似于// List/Set/Array的集合
        return responseData;
    }
}

package com.zking.crm.controller;

import com.zking.crm.biz.ISatisfyBiz;
import com.zking.crm.model.Satisfy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Satisfy")
public class SatisfyController {

    @Autowired
    private ISatisfyBiz satisfyBiz;

    @RequestMapping("doToSer")
    public String doToSer() {
        return "rept/ser";
    }


    @RequestMapping("doGetCount2")
    @ResponseBody
    public List<Integer> doGetCount2(Satisfy satisfy2) {
        return satisfyBiz.doGetCount2(satisfy2);
    }

}

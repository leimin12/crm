package com.zking.crm.controller;

import com.zking.crm.biz.IStorageBiz;
import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private IStorageBiz iStorageBiz;
    @RequestMapping("tostorage")
    public  String Storage(){
        return "basd/storage";
    }
@RequestMapping("/ToList")
@ResponseBody
    public ResponseData List(Storage storage, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        List<Storage> storageList = iStorageBiz.list(storage, pageBean);
        for (Storage s:storageList) {
            s.setpName(s.getProduct().getProdName() + "_" + s.getProduct().getProdType() + "_" +s.getProduct().getProdBatch());
        }
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(storageList);
        return responseData;
    }
}

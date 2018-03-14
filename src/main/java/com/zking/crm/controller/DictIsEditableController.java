package com.zking.crm.controller;

import com.zking.crm.biz.IDIctIsEditableBiz;
import com.zking.crm.model.DictIsEditable;
import com.zking.crm.util.PageBean;
import com.zking.crm.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dict")
public class DictIsEditableController {
    @Autowired
    private IDIctIsEditableBiz idIctIsEditableBiz;
    @ModelAttribute
    public void init(Model model) {
        DictIsEditable dictIsEditable = new DictIsEditable();
        List<DictIsEditable> dictIsEditableList = idIctIsEditableBiz.list(dictIsEditable,new PageBean());
        model.addAttribute("dictIsEditable", dictIsEditable);
        model.addAttribute("dictIsEditableList", dictIsEditableList);
    }
    @RequestMapping("/todict")
    public  String ToEdit(Model model) {
        return "basd/dict";
    }
    @RequestMapping("/dictlist")
    @ResponseBody
    public ResponseData listDispatch(DictIsEditable dictIsEditable, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);

        List<DictIsEditable> dictIsEditableList = idIctIsEditableBiz.list(dictIsEditable,pageBean);
        ResponseData responseData = new ResponseData();
        responseData.setTotal(pageBean.getTotalRecord());
        responseData.setRows(dictIsEditableList);
        return responseData;
    }
    @RequestMapping("/Toadd")
    public String ToAdd(){
        return "basd/dict_add";
    }

    @RequestMapping("/Todel")
    @ResponseBody
    public int Del(DictIsEditable dictIsEditable,Model model){
        idIctIsEditableBiz.del(dictIsEditable);
        return 1;
    }
    @RequestMapping("/Toload")
    public String Load(DictIsEditable dictIsEditable,Model model){
        DictIsEditable load = idIctIsEditableBiz.load(dictIsEditable);
        model.addAttribute("load", load);
        return "basd/dict_edit";
    }
    @RequestMapping("/ToEidt")
    @ResponseBody
    public void Edit(DictIsEditable dictIsEditable) {
        idIctIsEditableBiz.eidt(dictIsEditable);
    }
    @RequestMapping("/add")
    @ResponseBody
    public int Add(DictIsEditable dictIsEditable){ idIctIsEditableBiz.add(dictIsEditable);
    return 1;
    }
}

package com.zking.crm.controller;

import com.alibaba.fastjson.JSON;
import com.zking.crm.biz.IOrders2Biz;
import com.zking.crm.model.Orders2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("orders2")
public class Orders2Controller {

    @Autowired
    private IOrders2Biz orders2Biz;

    @RequestMapping("doToContr")
    public String doToContr() {
        return "rept/contr";
    }

    @RequestMapping(value = "listCount",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String listCount(Orders2 orders3) {
        List<Map<String, Object>> maps = orders2Biz.listCount(orders3);
        Map<String,Object>  map;
        Map<String,Object>  map2;

        Map<String, Object>  map3;
        List<String> list1 = new ArrayList<String>();
        List<Object> list2 = new ArrayList<Object>();

        for (int i=0;i<maps.size();i++){
            map = maps.get(i);
            list1.add(map.get("odr_customer").toString());
            map2=(Map<String, Object>) map.get("sum(ol");
            map3=(Map<String, Object>)map2.get("odd_count*ol");
            list2.add(map3.get("odd_price)"));
        }
        String str1= JSON.toJSONString(list1);
        String str2= JSON.toJSONString(list2);
        String s=str1+"!"+str2;
        return s;
    }

}

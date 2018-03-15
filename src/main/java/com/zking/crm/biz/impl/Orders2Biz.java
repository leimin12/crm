package com.zking.crm.biz.impl;

import com.zking.crm.biz.IOrders2Biz;
import com.zking.crm.mapper.Orders2Mapper;
import com.zking.crm.model.Orders2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Orders2Biz implements IOrders2Biz {

    @Autowired
    private Orders2Mapper orders2Mapper;

    @Override
    public List<Map<String,Object>> listCount(Orders2 orders2) {
        return orders2Mapper.listCount(orders2);
    }
}

package com.zking.crm.biz;

import com.zking.crm.model.Orders2;

import java.util.List;
import java.util.Map;

public interface IOrders2Biz {
    List<Map<String,Object>> listCount(Orders2 orders2);
}

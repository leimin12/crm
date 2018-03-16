package com.zking.crm.biz;

import com.zking.crm.model.Lost;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ILostBiz {
     List<Lost> listLost(Lost lost, PageBean pageBean);
}

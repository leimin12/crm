package com.zking.crm.biz.impl;

import com.zking.crm.biz.ILostBiz;
import com.zking.crm.mapper.LostMapper;
import com.zking.crm.model.Lost;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LostBiz implements ILostBiz {

    @Autowired
    private LostMapper lostMapper;

    @Override
    public List<Lost> listLost(Lost lost, PageBean pageBean) {
         return lostMapper.listLost(lost);
    }
}

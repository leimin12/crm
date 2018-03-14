package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISatisfyBiz;
import com.zking.crm.mapper.SatisfyMapper;
import com.zking.crm.model.Satisfy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SatisfyBiz implements ISatisfyBiz {

    @Autowired
    private SatisfyMapper satisfyMapper;

    @Override
    public List<Integer> doGetCount2(Satisfy satisfy) {
        return satisfyMapper.doGetCount2(satisfy);
    }
}

package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISvrSatisfyBiz;
import com.zking.crm.mapper.SvrSatisfyMapper;
import com.zking.crm.model.SvrSatisfy;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SvrSatisfyBiz implements ISvrSatisfyBiz {
    @Autowired
    private SvrSatisfyMapper svrSatisfyMapper;
    @Override
    public void add(SvrSatisfy svrSatisfy) {
        svrSatisfyMapper.insert(svrSatisfy);
    }

    @Override
    public void del(SvrSatisfy svrSatisfy) {
        svrSatisfyMapper.deleteByPrimaryKey(svrSatisfy.getSvrId());
    }

    @Override
    public void edit(SvrSatisfy svrSatisfy) {
        svrSatisfyMapper.updateByPrimaryKeySelective(svrSatisfy);
    }

    @Override
    public SvrSatisfy load(SvrSatisfy svrSatisfy) {
        return svrSatisfyMapper.selectByPrimaryKey(svrSatisfy.getSvrId());
    }

    @Override
    public List<SvrSatisfy> list(SvrSatisfy svrSatisfy, PageBean pageBean) {
        return svrSatisfyMapper.list();
    }
}

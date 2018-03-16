package com.zking.crm.biz.impl;

import com.zking.crm.biz.ICstLostBiz;
import com.zking.crm.mapper.CstLostMapper;
import com.zking.crm.model.CstLost;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CstLostBizImpl implements ICstLostBiz {

    @Autowired
    private CstLostMapper cstLostMapper;

    @Override
    public List<CstLost> list(CstLost cstLost, PageBean pageBean) {
        return cstLostMapper.list(cstLost);
    }

    @Override
    public void add(CstLost cstLost) {
        cstLostMapper.insert(cstLost);
    }

    @Override
    public int del(CstLost cstLost) {
        return cstLostMapper.deleteByPrimaryKey(cstLost.getLstId());
    }

    @Override
    public void edit(CstLost cstLost) {
        cstLostMapper.updateByPrimaryKeySelective(cstLost);
    }

    @Override
    public void edits(CstLost cstLost) {
        cstLostMapper.updateByPrimaryKeySelectives(cstLost);
    }

    @Override
    public CstLost load(CstLost cstLost) {
        return cstLostMapper.selectByPrimaryKey(cstLost.getLstId());
    }
}

package com.zking.crm.biz.impl;

import com.zking.crm.biz.ICstLinkmanBiz;
import com.zking.crm.mapper.CstLinkmanMapper;
import com.zking.crm.model.CstLinkman;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CstLinkmanBizImpl implements ICstLinkmanBiz {

    @Autowired
    private CstLinkmanMapper cstLinkmanMapper;

    @Override
    public List<CstLinkman> listman(CstLinkman cstLinkman, PageBean pageBean) {
        return cstLinkmanMapper.listman(cstLinkman);
    }

    @Override
    public void add(CstLinkman cstLinkman) {
        cstLinkmanMapper.insert(cstLinkman);
    }

    @Override
    public int del(CstLinkman cstLinkman) {
       return cstLinkmanMapper.deleteByPrimaryKey(cstLinkman.getLkmId());
    }

    @Override
    public void edit(CstLinkman cstLinkman) {
        cstLinkmanMapper.updateByPrimaryKey(cstLinkman);
    }

    @Override
    public CstLinkman load(CstLinkman cstLinkman) {
       return  cstLinkmanMapper.select(cstLinkman);
    }

    @Override
    public CstLinkman loadedit(CstLinkman cstLinkman) {
        return cstLinkmanMapper.selectedit(cstLinkman);
    }
}

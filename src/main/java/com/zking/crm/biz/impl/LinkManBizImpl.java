package com.zking.crm.biz.impl;

import com.zking.crm.biz.ILinkManBiz;
import com.zking.crm.mapper.CstLinkmanMapper;
import com.zking.crm.model.CstLinkman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkManBizImpl implements ILinkManBiz {

    @Autowired
    private CstLinkmanMapper cstLinkmanMapper;

    @Override
    public List<CstLinkman> listman(CstLinkman cstLinkman) {
        return cstLinkmanMapper.listman(cstLinkman);
    }

    @Override
    public void add(CstLinkman cstLinkman) {
        cstLinkmanMapper.insert(cstLinkman);
    }

    @Override
    public void del(CstLinkman cstLinkman) {
        cstLinkmanMapper.deleteByPrimaryKey(cstLinkman.getLkmId());
    }

    @Override
    public void edit(CstLinkman cstLinkman) {
        cstLinkmanMapper.updateByPrimaryKey(cstLinkman);
    }

    @Override
    public CstLinkman load(CstLinkman cstLinkman) {
        return cstLinkmanMapper.selectByPrimaryKey(cstLinkman.getLkmId()
        );
    }
}

package com.zking.crm.biz.impl;

import com.zking.crm.biz.ICstActivitiesBiz;
import com.zking.crm.mapper.CstActivityMapper;
import com.zking.crm.model.CstActivity;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CstActivitiesBizImpl implements ICstActivitiesBiz {

    @Autowired
    private CstActivityMapper cstActivityMapper;

    @Override
    public List<CstActivity> list(CstActivity activity, PageBean pageBean) {
        return cstActivityMapper.list(activity);
    }

    @Override
    public void add(CstActivity activity) {
        cstActivityMapper.insert(activity);
    }

    @Override
    public int del(CstActivity activity) {
        return cstActivityMapper.deleteByPrimaryKey(activity.getAtvId());
    }

    @Override
    public void edit(CstActivity activity) {
        cstActivityMapper.updateByPrimaryKey(activity);
    }

    @Override
    public CstActivity load(CstActivity activity) {
        return cstActivityMapper.load(activity);
    }
}

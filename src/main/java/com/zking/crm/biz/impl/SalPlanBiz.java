package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISalPlanBiz;
import com.zking.crm.mapper.SalPlanMapper;
import com.zking.crm.model.SalPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalPlanBiz implements ISalPlanBiz {

    @Autowired
    private SalPlanMapper salPlanMapper;

    @Override
    public void add(SalPlan salPlan) {
        salPlanMapper.insert(salPlan);
    }

    @Override
    public void del(SalPlan salPlan) {
        salPlanMapper.deleteByPrimaryKey(salPlan.getPlaId());
    }

    @Override
    public void edit(SalPlan salPlan) {
        salPlanMapper.updateByPrimaryKey(salPlan);
    }

    @Override
    public SalPlan load(SalPlan salPlan) {
        return salPlanMapper.selectByPrimaryKey(salPlan.getPlaId());
    }

    @Override
    public List<SalPlan> list(SalPlan salPlan) {
        return salPlanMapper.list(salPlan);
    }
}

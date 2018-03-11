package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISalChanceBiz;
import com.zking.crm.mapper.SalChanceMapper;
import com.zking.crm.model.SalChance;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalChanceBiz implements ISalChanceBiz {

    @Autowired
    private SalChanceMapper salChanceMapper;

    @Override
    public void add(SalChance salChance) {
        salChanceMapper.insert(salChance);
    }

    @Override
    public void del(SalChance salChance) {
        salChanceMapper.deleteByPrimaryKey(salChance.getChcId());
    }


    @Override
    public void edit(SalChance salChance) {
        salChanceMapper.updateByPrimaryKey(salChance);
    }

    @Override
    public List<SalChance> list(SalChance salChance, PageBean pageBean) {
        return salChanceMapper.list(salChance);
    }

    @Override
    public SalChance load(SalChance salChance) {
        return salChanceMapper.selectByPrimaryKey(salChance.getChcId());
    }

    @Override
    public void editStatusByDispatch(SalChance salChance) {
        salChanceMapper.editStatusByDispatch(salChance);
    }

    @Override
    public List<SalChance> listToPlan(SalChance salChance, PageBean pageBean) {
        return salChanceMapper.listToPlan(salChance);
    }

    @Override
    public void editStatusByPlan(SalChance salChance) {
        salChanceMapper.editStatusByPlan(salChance);
    }
}

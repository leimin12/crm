package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISalPlanBiz;
import com.zking.crm.model.SalPlan;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SalPlanBizTest extends BaseTest {

    private SalPlan salPlan;

    @Autowired
    private ISalPlanBiz salPlanBiz;

    @Before
    public void setUp() throws Exception {
        salPlan = new SalPlan();
    }

    @Test
    public void add() throws Exception {
        salPlan.setPlaChcId(17);
        salPlan.setPlaDate(new Date());
        salPlan.setPlaTodo("初步接触，了解客户意向22222222222");
        salPlanBiz.add(salPlan);
    }

    @Test
    public void del() throws Exception {
        salPlan.setPlaId(2);
        salPlanBiz.del(salPlan);
    }

    @Test
    public void edit() throws Exception {
        salPlan.setPlaId(2);
        salPlan.setPlaChcId(17);
        salPlan.setPlaDate(new Date());
        salPlan.setPlaTodo("初步接触");
        salPlanBiz.edit(salPlan);
    }

    @Test
    public void load() throws Exception {
        salPlan.setPlaId(2);
        SalPlan load = salPlanBiz.load(salPlan);
        System.out.println(load);
    }

    @Test
    public void list() throws Exception {
        salPlan.setPlaChcId(1);
        List<SalPlan> list = salPlanBiz.list(salPlan);
        for (SalPlan s : list) {
            System.out.println(s);
        }
    }

}
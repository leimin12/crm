package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISalChanceBiz;
import com.zking.crm.model.SalChance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SalChanceBizTest extends BaseTest{

    private SalChance salChance;

    @Autowired
    private ISalChanceBiz salChanceBiz;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        salChance = new SalChance();
    }

    @Test
    public void add() throws Exception {
        salChance.setChcSource("李先生fsfdas");
        salChance.setChcCustName("睿智数码");
        salChance.setChcRate(70);
        salChance.setChcDesc("由李先生介绍过来的");
        salChance.setChcTitle("采购笔记本电脑意向");
        salChance.setChcLinkman("刘先生");
        salChance.setChcTel("15773553792");
        salChance.setChcCreateId(1);
        salChance.setChcCreateBy("刘颖");
        salChanceBiz.add(salChance);
    }

    @Test
    public void del() throws Exception {
        salChance.setChcId(2);
        salChanceBiz.del(salChance);
    }

    @Test
    public void edit() throws Exception {
        salChance.setChcId(2);
        salChance.setChcSource("李先生aaaaaaaaaaaaa");
        salChance.setChcCustName("睿智数码");
        salChance.setChcRate(70);
        salChance.setChcDesc("由李先生介绍过来的");
        salChance.setChcTitle("采购笔记本电脑意向");
        salChance.setChcLinkman("刘先生");
        salChance.setChcTel("15773553792");
        salChance.setChcCreateId(1);
        salChance.setChcCreateBy("刘颖");
        salChanceBiz.edit(salChance);
    }

    @Test
    public void list() throws Exception {
        List<SalChance> list = salChanceBiz.list(salChance, null);
        for (SalChance s : list) {
            System.out.println(s);
        }
    }


    @Test
    public void load() throws Exception {
        salChance.setChcId(2);
        SalChance load = salChanceBiz.load(salChance);
        System.out.println(load);
    }

}
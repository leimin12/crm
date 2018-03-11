package com.zking.crm.biz;

import com.zking.crm.model.SalPlan;

import java.util.List;

public interface ISalPlanBiz {

    void add(SalPlan salPlan);

    void del(SalPlan salPlan);

    void edit(SalPlan salPlan);

    SalPlan load(SalPlan salPlan);

    List<SalPlan> list(SalPlan salPlan);

}

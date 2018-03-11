package com.zking.crm.biz;


import com.zking.crm.model.SalChance;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ISalChanceBiz {
    void add(SalChance salChance);
    void del(SalChance salChance);
    void edit(SalChance salChance);
    void editStatusByDispatch(SalChance salChance);
    List<SalChance> list(SalChance salChance, PageBean pageBean);

    SalChance load(SalChance salChance);

    List<SalChance> listToPlan(SalChance salChance, PageBean pageBean);

    void editStatusByPlan(SalChance salChance);
}

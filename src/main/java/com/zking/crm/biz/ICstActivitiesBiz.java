package com.zking.crm.biz;

import com.zking.crm.model.CstActivity;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICstActivitiesBiz {

    List<CstActivity> list(CstActivity activity, PageBean pageBean);

    void add(CstActivity activity);

    int del(CstActivity activity);

    void edit(CstActivity activity);

    CstActivity load(CstActivity activity);

}

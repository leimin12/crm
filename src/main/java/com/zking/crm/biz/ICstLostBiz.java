package com.zking.crm.biz;

import com.zking.crm.model.CstLost;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICstLostBiz {
    List<CstLost> list(CstLost cstLost, PageBean pageBean);

    void add(CstLost cstLost);

    int del(CstLost cstLost);

    void edit(CstLost cstLost);

    void edits(CstLost cstLost);

    CstLost load(CstLost cstLost);

}

package com.zking.crm.biz;

import com.zking.crm.model.CstLinkman;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICstLinkmanBiz {

    List<CstLinkman> listman(CstLinkman cstLinkman, PageBean pageBean);

    void add(CstLinkman cstLinkman);

    int del(CstLinkman cstLinkman);

    void edit(CstLinkman cstLinkman);

    CstLinkman load(CstLinkman cstLinkman);

    CstLinkman loadedit(CstLinkman cstLinkman);

}

package com.zking.crm.biz;

import com.zking.crm.model.CstLinkman;

import java.util.List;

public interface ILinkManBiz {

    List<CstLinkman> listman(CstLinkman cstLinkman);

    void add(CstLinkman cstLinkman);

    void del(CstLinkman cstLinkman);

    void edit(CstLinkman cstLinkman);

    CstLinkman load(CstLinkman cstLinkman);

}

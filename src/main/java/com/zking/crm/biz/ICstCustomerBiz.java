package com.zking.crm.biz;

import com.zking.crm.model.CstCustomer;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface ICstCustomerBiz {

    List<CstCustomer> list(CstCustomer cstCustomer, PageBean pageBean);

    void add(CstCustomer cstCustomer);

     void del(CstCustomer cstCustomer);

    void edit(CstCustomer cstCustomer);

    CstCustomer load(CstCustomer cstCustomer);

    List<CstCustomer> listregion(CstCustomer cstCustomer);



}

package com.zking.crm.biz;

import com.zking.crm.model.SvrSatisfy;
import com.zking.crm.util.PageBean;

import java.util.List;
public interface ISvrSatisfyBiz {
    void add(SvrSatisfy svrSatisfy);

     int del(SvrSatisfy svrSatisfy);

     void edit(SvrSatisfy svrSatisfy);

    SvrSatisfy load(SvrSatisfy svrSatisfy);

    List<SvrSatisfy> list(SvrSatisfy svrSatisfy, PageBean pageBean);

}

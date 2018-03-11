package com.zking.crm.biz.impl;

import com.zking.crm.biz.ICstCustomerBiz;
import com.zking.crm.mapper.CstCustomerMapper;
import com.zking.crm.model.CstCustomer;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CstCustomerBizImpl implements ICstCustomerBiz {

    @Autowired
    private CstCustomerMapper cstCustomerMapper;

    @Override
    public List<CstCustomer> list(CstCustomer cstCustomer, PageBean pageBean) {
        return cstCustomerMapper.list(cstCustomer);
    }

    @Override
    public void add(CstCustomer cstCustomer) {
        cstCustomerMapper.insert(cstCustomer);
    }

    @Override
    public void del(CstCustomer cstCustomer) {
        cstCustomerMapper.deleteByPrimaryKey(cstCustomer.getCustNo());
    }

    @Override
    public void edit(CstCustomer cstCustomer) {
        cstCustomerMapper.updateByPrimaryKey(cstCustomer);
    }

    @Override
    public CstCustomer load(CstCustomer cstCustomer) {
        return cstCustomerMapper.selectByPrimaryKey(cstCustomer.getCustNo());
    }

    @Override
    public List<CstCustomer> listregion(CstCustomer cstCustomer) {
        return cstCustomerMapper.listregion(cstCustomer);
    }




}

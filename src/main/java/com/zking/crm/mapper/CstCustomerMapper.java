package com.zking.crm.mapper;

import com.zking.crm.model.CstCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CstCustomerMapper {
    int deleteByPrimaryKey(String custNo);

    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);

    CstCustomer selectByPrimaryKey(String custNo);

    int updateByPrimaryKeySelective(CstCustomer record);

    int updateByPrimaryKey(CstCustomer record);

    List<CstCustomer> list(CstCustomer cstCustomer);

    List<CstCustomer> listregion(CstCustomer cstCustomer);

    List<CstCustomer> listmanagerid();

}
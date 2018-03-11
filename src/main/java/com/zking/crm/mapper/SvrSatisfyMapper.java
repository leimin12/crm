package com.zking.crm.mapper;

import com.zking.crm.model.SvrSatisfy;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SvrSatisfyMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(SvrSatisfy record);

    int insertSelective(SvrSatisfy record);

    SvrSatisfy selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(SvrSatisfy record);

    int updateByPrimaryKey(SvrSatisfy record);

    List<SvrSatisfy> list();
}
package com.zking.crm.mapper;

import com.zking.crm.model.Satisfy;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SatisfyMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Satisfy record);

    int insertSelective(Satisfy record);

    Satisfy selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Satisfy record);

    int updateByPrimaryKey(Satisfy record);

    List<Integer> doGetCount2(Satisfy satisfy);
}
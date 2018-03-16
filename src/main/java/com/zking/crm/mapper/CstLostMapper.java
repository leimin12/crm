package com.zking.crm.mapper;

import com.zking.crm.model.CstLost;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CstLostMapper {
    int deleteByPrimaryKey(Long lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    CstLost selectByPrimaryKey(Long lstId);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKeySelectives(CstLost record);

    int updateByPrimaryKey(CstLost record);

    List<CstLost> list(CstLost cstLost);
}
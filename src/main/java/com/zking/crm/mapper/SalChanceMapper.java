package com.zking.crm.mapper;

import com.zking.crm.model.SalChance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalChanceMapper {
    int deleteByPrimaryKey(Integer chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    SalChance selectByPrimaryKey(Integer chcId);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);

    List<SalChance> list(SalChance salChance);

    int editStatusByDispatch(SalChance salChance);

    List<SalChance> listToPlan(SalChance salChance);

    int editStatusByPlan(SalChance salChance);

}
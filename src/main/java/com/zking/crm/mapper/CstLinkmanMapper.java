package com.zking.crm.mapper;

import com.zking.crm.model.CstLinkman;
import com.zking.crm.model.DictIsEditable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface CstLinkmanMapper {
    int deleteByPrimaryKey(Long lkmId);

    int insert(CstLinkman record);

    int insertSelective(CstLinkman record);

    CstLinkman selectByPrimaryKey(Long lkmId);

    int updateByPrimaryKeySelective(CstLinkman record);

    int updateByPrimaryKey(CstLinkman record);

    List<CstLinkman> listman(CstLinkman cstLinkman);

    CstLinkman select(CstLinkman cstLinkman);

    CstLinkman selectedit(CstLinkman cstLinkman);
}
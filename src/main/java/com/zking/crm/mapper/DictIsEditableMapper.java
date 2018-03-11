package com.zking.crm.mapper;

import com.zking.crm.model.DictIsEditable;

public interface DictIsEditableMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(DictIsEditable record);

    int insertSelective(DictIsEditable record);

    DictIsEditable selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(DictIsEditable record);

    int updateByPrimaryKey(DictIsEditable record);
}
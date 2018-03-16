package com.zking.crm.biz.impl;

import com.zking.crm.biz.IDIctIsEditableBiz;
import com.zking.crm.mapper.DictIsEditableMapper;
import com.zking.crm.model.DictIsEditable;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DIctIsEditableBiz implements IDIctIsEditableBiz {
    @Autowired
    private DictIsEditableMapper dictIsEditableMapper;
    @Override
    public void add(DictIsEditable dictIsEditable) {
         dictIsEditableMapper.insert(dictIsEditable);
    }

    @Override
    public void del(DictIsEditable dictIsEditable) {
         dictIsEditableMapper.deleteByPrimaryKey(dictIsEditable.getDictId());
    }

    @Override
    public void eidt(DictIsEditable dictIsEditable) {
        dictIsEditableMapper.updateByPrimaryKeySelective(dictIsEditable);      }

    @Override
    public DictIsEditable load(DictIsEditable dictIsEditable) {
        return dictIsEditableMapper.selectByPrimaryKey(dictIsEditable.getDictId());
    }

    @Override
    public List<DictIsEditable> list(DictIsEditable dictIsEditable, PageBean pageBean) {
        return dictIsEditableMapper.list(dictIsEditable);
    }

    @Override
    public List<DictIsEditable> listType(DictIsEditable dictIsEditable) {
        return dictIsEditableMapper.listType(dictIsEditable);
    }
}

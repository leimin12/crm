package com.zking.crm.biz;

import com.zking.crm.model.DictIsEditable;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IDIctIsEditableBiz {
    void add(DictIsEditable dictIsEditable);

    void del(DictIsEditable dictIsEditable);

    void eidt(DictIsEditable dictIsEditable);

    DictIsEditable load(DictIsEditable dictIsEditable);

    List<DictIsEditable> list(DictIsEditable dictIsEditable, PageBean pageBean);

    List<DictIsEditable> listType(DictIsEditable dictIsEditable);
}

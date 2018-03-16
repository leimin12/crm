package com.zking.crm.biz;

import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IStorageBiz {
    void del(Storage storage);

    void add(Storage storage);

    void edit(Storage storage);

    Storage load(Storage storage);

    List<Storage> list(Storage storage, PageBean pageBean);
}

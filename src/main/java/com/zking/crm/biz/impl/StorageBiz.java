package com.zking.crm.biz.impl;

import com.zking.crm.biz.IStorageBiz;
import com.zking.crm.mapper.StorageMapper;
import com.zking.crm.model.Storage;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StorageBiz implements IStorageBiz {
    @Autowired
    private StorageMapper storageMapper;
    @Override
    public void del(Storage storage) {
        storageMapper.deleteByPrimaryKey(storage.getStkId());
    }

    @Override
    public void add(Storage storage) {
        storageMapper.insert(storage);
    }

    @Override
    public void edit(Storage storage) {
        storageMapper.updateByPrimaryKeySelective(storage);
    }

    @Override
    public Storage load(Storage storage) {
        return storageMapper.selectByPrimaryKey(storage.getStkId());
    }

    @Override
    public List<Storage> list(Storage storage, PageBean pageBean) {
        return storageMapper.list(storage);
    }
}

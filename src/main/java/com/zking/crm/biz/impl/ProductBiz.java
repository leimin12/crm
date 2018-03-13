package com.zking.crm.biz.impl;

import com.zking.crm.biz.IProductBiz;
import com.zking.crm.mapper.ProductMapper;
import com.zking.crm.model.Product;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductBiz implements IProductBiz {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public void del(Product product) {
        productMapper.deleteByPrimaryKey(product.getProdId());
    }

    @Override
    public void add(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void edit(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public Product load(Product product) {
        return productMapper.selectByPrimaryKey(product.getProdId());
    }

    @Override
    public List<Product> list(Product product, PageBean pageBean) {
        return productMapper.list(product);
    }
}

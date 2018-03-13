package com.zking.crm.biz;

import com.zking.crm.model.Product;
import com.zking.crm.util.PageBean;

import java.util.List;

public interface IProductBiz {
    void del(Product product);

    void add(Product product);

    void edit(Product product);

    Product load(Product product);

    List<Product> list(Product product, PageBean pageBean);
}

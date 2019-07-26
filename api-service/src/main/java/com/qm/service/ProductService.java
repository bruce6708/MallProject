package com.qm.service;

import com.qm.product.domain.Product;
import com.qm.product.domain.T_MALL_CLASS_1;

import java.util.List;

public interface ProductService {
    //根据id查询商品
    public Product getProductById(long id);


    //查询商品一级目录
    public List getClassList();
}

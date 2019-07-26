package com.qm.service;

import com.qm.product.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    //根据id查询商品
    public Product getProductById(long id);


    //查询商品一级目录
    public List getClassList();

    //根据一级类目id查询二级目录
    public List<Map> getClassList2(int flbh1);
}

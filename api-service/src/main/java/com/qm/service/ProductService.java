package com.qm.service;

import com.qm.product.domain.T_MALL_PRODUCT;

import java.util.List;
import java.util.Map;

public interface ProductService {
    //根据二级类目id查询商品列表
    public List<T_MALL_PRODUCT> getProductById(int flbh2);


    //查询商品一级目录
    public List getClassList();

    //根据一级类目id查询二级目录
    public List<Map> getClassList2(int flbh1);
}

package com.qm.service;

import com.qm.product.domain.Product;

public interface ProductService {
    //根据id查询商品
    public Product getProductById(long id);
}

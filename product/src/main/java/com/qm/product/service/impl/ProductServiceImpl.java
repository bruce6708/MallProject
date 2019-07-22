package com.qm.product.service.impl;

import com.qm.product.dao.ProductMapper;
import com.qm.product.domain.Product;
import com.qm.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    //注入Mapper类
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product getProductById(long id) {
        return productMapper.selectById(id);
    }
}

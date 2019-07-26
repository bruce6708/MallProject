package com.qm.product.service.impl;

import com.qm.product.dao.ProductMapper;
import com.qm.product.domain.Product;
import com.qm.product.domain.T_MALL_CLASS_1;
import com.qm.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    //注入Mapper类
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product getProductById(long id) {
        return productMapper.selectById(id);
    }

    @Override
    public List getClassList() {
        return productMapper.getClassList();
    }

    @Override
    public List<Map> getClassList2(int flbh1) {
        return productMapper.getClassList2(flbh1);
    }


}

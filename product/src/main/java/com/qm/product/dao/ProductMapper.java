package com.qm.product.dao;
import com.qm.product.domain.Product;
public interface ProductMapper {
    Product selectById(long id);
}

package com.qm.product.dao;
import com.qm.product.domain.Product;

import java.util.List;

public interface ProductMapper {
    Product selectById(long id);
    List getClassList();
}

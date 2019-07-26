package com.qm.product.dao;
import com.qm.product.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    Product selectById(long id);
    List getClassList();
    List<Map> getClassList2(int flbh1);
}

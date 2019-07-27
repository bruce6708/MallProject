package com.qm.product.dao;

import com.qm.product.domain.T_MALL_PRODUCT;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    List<T_MALL_PRODUCT> selectById(int flbh2);
    List getClassList();
    List<Map> getClassList2(int flbh1);
}

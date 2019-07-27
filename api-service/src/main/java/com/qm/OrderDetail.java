package com.qm;

import com.qm.product.domain.T_MALL_PRODUCT;

import java.io.Serializable;

/**
 * Created by wly on 2018/8/24.
 */
public class OrderDetail implements Serializable{
	private Long id;
	private Integer num;
	private T_MALL_PRODUCT product;

	public T_MALL_PRODUCT getProduct() {
		return product;
	}

	public void setProduct(T_MALL_PRODUCT product) {
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
}

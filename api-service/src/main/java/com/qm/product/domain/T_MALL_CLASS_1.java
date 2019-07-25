package com.qm.product.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 一级类目表
 */
@Entity
public class T_MALL_CLASS_1 {

@Id
	private int id;
	private String flmch1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlmch1() {
		return flmch1;
	}

	public void setFlmch1(String flmch1) {
		this.flmch1 = flmch1;
	}

}

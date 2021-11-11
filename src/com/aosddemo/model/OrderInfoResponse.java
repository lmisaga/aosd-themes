package com.aosddemo.model;

import com.aosddemo.entity.AbstractOrder;

/**
 * Simulating REST API response object, which would be created upon returning the service call value to the
 * Spring web layer
 */
public class OrderInfoResponse {

	private AbstractOrder order;

	public AbstractOrder getOrder() {
		return order;
	}

	public void setOrder(AbstractOrder order) {
		this.order = order;
	}
}

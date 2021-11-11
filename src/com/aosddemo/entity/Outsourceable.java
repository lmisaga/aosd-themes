package com.aosddemo.entity;

public interface Outsourceable {

	default boolean isOutsourced() {
		return false;
	}

}

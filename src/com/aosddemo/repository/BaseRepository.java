package com.aosddemo.repository;

import java.math.BigInteger;
import java.util.List;

import com.aosddemo.entity.AbstractOrder;

public interface BaseRepository<T> {

	T findById(BigInteger id);

	/**
	 * Returns all orders. Implemented just for clarity and credibility of the "real" repositories (Spring JPA...)
	 */
	List<? extends AbstractOrder> getAll();

}

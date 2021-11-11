package com.aosddemo.service;

import java.math.BigInteger;

import com.aosddemo.model.OrderInfoResponse;
import com.aosddemo.repository.OrderRepository;

/**
 *  Mock of a service layer handler, reflecting real conventional use case in Spring applications
 */
public class OrderService {

	// mocking dependency injection
	private static final OrderRepository orderRepository = new OrderRepository();

	public OrderInfoResponse findOrderById(int id) {
		OrderInfoResponse response = new OrderInfoResponse();
		System.out.println("[SERVICE] " + this.getClass().getSimpleName() + " is calling OrderRepository");
		response.setOrder(orderRepository.findById(BigInteger.valueOf(id)));
		return response;
	}

}

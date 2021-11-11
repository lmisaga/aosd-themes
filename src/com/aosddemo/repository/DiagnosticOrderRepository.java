package com.aosddemo.repository;

import com.aosddemo.entity.DiagnosticOrder;

/**
 * Simulating diagnostic order repository - ideally, this would, in practice, have more functionality and maybe more complex logic
 */
public class DiagnosticOrderRepository extends OrderRepository {

	public DiagnosticOrder findBySerialNumber(String serialNumber) {
		return (DiagnosticOrder) orderStorageMock.stream()
												 .filter(x -> x instanceof DiagnosticOrder && x.getDeviceSerialNumber().equals(serialNumber))
												 .findFirst()
												 .orElse(orderStorageMock.get(orderStorageMock.size()-1));
	}

}

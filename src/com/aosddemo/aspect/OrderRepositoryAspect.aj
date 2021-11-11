package com.aosddemo.aspect;

import org.aspectj.lang.annotation.Aspect;

import com.aosddemo.entity.AbstractOrder;
import com.aosddemo.entity.DiagnosticOrder;
import com.aosddemo.entity.ItemOrder;
import com.aosddemo.entity.Outsourceable;
import com.aosddemo.repository.DiagnosticOrderRepository;

@Aspect
public aspect OrderRepositoryAspect {

	pointcut callDiagnosticOrderRepositoryBySerialNumber(): execution(* com.aosddemo.repository.DiagnosticOrderRepository.findBySerialNumber(..));

	pointcut callOrderRepositoryById(): execution(* com.aosddemo.repository.OrderRepository.findById(..)) && cflow(call(* com.aosddemo.service.OrderService.*(..)));

	AbstractOrder around(): callOrderRepositoryById() {
		AbstractOrder order = proceed();
		System.out.println("[ASPECT] Aspect of OrderRepository.findById()");
		if (order instanceof ItemOrder) {
			if (Boolean.TRUE.equals(((ItemOrder) order).getDefective())) {
				System.out.println("[ASPECT] ItemOrder has defective item -> delegating to DiagnosticOrder");
				return new DiagnosticOrderRepository().findBySerialNumber(order.getDeviceSerialNumber());
			} else {
				return order;
			}
		}
		return handleDiagnosticOrder(order);
	}

	DiagnosticOrder around(): callDiagnosticOrderRepositoryBySerialNumber() {
		DiagnosticOrder originalReturnValue = proceed();
		System.out.println("[ASPECT] Aspect of DiagnosticOrderRepository.findBySerialNumber()");
		return handleDiagnosticOrder(originalReturnValue);
	}

	private DiagnosticOrder handleDiagnosticOrder(Object initialOrder) {
		DiagnosticOrder replacementOrder = new DiagnosticOrder();

		if (initialOrder instanceof Outsourceable) {
			if (((Outsourceable) initialOrder).isOutsourced()) {
				System.out.println("[ASPECT] Cracked cuckoo's egg -> returning empty response.");
				return replacementOrder;
			}
			System.out.println("[ASPECT] Returning diagnostic order -> no need for replacing with empty object");
			return (DiagnosticOrder) initialOrder;
		}
		return replacementOrder;
	}

}

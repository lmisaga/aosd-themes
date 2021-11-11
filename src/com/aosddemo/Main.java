package com.aosddemo;

import com.aosddemo.model.OrderInfoResponse;
import com.aosddemo.service.OrderService;

public class Main {

	public static void main(String[] args) {
		//predefined scenarios to show aspect functionality

		//mocking REST API endpoint controller with main method, and service layer by "injecting" OrderService
		OrderService service = new OrderService();

		//ItemOrder (defective) ID = 5
		System.out.println("[Mock REQUEST] A -> Get itemOrder which is defective");
		printResponse(service.findOrderById(5), RequestOrder.A);

		//DiagnosticOrder (outsource) ID = 4
		System.out.println("[Mock REQUEST] B -> Get diagnostic order which is outsource");
		printResponse(service.findOrderById(4), RequestOrder.B);

		//ItemOrder (regular) ID = 7
		System.out.println("[Mock REQUEST] C -> Get regular itemOrder");
		printResponse(service.findOrderById(7), RequestOrder.C);

		//ItemOrder (defective, DiagnosticOrder outsourced) ID = 6
		System.out.println("[Mock REQUEST] D -> Get itemOrder which is defective and has outsource DiagnosticOrder");
		printResponse(service.findOrderById(6), RequestOrder.D);

		//DiagnosticOrder (not outsource) ID = 3
		System.out.println("[Mock REQUEST] E -> Get diagnosticOrder which is not outsource");
		printResponse(service.findOrderById(3), RequestOrder.E);
	}

	private static void printResponse(OrderInfoResponse response, RequestOrder requestOrder) {
		System.out.println();
		System.out.print("[RESPONSE (" + requestOrder + ")]: ");
		System.out.println(response.getOrder().toString());
		System.out.println("-----------------------------------------------");
	}

	private enum RequestOrder {
		A, B, C, D, E
	}

}

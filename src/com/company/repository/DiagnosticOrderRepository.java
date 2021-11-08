package com.company.repository;

import java.util.Arrays;
import java.util.List;

import com.company.entity.DiagnosticOrder;

public class DiagnosticOrderRepository implements BaseRepository<DiagnosticOrder> {

	private static final List<DiagnosticOrder> diagnosticOrderStorageMock = Arrays.asList(
			new DiagnosticOrder(true, "SN1", "PART1", "OUTSRC"),
			new DiagnosticOrder(false, "SN2", "PART2", "REG"),
			new DiagnosticOrder(false, "SN3", "PART3", "REG"),
			new DiagnosticOrder(true, "SN4", "PART4", "OUTSRC"));

	@Override
	public DiagnosticOrder getOne() {
		return diagnosticOrderStorageMock.get(0);
	}

	@Override
	public List<DiagnosticOrder> getAll() {
		return diagnosticOrderStorageMock;
	}
}

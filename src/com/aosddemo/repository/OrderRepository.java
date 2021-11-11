package com.aosddemo.repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import com.aosddemo.entity.AbstractOrder;
import com.aosddemo.entity.DiagnosticOrder;
import com.aosddemo.entity.ItemOrder;

// repository like this is not entirely possible in Spring application, unless the order entities are marked with a discriminator value,
// then the repository would distinct between entities and would not result in ClassCastException
public class OrderRepository implements BaseRepository<AbstractOrder> {

	protected static final List<AbstractOrder> orderStorageMock = Arrays.asList(
			new DiagnosticOrder(1, false, "SN1", "PART1", "REG"),
			new DiagnosticOrder(2, false, "SN2", "PART2", "REG"),
			new DiagnosticOrder(3, false, "SN3", "PART3", "REG"),
			new DiagnosticOrder(4, true, "SNOSC1", "PART4", "OUTSRC"),
			new ItemOrder(5, BigDecimal.valueOf(100), "CUSTOMER1", "SN1", true),
			new ItemOrder(6, BigDecimal.valueOf(24), "CUSTOMER2", "SNOSC1", true),
			new ItemOrder(7, BigDecimal.valueOf(118), "CUSTOMER89", "SN552", false),
			new ItemOrder(8, BigDecimal.valueOf(111), "CUSTOMER1", "SN552", false),
			new ItemOrder(9, BigDecimal.valueOf(55), "CUSTOMER4", "SN987", true)
	);

	@Override
	public AbstractOrder findById(BigInteger id) {
		return orderStorageMock.stream()
							   .filter(x -> x.getId().equals(id))
							   .findFirst()
							   .orElse(orderStorageMock.get(0));
	}

	@Override
	public List<? extends AbstractOrder> getAll() {
		return orderStorageMock;
	}
}

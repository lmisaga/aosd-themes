package com.company.entity;

import java.math.BigInteger;

public class ItemOrder extends AbstractOrder {

	private BigInteger price;

	private String customerIdentifier;

	private String deviceSerialNumber;

	public ItemOrder(BigInteger price, String customerIdentifier, String deviceSerialNumber) {
		this.price = price;
		this.customerIdentifier = customerIdentifier;
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public BigInteger getPrice() {
		return price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public String getCustomerIdentifier() {
		return customerIdentifier;
	}

	public void setCustomerIdentifier(String customerIdentifier) {
		this.customerIdentifier = customerIdentifier;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}
}

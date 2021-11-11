package com.aosddemo.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ItemOrder extends AbstractOrder {

	private BigDecimal price;

	//not used yet
	private String customerIdentifier;

	private Boolean isDefective;

	public ItemOrder(Integer id, BigDecimal price, String customerIdentifier, String deviceSerialNumber, Boolean isDefective) {
		this.setId(BigInteger.valueOf(id));
		this.price = price;
		this.customerIdentifier = customerIdentifier;
		this.deviceSerialNumber = deviceSerialNumber;
		this.isDefective = isDefective;
	}

	public String toString() {
		String isDefectiveString = isDefective ? "is" : "is not";
		return "This is ItemOrder " +
			   "with serial number " +
			   this.deviceSerialNumber +
			   " and " + isDefectiveString + " defective";
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
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

	public Boolean getDefective() {
		return isDefective;
	}

	public void setDefective(Boolean defective) {
		isDefective = defective;
	}
}

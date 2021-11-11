package com.aosddemo.entity;

import java.math.BigInteger;

public abstract class AbstractOrder {

	private BigInteger id;

	protected String deviceSerialNumber;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}
}

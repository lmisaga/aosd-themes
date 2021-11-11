package com.aosddemo.entity;

import java.math.BigInteger;

public class DiagnosticOrder extends AbstractOrder implements Outsourceable {

	private Boolean isOutsource;

	private String replacementPartSerialNumber;

	private String departmentId;

	public DiagnosticOrder() {}

	public DiagnosticOrder(Integer id, Boolean isOutsource, String deviceSerialNumber, String replacementPartSerialNumber, String departmentId) {
		this.setId(BigInteger.valueOf(id));
		this.isOutsource = isOutsource;
		this.deviceSerialNumber = deviceSerialNumber;
		this.replacementPartSerialNumber = replacementPartSerialNumber;
		this.departmentId = departmentId;
	}

	public String toString() {
		String isOutsourceString = isOutsourced() ? "is" : "is not";
		return this.deviceSerialNumber != null ? "This is DiagnosticOrder " +
			   "with serial number " +
			   this.deviceSerialNumber +
			   " and " + isOutsourceString + " outsource" :
			   "This is DiagnosticOrder and has no serialNumber -> empty object";
	}

	public boolean isOutsourced() {
		return Boolean.TRUE.equals(getOutsource());
	}

	public Boolean getOutsource() {
		return isOutsource;
	}

	public void setOutsource(Boolean outsource) {
		isOutsource = outsource;
	}

	public String getReplacementPartSerialNumber() {
		return replacementPartSerialNumber;
	}

	public void setReplacementPartSerialNumber(String replacementPartSerialNumber) {
		this.replacementPartSerialNumber = replacementPartSerialNumber;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}

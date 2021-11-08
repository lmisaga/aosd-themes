package com.company.entity;

public class DiagnosticOrder extends AbstractOrder {

	private Boolean isOutsource;

	private String deviceSerialNumber;

	private String replacementPartSerialNumber;

	private String departmentId;

	public DiagnosticOrder(Boolean isOutsource, String deviceSerialNumber, String replacementPartSerialNumber, String departmentId) {
		this.isOutsource = isOutsource;
		this.deviceSerialNumber = deviceSerialNumber;
		this.replacementPartSerialNumber = replacementPartSerialNumber;
		this.departmentId = departmentId;
	}

	public Boolean getOutsource() {
		return isOutsource;
	}

	public void setOutsource(Boolean outsource) {
		isOutsource = outsource;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
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

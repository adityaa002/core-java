package com.rays.core.deepCloning;

public class Employee implements Cloneable {
	public String employeeName;
	public int employeeId;
	public String designation;

	public Employee(String employeeName, int employeeId, String designation) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.designation = designation;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

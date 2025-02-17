package com.rays.core.oopExercise;

public class Department implements Cloneable {

	public String employeeName;

	public int employeeId;

	public String employeeDesignation;

	public Department(String employeeName, int employeeId, String employeeDesignation) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

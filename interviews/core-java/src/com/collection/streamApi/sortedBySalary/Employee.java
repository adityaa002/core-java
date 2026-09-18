package com.collection.streamApi.sortedBySalary;

public class Employee {
	String name;
	int departmentId;

	public Employee(int departmentId , String name) {

		this.departmentId = departmentId;
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public int getDepartmentId() {
		return departmentId;
	}

}

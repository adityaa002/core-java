package com.rays.core.streamApi;

public class Employee {

	String name = null;
	double salary = 0;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

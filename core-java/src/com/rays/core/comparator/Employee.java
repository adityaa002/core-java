package com.rays.core.comparator;

public class Employee {

	public int id;
	public String name;
	public int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}

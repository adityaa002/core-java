package com.collection.comparator;

public class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
	}

}

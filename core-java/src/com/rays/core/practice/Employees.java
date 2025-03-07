package com.rays.core.practice;

public class Employees {
	int id;
	String name;
	String company;
	double salary;

	public Employees(int id, String name, String company, double salary) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + company + " " + salary + " ";
	}

}

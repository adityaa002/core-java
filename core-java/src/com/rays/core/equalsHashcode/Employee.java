package com.rays.core.equalsHashcode;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName() {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		String str = id + " " + name + "  " + salary;
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.id == emp.id && this.name == emp.name && this.salary == emp.salary;
	}

	@Override
	public int hashCode() {
		String str = id + " " + name + " " + salary;
		return str.hashCode();
	}
}

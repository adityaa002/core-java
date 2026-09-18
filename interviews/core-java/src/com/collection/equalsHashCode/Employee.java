package com.collection.equalsHashCode;

import java.util.ArrayList;
import java.util.Collection;

public class Employee {

	int id;
	String name;
	int salary;

	public Employee() {

	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("equals method");

		if (!(obj instanceof Employee)) {

			return false;
		}
		Employee emp = (Employee) obj;

		return this.id == emp.id && this.name == emp.name && this.salary == emp.salary;
	}

	@Override
	public int hashCode() {
System.out.println("Hashcode method");
		String str = id + " " + name + " " + salary;
		return str.hashCode();
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;

		return str;
	}

}

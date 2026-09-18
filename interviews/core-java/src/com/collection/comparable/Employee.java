package com.collection.comparable;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {

		/*
		 * if (this.id == e.id) { return this.name.compareTo(e.name); }
		 * 
		 * return this.id - e.id;
		 */

		if (this.id > e.id) {
			return 1; //
		}
		if (this.id < e.id) {
			return -1;
		}
		return 0;
		
	}

	@Override
	public String toString() {

		String str = id + " " + name + " " + salary;
		return str;
	}

}

package com.rays.core.oopExercise;

public class Employee implements Cloneable {

	public Department department;
	public Address address;

	public Employee(Department department, Address address) {

		this.department = department;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.department = (Department) emp.department.clone();
		emp.address = (Address) emp.address.clone();
		return emp;

	}

}

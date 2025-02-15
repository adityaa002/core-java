package com.rays.core.deepCloning;

public class Company implements Cloneable {

	public String companyName;
	public double salary;
	public Employee employee;

	public Company(String companyName, double salary, Employee employee) {
		this.companyName = companyName;
		this.salary = salary;
		this.employee = employee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Company c = (Company) super.clone();
		c.employee = (Employee) c.employee.clone();
		return c;
	}

}

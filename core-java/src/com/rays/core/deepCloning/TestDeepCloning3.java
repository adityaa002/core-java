package com.rays.core.deepCloning;

public class TestDeepCloning3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Aditya", 1242, "Backend Developer");
		Company c = new Company("Amdocs", 80000, emp);

		Company c1 = (Company) c.clone();

		Company c2 = (Company) c.clone();

		c1.employee.employeeName = "Shad";
		c1.employee.employeeId = 1987;
		c1.companyName = "TCS";
		c1.employee.designation = "Developer";
		c1.salary = 90000;

		c2.employee.employeeName = "Yusuff";
		c2.employee.employeeId = 8766;
		c2.companyName = "NCS";
		c2.employee.designation = "Full Stack Developer";
		c2.salary = 85000;

		System.out.println(c.employee.employeeName);
		System.out.println(c.employee.employeeId);
		System.out.println(c.companyName);
		System.out.println(c.employee.designation);
		System.out.println(c.salary);
		System.out.println();

		System.out.println(c1.employee.employeeName);
		System.out.println(c1.employee.employeeId);
		System.out.println(c1.companyName);
		System.out.println(c1.employee.designation);
		System.out.println(c1.salary);
		System.out.println();

		System.out.println(c2.employee.employeeName);
		System.out.println(c2.employee.employeeId);
		System.out.println(c2.companyName);
		System.out.println(c2.employee.designation);
		System.out.println(c2.salary);
		System.out.println();

	}

}

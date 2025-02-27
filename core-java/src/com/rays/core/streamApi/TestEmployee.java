package com.rays.core.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList();
		emp.add(new Employee("Aditya", 20000));
		emp.add(new Employee("Aditya", 20000));
		emp.add(new Employee("Rohan", 25000));
		emp.add(new Employee("Neha", 30000));
		emp.add(new Employee("Amit", 28000));
		emp.add(new Employee("Pooja", 35000));
		emp.add(new Employee("Suresh", 22000));
		emp.add(new Employee("Kavita", 27000));
		emp.add(new Employee("Manish", 32000));
		emp.add(new Employee("Sneha", 29000));
		emp.add(new Employee("Vikram", 31000));

		double secondHighestSalary = emp.stream().map(e -> e.salary).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElse(0.0);

		System.out.println("Second Highest salary : " + secondHighestSalary);
	}

}

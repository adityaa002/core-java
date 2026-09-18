package com.collection.comparator;

import java.util.Comparator;

public class OrderBySalaryDsc implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
 		return o2.salary - o1.salary;
	}

}

package com.collection.comparator;

import java.util.Comparator;

public class OrderBySalaryAsc implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
 		return o1.salary - o2.salary;
	}

}

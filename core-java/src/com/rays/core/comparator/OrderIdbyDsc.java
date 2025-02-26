package com.rays.core.comparator;

import java.util.Comparator;

public class OrderIdbyDsc implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {

		return e2.id - e1.id;
	}

}

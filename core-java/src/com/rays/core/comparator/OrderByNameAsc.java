package com.rays.core.comparator;

import java.util.Comparator;

public class OrderByNameAsc implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}

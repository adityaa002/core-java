package com.rays.core.comparator;

import java.util.Comparator;

public class Duplicacy implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if (e1.id == e2.id) {
			return e1.name.compareTo(e2.name);
		}
		return e1.id - e2.id;
	}
}

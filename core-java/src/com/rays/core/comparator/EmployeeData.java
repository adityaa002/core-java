package com.rays.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeData {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(104, "Vijay", 9000));
		list.add(new Employee(102, "Devansh", 6000));
		list.add(new Employee(102, "Yusuf", 7000));
		list.add(new Employee(101, "Aditya", 6000));
		list.add(new Employee(103, "Shad", 5000));
		list.add(new Employee(105, "Carl", 4000));
		Collections.sort(list, new Duplicacy());
		for (Object object : list) {
			System.out.println(object);
		}

	}

}

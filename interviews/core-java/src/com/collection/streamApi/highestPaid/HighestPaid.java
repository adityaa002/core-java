package com.collection.streamApi.highestPaid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPaid {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Aditya", 740000));
		list.add(new Employee("Amit", 20000));
		list.add(new Employee("Vedik", 340000));
		list.add(new Employee("Chetan", 430000));
		list.add(new Employee("Yusuf", 450000));

		List<Employee> highestPaid = list.stream()
				.filter(e -> e.getSalary() > 250000)
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toCollection(ArrayList::new));

		highestPaid.forEach(e -> System.out.println(e.getName() + "  " + e.getSalary()));

	}

}

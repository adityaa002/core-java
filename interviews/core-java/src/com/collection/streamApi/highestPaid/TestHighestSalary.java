package com.collection.streamApi.highestPaid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestHighestSalary {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(2000);
		list.add(1000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(6000);

		System.out.println("Highest salary: ");
		list.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));
		
		System.out.println("Second Highest:");
		list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e -> System.out.println(e));

	}
}

package com.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(101, "abc", 1000));
		list.add(new Employee(102, "def", 2000));
		list.add(new Employee(103, "ghi", 3000));
		list.add(new Employee(104, "jkl", 4000));
		list.add(new Employee(105, "mno", 5000));

		// Collections.sort(list, new OrderByIdAsc());
		// Collections.sort(list , new OrderByIdDesc());
		// Collections.sort(list, new OrderByNameAsc());
		// Collections.sort(list, new OrderByNameDsc());
		// Collections.sort(list, new OrderBySalaryAsc());
		 Collections.sort(list, new OrderBySalaryDsc());

		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}

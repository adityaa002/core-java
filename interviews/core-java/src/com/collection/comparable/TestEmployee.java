package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestEmployee {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(101, "abc", 1000));
		list.add(new Employee(102, "def", 2000));
		list.add(new Employee(101, "ghi", 3000));
		list.add(new Employee(104, "jkl", 4000));
		list.add(new Employee(105, "mno", 5000));

		Collections.sort(list);

		for(Object object : list) {
			System.out.println(object);
		}
	}

}

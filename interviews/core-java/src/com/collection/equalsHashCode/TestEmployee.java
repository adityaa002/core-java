package com.collection.equalsHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "abc", 4000);
		Employee e2 = new Employee(101, "abc", 4000);

		System.out.println("Emp 1 : " + e1);
		System.out.println("Emp 2 : " + e2);

		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		Set set = new HashSet();

		set.add(e1);
		set.add(e2);
		System.out.println("Set : " + set);

		List list = new ArrayList();

		list.add(new Employee(101, "abc", 1000));
		list.add(new Employee(102,"def", 2000));
		System.out.println();
		
		
		System.out.println("Moving to list");

		System.out.println("List : " + list);
		System.out.println("List :: " + list.remove(new Employee(101, "abc", 1000)));

		System.out.println("List : " + list);
		
		
		System.out.println();
		System.out.println();
		
		
	}
}

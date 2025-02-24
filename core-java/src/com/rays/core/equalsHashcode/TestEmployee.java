package com.rays.core.equalsHashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Aditya", 10000);
		Employee e2 = new Employee(102, "Shad", 2000);
		Employee e3 = new Employee(103, "Yusuff", 30000);
		Employee e4 = new Employee(103, "Yusuff", 30000);

		System.out.println("Employee 1 : " + e1);
		System.out.println("Employee 2 : " + e2);
		System.out.println("Employee 3 : " + e3);
		System.out.println("Employee 4 : " + e4);

		System.out.println(e3.equals(e4));

		Set set = new HashSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println("Set : " + set);

		List list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println("List " + list);

		System.out.println(list.remove(new Employee(103, "Yusuff", 30000)));

		System.out.println("New list :" + list);
	}
}

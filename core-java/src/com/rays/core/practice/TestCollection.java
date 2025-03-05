package com.rays.core.practice;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Aditya");
		c.add("Sharma");

		c.add("Carl");
		c.add("Johns");

		System.out.println("Length of collection : " + c.size());

		for (Object obj : c) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("As Array");
		Object[] oArr = c.toArray();
		for (Object obj : oArr) {
			String str = (String) obj;
			System.out.println(str);
		}

	}
}

package com.rays.core.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Aditya");
		c.add("Sharma");

		c.add("Carl");
		c.add("Johns");

		Iterator it = c.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}
}

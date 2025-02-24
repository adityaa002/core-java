package com.rays.core.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CustomCollection {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");

		System.out.println(c);

		Collection c1 = new ArrayList();
		c1.add("e");
		c1.add("e");
		c1.add("f");
		c1.add("g");
		c1.add("h");

		System.out.println(c1);

		c.addAll(c1);

		System.out.println(c.isEmpty());

		c.removeAll(c1);
		System.out.println(c);
		System.out.println(c1);

		c.addAll(c1);
		System.out.println(c);

		c.removeAll(c1);
		System.out.println(c);

		c1.add("a");
		System.out.println(c);

		// c.clear();
		System.out.println(c);
		c.addAll(c1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c.containsAll(c1));

		c.retainAll(c1);

		c1.retainAll(c);
		System.out.println(c);
		System.out.println(c1);
		c.size();
		c1.size();

	}
}

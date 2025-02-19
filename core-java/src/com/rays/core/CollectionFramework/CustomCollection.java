package com.rays.core.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CustomCollection {
	public static void main(String[] args) {

		Collection l1 = new ArrayList();

		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);

		System.out.println(l1);

		l1.add(6);

		System.out.println(l1);

		ArrayList l2 = new ArrayList();
		l2.add('a');
		l2.add('b');
		l2.add('c');
		l2.add('d');
		l2.add('e');

		System.out.println(l2);

		System.out.println(l1.isEmpty());

		System.out.println(l1.contains(4));

		l1.addAll(l2);
		System.out.println(l1);

		System.out.println();
		l1.containsAll(l2);
		l1.remove(6);
		System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);
	}
}

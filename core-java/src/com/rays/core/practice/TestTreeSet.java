package com.rays.core.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set s = new TreeSet();
		s.add(50);
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(20);

		Iterator it = s.iterator();
		while (it.hasNext()) {
			int i = (int) it.next();
			System.out.println(i);
		}
	}

}

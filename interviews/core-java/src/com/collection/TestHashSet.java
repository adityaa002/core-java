package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		Set s1 = new HashSet();

		s1.add(1);
		s1.add(1);
		s1.add("two");
		s1.add(4);
		s1.add(null);
		s1.add(null);
		s1.add("one");
		System.out.println(s1);
	}

}

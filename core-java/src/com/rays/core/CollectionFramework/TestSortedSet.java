package com.rays.core.CollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		s.add("d");
		s.add("a");
		s.add("c");
		s.add("b");
		
		System.out.println(s);
		
		System.out.println(s.first());
		System.out.println(s.last());
	}
}

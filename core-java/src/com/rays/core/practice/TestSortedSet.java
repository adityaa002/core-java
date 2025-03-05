package com.rays.core.practice;

import java.util.SortedSet;
import java.util.TreeSet;

import com.rays.core.CollectionFramework.SortedMapTest;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();

		s.add("ghi");
		s.add("abc");
		s.add("def");

		for (Object object : s) {
			System.out.println(object);
		}
		System.out.println("First element:");
		System.out.println(s.first());
		System.out.println("Last element:");
		System.out.println(s.last());

		s.headSet("zero");

		s.tailSet("abstract");
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s);

	}

}

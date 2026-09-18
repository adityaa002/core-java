package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface1 {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add(300);
		s.add(900);
		s.add(700);
		s.add(100);
		s.add(100);
		s.add(400);
		s.add(800);
		s.add(500);
		s.add(600);
		s.add(200);

		System.out.println(s);
		
		System.out.println(s.first()); 
		System.out.println(s.last());
		
		System.out.println(s.tailSet(300));
		System.out.println(s.headSet(300));

	}

}

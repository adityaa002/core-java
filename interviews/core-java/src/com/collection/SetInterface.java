package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);

		System.out.println(hs);

		System.out.println(hs.contains(30));
		System.out.println(hs.isEmpty());
		// System.out.println(hs.remove(40));
		System.out.println(hs);
		System.out.println(hs.size());

		
		System.out.println("============+++++++++++++++++===========");
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);

		System.out.println(ts.contains(30));
		System.out.println(ts.ceiling(33));
		System.out.println(ts.first());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts.size());
		System.out.println(ts);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		
		System.out.println(lhs.contains(20));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(40));
		System.out.println(lhs.hashCode());
		System.out.println(lhs.toArray() );
		

	}

}

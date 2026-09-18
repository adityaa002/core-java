package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);

		c2.add(40);
		c2.add(50);
		c2.add(60);
		c2.add(null);

		// c1.addAll(c2);
		//System.out.println(c1);
		//System.out.println(c2);
		// c1.remove(30);
		//System.out.println(c1);
		// c1.removeAll(c2);
		//System.out.println(c1);

		 c1.retainAll(c2);
		System.out.println(c1);

		// c1.clear();
		//System.out.println(c1);
		//System.out.println(c1.size());
		//System.out.println(c1.isEmpty());
	}
}

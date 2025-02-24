package com.rays.core.CollectionFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {
		SortedMap sm = new TreeMap();

		sm.put(3, "Aditya");
		sm.put(1, "Thor");
		sm.put(4, "Vijay");
		sm.put(2, "Tony");
		System.out.println(sm);

	}

}

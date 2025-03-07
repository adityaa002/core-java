package com.rays.core.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(20);
		ls.add(50);
		ls.add(60);
		ls.add(10);
		ls.add(40);
		ls.add(30);

		Iterator it = ls.iterator();
		while (it.hasNext()) {
			int i =   (int) it.next();
			System.out.println(i);
		}

	}

}

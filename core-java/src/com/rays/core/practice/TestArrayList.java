package com.rays.core.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("abc");
		l.add("def");
		l.add("ghi");

		l.add("jkl");

		Iterator it = l.iterator();  //java.util.ConcurrentModificationException
		l.add("mno");
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

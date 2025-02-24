package com.rays.core.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);

		System.out.println(l);
		l.remove(2);
		l.add(2, 3);
		System.out.println(l);
		l.set(3, 40);
		System.out.println(l);
		System.out.println(l.subList(2, 5));
	}

}

package com.rays.core.practice;

import java.util.ArrayList;

public class TestArrayListIterator {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);

		for (Object obj : l) {
			System.out.println(obj);
		}
	}
}

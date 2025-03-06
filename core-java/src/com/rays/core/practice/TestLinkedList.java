package com.rays.core.practice;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);

		// LinkedListt

		System.out.println(ll.get(2));
		for (Object object : ll) {
			System.out.println(object);

		}

	}

}

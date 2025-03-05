package com.rays.core.practice;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList();

		q.add("a");
		q.add("c");
		q.add("b");

		q.offer("f");

		q.poll();

		for (Object object : q) {
			System.out.println(object);
		}
	}
}

package com.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInt {

	public static void main(String[] args) {

		Queue q = new ArrayBlockingQueue(3);

		q.add(10);
		q.add(20);
		q.add(30);
		
		
		System.out.println(q.offer(40));
		System.out.println(q.add(40));
	}
}

package com.javabasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;


public class TestQueue {
	public static void main(String[] args) {
		Queue q = new PriorityBlockingQueue(4);
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		System.out.println(q);
		
		System.out.println(q.offer(50));
		System.out.println(q.add(60));
		
		System.out.println(q);
		
	}
}

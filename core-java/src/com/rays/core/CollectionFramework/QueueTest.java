package com.rays.core.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	 public static void main(String[] args) {
		Queue q = new  LinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.offer(3));
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
	System.out.println(q);
	
	
	System.out.println(q.remove());
	System.out.println(q.remove());
	System.out.println(q.remove());
	System.out.println(q.remove());
	System.out.println(q);
	System.out.println(q.peek());
 	}

}

package com.rays.core.threads;

public class TestPriority {

	public static void main(String[] args) {
		PriorityThread p1 = new PriorityThread("abc");
		PriorityThread p2 = new PriorityThread("xyz");

		p1.setPriority(1);
		p2.setPriority(5);
		
//		int i = p1.getPriority();
//		int j = p2.getPriority();
//		
		p1.start();
		p2.start();
	  	}
}

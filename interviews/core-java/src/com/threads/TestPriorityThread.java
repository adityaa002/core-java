package com.threads;

public class TestPriorityThread {
	public static void main(String[] args) {

		UsingPriorityThread p1 = new UsingPriorityThread("abc");
		UsingPriorityThread p2 = new UsingPriorityThread("xyz");

		p1.start();
		p1.setPriority(10);
		p2.start();
	}
}

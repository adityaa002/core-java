package com.rays.core.threads;

public class JoinWithThread {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("abc");
		JoinThread t2 = new JoinThread("xyz");

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
	}
}

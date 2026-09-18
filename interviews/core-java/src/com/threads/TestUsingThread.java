package com.threads;

public class TestUsingThread {
	public static void main(String[] args) {
		UsingJoin t1 = new UsingJoin("abc");
		UsingJoin t2 = new UsingJoin("xyz");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();


	}

}

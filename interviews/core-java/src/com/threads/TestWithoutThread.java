package com.threads;

public class TestWithoutThread {
	public static void main(String[] args) {
		WithoutThread t1 = new WithoutThread("Main Thread");
		WithoutThread t2 = new WithoutThread("Second Thread");
		
		t1.run();
		t2.run();
	}

}

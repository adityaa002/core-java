package com.rays.core.threads;

public class TestWithThreads {
	public static void main(String[] args) {
		WithThreads t1 = new WithThreads("abc");
		WithThreads t2 = new WithThreads("xyz");

		t1.start();

		t2.start();
	}

}

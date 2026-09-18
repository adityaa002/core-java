package com.threads;

public class TestWithThread {
	public static void main(String[] args) {

		WithThread t1 = new WithThread("Thread one");
		WithThread t2 = new WithThread("Thread Two");

		t1.start();
		t2.start();
	}
}

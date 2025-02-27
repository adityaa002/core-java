package com.rays.core.threads;

public class TestWithoutThreads {

	public static void main(String[] args) {
		WithoutThread t = new WithoutThread("abc");
		WithoutThread t1 = new WithoutThread("xyz");

		t.runn();
		t1.runn();
	}

}

package com.oop.overloading;

public class TestOverLoading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		TestOverLoading o = new TestOverLoading();

		System.out.println(o.sum(2, 3));
		System.out.println(o.sum(2, 4, 5));
	}

}

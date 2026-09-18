package com.threads;

public class TestRacing {
	public static void main(String[] args) {

		Racing r1 = new Racing("Aditya");
		Racing r2 = new Racing("Chetan");

		r1.start();
		r2.start();

	}

}

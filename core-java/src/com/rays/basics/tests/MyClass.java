package com.rays.basics.tests;

public class MyClass {
	String name;
	public static int averageAge;
	String firstName;

	public static final int BATCH = 2025;

	public void details() {
		firstName = "Aditya";
		averageAge = 22;
		System.out.println("Batch of :  " + BATCH);

	}

	public static void printHello(String name) {
		System.out.println("name : " + name);
	}

	public static void additiion(int a, int b) {
		int sum = a + b;
		System.out.println("Division : " + sum);

	}

	public static void multiply(int a, int b) {
		int sum = a * b;
		System.out.println("Multiplication : " + sum);

	}

	public static void printTableTwo(int n) {

		System.out.println("Table of two ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * 2 + " ");

		}

	}

	public static void divide(int a, int b) {
		int sum = a / b;
		System.out.println("Division : " + sum);
	}

	public static void palindrome(int n) {
		int number = n;
		int r = 0;
		int sum = 0;
		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == n) {
			System.out.println(n + "Number is palindrome");
		}

	}

}

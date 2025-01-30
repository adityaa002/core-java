package com.rays.basics.practice;

public class MethodToCall {

	public void getDivision(int a, int b) {
		int sum = a / b;
		System.out.println("Sum : " + sum);
	}

	public void getAddition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);

	}

	String name;
	int age;

	public final static int DOB = 2025;

	public static void getDetails(String name, int age) {
		System.out.println(name + " " + age + " " + DOB);

	}

	public void getSubtrtaction(int a, int b) {
		int sum = a-b;
		System.out.println("Subtraction : "+ sum);

	}

	public int getMultiplication(int a, int b) {
		System.out.println("Multiplication :");
		return a*b;
	}

}

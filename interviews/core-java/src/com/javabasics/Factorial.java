package com.javabasics;

public class Factorial {

	public static void main(String[] args) {

		int num = 5;
		int fact = 1;

		while (num > 0) {
			fact = num * fact;
			num--;
		}
		System.out.println(fact);
	}
}

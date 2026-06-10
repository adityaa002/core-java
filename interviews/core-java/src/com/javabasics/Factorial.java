package com.javabasics;

public class Factorial {

	public static void main(String[] args) {
		int num = 4;
		int result = 1;

		while (num > 0) {
			result = result * num;
			num--;
		}
		System.out.println(result);
	}
}

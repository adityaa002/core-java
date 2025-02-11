package com.rays.core.loops;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 4321;

		int reverseNumber = 0;

		int n = number;

		int r;

		while (n > 0) {

			r = n % 10;

			reverseNumber = (reverseNumber * 10) + r;

			n = n / 10;

		}

		System.out.println("Reverse number : " + reverseNumber);

	}

}

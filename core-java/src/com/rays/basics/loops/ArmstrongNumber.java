package com.rays.basics.loops;

public class ArmstrongNumber {

	public void ast(int n) {
		int r = 0;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}

		if (sum == n) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("number isn't palindrome");
		}

	}

}

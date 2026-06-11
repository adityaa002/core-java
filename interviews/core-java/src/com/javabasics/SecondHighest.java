package com.javabasics;

public class SecondHighest {
	public static void main(String[] args) {

		int[] num = { 4, 2, 3 };

		int highest = 0;
		int secondHighest = 0;

		for (int i = 0; i < num.length; i++) {
			if (highest < num[i]) {
				secondHighest = highest;
				highest = num[i];

			}

			if (secondHighest < num[i] && highest > num[i]) {
				secondHighest = num[i];

			}
		}

		System.out.println("Highest : " + highest);
		System.out.println("Second Highest : " + secondHighest);
	}

}

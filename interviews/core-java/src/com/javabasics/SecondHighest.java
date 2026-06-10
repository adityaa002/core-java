package com.javabasics;

public class SecondHighest {
	public static void main(String[] args) {

		int highest = 0;
		int secondHighest = 0;

		int[] num = { 33, 44, 55, 11, 22, 65, 23, 6, 24, 2, 3, 5, 9, 8, 77, 65, 54 };

		for (int i = 0; i < num.length; i++) {

			if (highest < num[i]) {
				secondHighest = highest;
				highest = num[i];
			}
			if (secondHighest < num[i] && highest > num[i]) {
				secondHighest = num[i];
			}
		}
		System.out.println(highest);
		System.out.println(secondHighest);

	}

}

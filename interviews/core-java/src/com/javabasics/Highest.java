package com.javabasics;

public class Highest {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 9, 5, 2, 6, 1, 0 };

		int highest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (highest < arr[i]) {
				highest = arr[i];
			}
		}
		System.out.println(highest);

	}
}

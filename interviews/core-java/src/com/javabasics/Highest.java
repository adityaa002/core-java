package com.javabasics;

public class Highest {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 9,5, 2, 6, 1, 0 };

		int highest = 0;

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];

			if (highest < temp) {
				highest = temp;
			}
		}

		System.out.println("Highest in array is : " + highest);
	}
}

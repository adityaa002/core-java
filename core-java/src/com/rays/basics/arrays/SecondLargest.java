package com.rays.basics.arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int highest = 0;
		int secondhighest = 0;
		int[] arr = { 2, 3, 6, 5, 9, 4, 8 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondhighest = highest;
				highest = arr[i];

			}

			if (arr[i] < highest && arr[i] > secondhighest) {

				secondhighest = arr[i];
			}
		}
		System.out.println("Highest : " + highest);
		System.out.println("Second Highest : " + secondhighest);

	}

}

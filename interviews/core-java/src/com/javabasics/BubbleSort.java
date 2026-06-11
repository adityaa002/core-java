package com.javabasics;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 33, 44, 55, 11, 22, 65, 23, 6, 24, 2, 3, 5, 9, 8, 77, 65, 54 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " \t");
		}

	}
}

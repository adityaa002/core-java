package com.rays.core.arrays;

public class FindNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 6, 5, 8, 2, 0, 9 };
		int ToFind = 4;
		// int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == ToFind) {
				System.out.println("Number Exist");
			} 
			
		}
	}
}

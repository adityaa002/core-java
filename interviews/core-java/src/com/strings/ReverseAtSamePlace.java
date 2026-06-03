package com.strings;

public class ReverseAtSamePlace {
	public static void main(String[] args) {

		String name = "Aditya Sharma";

		String[] arr = name.split(" ");

		for (int i = 0; i < arr.length; i++) {

			String ss = arr[i];

			for (int j = ss.length() - 1; j >= 0; j--) {
				System.out.print(ss.charAt(j));
			}
			System.out.println();
		}
	}
}
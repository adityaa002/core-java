package com.strings;

public class ReverseAtSamePlace {
	public static void main(String[] args) {

		String s = "aditya sharma";

		String[] c = s.split(" ");

		for (int i = 0; i < c.length; i++) {

			String ss = c[i];

			for (int j = ss.length() - 1; j >= 0; j--) {
				System.out.print(ss.charAt(j));
			}

			System.out.print(" ");
		}

	}
}
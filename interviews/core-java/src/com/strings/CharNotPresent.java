package com.strings;

public class CharNotPresent {
	public static void main(String[] args) {

		String str = "introduction";

		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == c) {
					count++;
				}

			}
			if (count == 0) {
				System.out.print(c + " , ");
			}
		}
	}
}

package com.strings;

public class DigitInString {
	public static void main(String[] args) {
		String s = "introducti76on";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}

	}
}

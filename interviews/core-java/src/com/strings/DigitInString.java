package com.strings;

public class DigitInString {

	public static void main(String[] args) {

		String str = "adi0123tyaSharma9779";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}

	}
}

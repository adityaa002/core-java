package com.strings;

public class PalindromeString {
	public static void main(String[] args) {

		String s = "raadar";

		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			r += s.charAt(i);

		}
		if (r.equals(s)) {
			System.out.println(r + " is a palindrome..!");
		}else {
			System.out.println(r + " is not a palindrome..!");

		}
	}
}

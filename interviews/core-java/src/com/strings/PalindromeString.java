package com.strings;

public class PalindromeString {
	public static void main(String[] args) {

		String s = "aditya";
		String ss = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			ss += s.charAt(i);
		}
		if (ss.equals(s)) {
			System.out.println(s + " is a palindrome String");
		} else {
			System.out.println(s + " isn't a palindrome String");
		}
	}
}

package com.strings;

public class CasePattern {
	public static void main(String[] args) {

		String s = "introduction";

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0) {
				String ss = String.valueOf(s.charAt(i));
				System.out.print(ss.toUpperCase());
			} else {
				String ss = String.valueOf(s.charAt(i));
				System.out.print(ss.toLowerCase());
			}
		}

	}
}

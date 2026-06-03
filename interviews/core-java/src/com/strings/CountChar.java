package com.strings;

public class CountChar {

	public static void main(String[] args) {

		String s = "introduction";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				count++;
			}
		}
		System.out.println("i = " + count);

	}
}
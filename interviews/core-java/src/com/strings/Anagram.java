package com.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String a = "listen";
		String b = "silent";

		String aa = a.toLowerCase();
		String bb = b.toLowerCase();

		char[] c = aa.toCharArray();
		char[] d = bb.toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		if (Arrays.equals(c, d)) {
			System.out.println("given string " + a + " and " + b + " are Anagram !");
		} else {
			System.out.println("given string " + a + " and " + b + " aren't Anagram !");

		}

	}
}

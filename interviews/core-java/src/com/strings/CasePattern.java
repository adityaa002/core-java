package com.strings;

public class CasePattern {
	public static void main(String[] args) {

		String s = "aditya";

		for (int i = 0; i < s.length(); i++) {
			
			if(i%2==0) {
			String a =	String.valueOf(s.charAt(i));
				System.out.print(a.toUpperCase());
			} else {
				String b =	String.valueOf(s.charAt(i));
				System.out.print(b.toLowerCase());
			}
		}

	}
}

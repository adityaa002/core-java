package com.strings;

public class CountChar {

	public static void main(String[] args) {

		String s = "aditya";
		int count = 0 ;

		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)=='a') {
				count++;
			}
			
			
		}
		System.out.println("a comes " +count+" times ..!" );

	}
}
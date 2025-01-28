package com.rays.basics.strings;

public class ReverseString {
	public static void main(String[] args) {

		String name = "Vijay dinanath chauhan";
		for(int i = name.length() -1 ; i >=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
}

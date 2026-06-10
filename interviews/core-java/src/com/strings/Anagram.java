package com.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String a = "adi";
		String b = "ida";

		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		
		Arrays.sort(aa);
		Arrays.sort(bb);
		
		if(Arrays.equals(aa,bb)) {
			System.out.println("Given String '"+ a +"' is anagram..!");
		}else {
			System.out.println("Given String '"+ a +"' is not anagram..!");

		}
		
		
	}
}

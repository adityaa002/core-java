package com.rays.core.dates;

public class PrimitiveToString {
	public static void main(String[] args) {
		String str = String.valueOf(10);
		System.out.println(str);
		
		String str1 = String.valueOf(0.1f);
		System.out.println(str1);

		String str2 = String.valueOf(10.22D);
		System.out.println(str2);
		
		String str3 = String.valueOf('a');
		System.out.println(str3);
		
		String str4 = String.valueOf(true);
		System.out.println(str4);
		
		String str5 = String.valueOf(5L);
		System.out.println(str5);
 	}
	
	
}

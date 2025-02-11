package com.rays.core.practice;

public class PrimitiveToString {
	public static void main(String[] args) {
		
		System.out.println("Conversion from Primmitive to String");
		
		String str = String.valueOf(5);
		System.out.println(str);
		
		String str1 = String.valueOf(4.4f);
		System.out.println(str1);
		
		String str2 = String.valueOf(3.3D);
		System.out.println(str2);
		
		String str3 = String.valueOf('a');
		System.out.println(str3);
		
		String str4 = String.valueOf(1000000L);
		System.out.println(str4);
		
		String str5 = String.valueOf(true);
		System.out.println(str5);
	}

}

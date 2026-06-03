package com.strings;

public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("adityaaaa");
		
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer(5);
		sb1.append("adityaa");
		System.out.println(sb1);
		System.out.println(sb1.capacity());

	}

}

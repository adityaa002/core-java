package com.rays.core.strings;

public class StrngBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay");
		sb.append(" dinanath chauhan");
		
		System.out.println(sb);
		System.out.println("length : "+sb.length());
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("char at : "+sb.charAt(3));
		System.out.println("index of  : "+ sb.indexOf("dinanath"));
		System.out.println("Replace : "+ sb.replace(0, 6, " Aditya "));
		System.out.println(sb);
		System.out.println("reverse : "+ sb.reverse());
		
	}

}


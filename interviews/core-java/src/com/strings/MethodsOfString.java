package com.strings;

public class MethodsOfString {
	public static void main(String[] args) {
		String str = "vijay aloknath chouhan";
		String s = "aditya";

		System.out.println("Char at given index  : " + str.charAt(6));
		System.out.println("index of char j : " + str.indexOf('j'));
		System.out.println("lenth of String : " + str.length());
		System.out.println("index of alok : " + str.indexOf("alok"));
		System.out.println("last position of i :" + str.lastIndexOf('n'));
		System.out.println("a is replaced  by b " + str.replace('a', 'b'));
		System.out.println("lower : " + str.toLowerCase());
		System.out.println("upper : " + str.toUpperCase());
		System.out.println("Starts with vijay ? " + str.startsWith("vijay"));
		System.out.println("Dad's name ?? Mr." + str.substring(6).toUpperCase());
	}
}

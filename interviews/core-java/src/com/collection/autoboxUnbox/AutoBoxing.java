package com.collection.autoboxUnbox;

public class AutoBoxing {
	public static void main(String[] args) {

		int a = 2;
		Integer b = a;
		System.out.println(b); // primitive type to wrapper class

		Integer i = new Integer(2);
		int j = i;
		System.out.println(j);
	}

}

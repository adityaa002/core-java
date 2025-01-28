package com.rays.basics;

public class HelloAll {
	public static void main(String[] args) {
	int size = args.length;
	if(size==0) {
		System.out.println("Usage : Hello javaAll n1 n2 n3 n4");
	}else {
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(i + " Hello = " + args[i]);
		}
	}
}
}

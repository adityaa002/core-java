package com.rays.basics.loops;

public class Palindrome {

	public static void main(String[] args) {
	
	int number = 1234321;
	int sum = 0;
	int r = 0 ;
	int n = number;
	
	while(n>0) {
		r = n % 10;
		sum = (sum * 10) + r ;
		n = n / 10;
		
	}
	
	if(sum == number) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number ins't palindrome");
	}
	
	}
	
}

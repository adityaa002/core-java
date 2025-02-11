package com.rays.core.loops;

public class WhileLoopSum {
	
	public static void main(String[] args) {
	
		int i = 1;
		
		int sum = 0;
		
		while (i <= 10) {
		
			System.out.println(i); // it will print numbers from 1 to 10
			
			sum = sum + i;
			
			i++;

		}
		
		System.out.println("sum is:" + sum);
	
	}

}


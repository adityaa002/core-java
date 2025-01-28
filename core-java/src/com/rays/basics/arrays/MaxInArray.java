package com.rays.basics.arrays;

public class MaxInArray {
	
	public static void main(String[] args) {
		int[] arr = {2,6,5,47,8,9,0,5};
		int max = 0;
 		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
 		}
		System.out.println("max is = " + max);
	}

}

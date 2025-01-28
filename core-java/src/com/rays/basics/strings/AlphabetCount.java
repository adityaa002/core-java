package com.rays.basics.strings;

public class AlphabetCount {
	
	public static void main(String[] args) {
		String name = "Vijay Dinanath chauhan";
		int count = 0;
		for(int i = 0 ; i < name.length();i++) {
			count++;
		}
		System.out.println("total alphabet count is : "+count);
	}

}

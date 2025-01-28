package com.rays.basics.strings;

public class VowelCount {
	public static void main(String[] args) {

		String name = "Vijay dinanath chauhan";
		
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		int count = 0;

		for (int i = 0; i < vowels.length; i++) {
		
			for (int j = 0; j < name.length(); j++) {
			
				if (vowels[i] == name.charAt(j)) {
				
					count++;
				
				}
			
			}
			
			if (count > 0) {
			
				System.out.println(vowels[i] + " is " + count + " times");
			
			}
			
			count = 0;

	
		}
	
	}

}



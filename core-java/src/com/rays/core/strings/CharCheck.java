package com.rays.core.strings;

public class CharCheck {
	public static void main(String[] args) {

		String name = "Vijay Dinanath chauhan";
		int count = 0;
		char ch = 'a';
		for(int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;

			}
		}
		System.out.println("Count is : " + count);

	}

}

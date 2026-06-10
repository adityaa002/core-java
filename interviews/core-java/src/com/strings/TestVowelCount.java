package com.strings;

public class TestVowelCount {

	public static void main(String[] args) {

		String s = "introduction";

		char[] ch = s.toCharArray();

		for (char c = 'a'; c <= 'z'; c++) {

			int count = 0;

			for (int i = 0; i < ch.length; i++) {

				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

					if (ch[i] == c) {
						count++;
					}
				}
				
			}if (count > 0) {
				System.out.println(c + " = " + count);
			}
		}
	}

}

package com.rays.core.strings;

public class ChkIndividualCount {

	public static void main(String[] args) {
		String name = "Aditya Sharma";
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
					count++;
				}
			}
			if (ch != 0) {
				System.out.println(ch + "  has a count of  " + count);
			}

			count = 0;
		}
	}
}

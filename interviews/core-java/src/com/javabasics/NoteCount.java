package com.javabasics;

public class NoteCount {
	public static void main(String[] args) {

		int[] note = { 2000, 1000, 500, 200, 100, 50, 20, 10 };

		int count = 0;
		int money = 9999;

		for (int i = 0; i < note.length; i++) {
			count = money / note[i];

			if (count > 0) {
				System.out.println(note[i] + " = " + count);
				money = money % note[i];
			}
		}
	}
}

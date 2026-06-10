package com.javabasics;

public class NoteCount {
	public static void main(String[] args) {

		int[] note = {500, 100, 50, 20, 10, 5, 2, 1 };

		int money = 5700;
		int count = 0;

		for (int i = 0; i < note.length; i++) {
			count = money / note[i];
			if (count > 0) {

				System.out.println(note[i] + " = " + count);
				money = money % note[i];
			}

		}
	}
}

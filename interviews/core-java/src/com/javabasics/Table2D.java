package com.javabasics;

public class Table2D {

	public static void main(String[] args) {

		int[][] arr = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = (i + 1) * (j + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

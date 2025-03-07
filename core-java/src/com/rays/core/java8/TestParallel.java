package com.rays.core.java8;

import java.util.Arrays;

public class TestParallel {
	public static void main(String[] args) {
		int[] arr = { 2, 43, 54, 34, 22, 12, 7, 23, 13, 455, 67, 5, 34, 2432 };

		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

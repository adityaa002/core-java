package com.rays.core.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenOdd {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		IntStream stream = Arrays.stream(arr);
		stream.filter(e -> e < 5).distinct().sorted().forEach(e -> {
			System.out.println(e);
		});
	}
}

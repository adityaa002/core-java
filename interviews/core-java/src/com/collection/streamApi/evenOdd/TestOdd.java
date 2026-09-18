package com.collection.streamApi.evenOdd;

import java.util.Arrays;

public class TestOdd {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 6, 7, 8, 9, 0, 7, 6, 1 };

		Arrays.stream(numbers).filter(e -> e % 2 != 0).forEach(System.out::println);
	}

}

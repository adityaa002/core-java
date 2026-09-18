package com.collection.streamApi.evenOdd;

import java.util.Arrays;

public class TestEven {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 99, 0 };

		Arrays.stream(number).filter(e -> e % 2 == 0).forEach(System.out::println);
	}

}

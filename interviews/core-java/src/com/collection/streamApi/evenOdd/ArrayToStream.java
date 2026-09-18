package com.collection.streamApi.evenOdd;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {

		String[] arr = { "a", "b", "c", "d" };

		Stream<String> stream = Arrays.stream(arr);

		stream.sorted().distinct().forEach(System.out::println);
	}

}

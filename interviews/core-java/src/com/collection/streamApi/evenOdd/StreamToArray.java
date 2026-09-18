package com.collection.streamApi.evenOdd;

import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "b", "c");

		String[] array = stream.toArray(e -> new String[e]);

		System.out.println(array[0]);

	}

}

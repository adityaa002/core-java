package com.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		map.put(4, "jkl");

		System.out.println(map.get(2));

		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("abc"));

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();

		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}

	}
}

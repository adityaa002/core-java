package com.rays.core.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("2", "two");
		map.put("null", "four");
		map.put("1", "one");
		map.put("3", null);
		map.put("null", null);

//		// Gives value at key '1';
		String str = (String) map.get(1);
		// System.out.println(str);

		// prints set of keys
		Set keys = map.keySet();
		for (Object object : keys) {
			// System.out.println(object);
		}

		System.out.println("values");

		Collection vals = map.values();
		for (Object object : vals) {
			System.out.println(object);
		}

		Set keyValue = map.entrySet();

		for (Object ele : keyValue) {
			Map.Entry pair = (Entry) ele;

			System.out.println(pair.getKey() + " - " + pair.getValue());
		}
	}
}

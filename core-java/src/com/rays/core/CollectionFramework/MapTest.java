package com.rays.core.CollectionFramework;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Adi");
		map.put(2, "Carl");
		map.put(3, "Thor");
		map.put(4, "Tony");
		System.out.println(map);
		System.out.println(map.size());

		System.out.println(map.values());
		System.out.println(map.keySet());

		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Thor"));

		System.out.println(map.isEmpty());

		System.out.println(map.entrySet());
		System.out.println(map.get(4));

		map.remove(2);
		System.out.println(map);

		map.clear();
		System.out.println(map);

	}

}

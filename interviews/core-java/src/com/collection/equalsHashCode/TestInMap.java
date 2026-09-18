package com.collection.equalsHashCode;

import java.util.HashMap;
import java.util.Map;

public class TestInMap {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(1, "abc", 100);
 
		Map map = new HashMap();

		map.put(e1, "one");
		map.put(e2, "two");
 
		System.out.println("map: " + map);

	}
}

package com.rays.core.practice;

import java.util.HashMap;
import java.util.Set;

public class TestMap {
public static void main(String[] args) {
	HashMap map = new HashMap();
	
	map.put(1, "one");
	map.put(2, "two");
	map.put(3,"three");
	
	System.out.println(map.size());
	
	System.out.println(map.get(2));
	String s = (String) map.get("2");
	System.out.println(s);
	
	Set keys = map.keySet();
	for(Object obj : keys) {
		System.out.println(obj );
		
	}
}
}

package com.javabasics;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		int i =1;
		int value = ++i + i-- + i++ + --i + --i + i-- + i++ + ++i + i-- + i--;
		System.out.println(value);
		
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		System.out.println("Set => "+s);
		
		
	}

}

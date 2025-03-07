package com.rays.core.practice;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		 s.add(100);
		 s.add(22);
		 s.add(98);
		 
		 Iterator it = s.iterator();
		 while(it.hasNext()) {
			 int i = (int) it.next();
 			 System.out.println(i);
		 }
	}
}

package com.rays.core.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');

	System.out.println(l);
		l.add(2, "one");
//		System.out.println(l);
//
//		l.remove(0);
//
//		System.out.println(l.indexOf('c'));
//		System.out.println(l);
//		
//		System.out.println(l.indexOf('b'));
//		System.out.println(l.get(1));
		
		System.out.println(l);
		System.out.println(l.indexOf('a'));
		
		
		
 	}

}

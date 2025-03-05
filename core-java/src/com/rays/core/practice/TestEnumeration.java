package com.rays.core.practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
public static void main(String[] args) {
	Vector vc = new Vector();
	
	vc.add("a");
	vc.add("b");
	vc.add("c");
	vc.add("d");
	vc.add("e");
	System.out.println("Iterated by enumeration");
	Enumeration e = vc.elements();
	vc.add("f");
	while(e.hasMoreElements()) {
		String str = (String) e.nextElement();
		System.out.println(str);
	}
}
}

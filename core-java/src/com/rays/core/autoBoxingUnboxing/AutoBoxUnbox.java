package com.rays.core.autoBoxingUnboxing;

import java.util.ArrayList;

public class AutoBoxUnbox {
	public static void main(String[] args) {
		int i = 5;

		// Integer iObj = new Integer(i);

		ArrayList l = new ArrayList();

		// l.add(iObj);

		Integer iObj = i;
		int k = iObj;

		l.add(k);
		
		System.out.println(l);

	}
}

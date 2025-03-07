package com.rays.core.practice;

import java.util.Comparator;

public class Duplicacyy implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {
		return e1.name.compareTo(e2.name);
	}

}

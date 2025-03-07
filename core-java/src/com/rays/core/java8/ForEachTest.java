package com.rays.core.java8;

import java.util.ArrayList;

public class ForEachTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);

		list.forEach(li -> {
			System.out.println(li);
		});

	}
}

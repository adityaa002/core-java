package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Iterator it = list.iterator();
		
		list.add(50);

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

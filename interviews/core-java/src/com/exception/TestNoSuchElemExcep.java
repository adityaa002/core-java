package com.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestNoSuchElemExcep {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("apple");
		name.add("mango");

		Iterator iterator = name.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		try {
			System.out.println(iterator.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
}

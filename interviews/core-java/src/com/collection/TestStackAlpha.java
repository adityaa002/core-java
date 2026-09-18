package com.collection;

import java.util.Stack;

public class TestStackAlpha {
	public static void main(String[] args) {

		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}

		Stack s1 = new Stack();

		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
//		System.out.println(s);
	}

}

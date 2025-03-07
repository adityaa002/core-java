package com.rays.core.practice;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack.get(1));
		System.out.println(stack);

		System.out.println(stack.peek());

		stack.push(30);
		System.out.println(stack);

		for (int i = 0; i <= 3; i++) {
			stack.pop();
		}
		System.out.println(stack);
		
		Object obj = stack.peek();
		System.out.println(obj);

	}
}

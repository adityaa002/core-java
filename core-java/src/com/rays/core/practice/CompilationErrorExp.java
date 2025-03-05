package com.rays.core.practice;

public class CompilationErrorExp {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;

		try {

		} catch (RuntimeException e) { // child class

			// }catch (ArithmeticException r) { parentclass
			// hierarchy must be maintained
		}
	}
}

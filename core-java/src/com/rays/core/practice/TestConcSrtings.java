package com.rays.core.practice;

public class TestConcSrtings {
	public static void main(String[] args) {
		ConcStrings cs = (a, b) -> {
			System.out.println(a.concat(b));

		};

		cs.cString("Adi", "tya");
	}

}

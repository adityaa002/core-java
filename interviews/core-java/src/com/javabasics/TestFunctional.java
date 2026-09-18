package com.javabasics;

public class TestFunctional {

	public static void main(String[] args) {
		FunctionalInt f = new FunctionalInt() {
			@Override
			public void display() {
				System.out.println("Display method called using annonymous function..!");
			}
		};
		f.display();
	}

}

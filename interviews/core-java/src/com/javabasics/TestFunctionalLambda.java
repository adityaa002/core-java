package com.javabasics;

public class TestFunctionalLambda {

	public static void main(String[] args) {
		FunctionalInt f = () -> {
			System.out.println("Display Using lambda function");
		};
		f.display();
	}

}

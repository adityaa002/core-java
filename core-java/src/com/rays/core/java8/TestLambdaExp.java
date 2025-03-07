package com.rays.core.java8;

public class TestLambdaExp {
	public static void main(String[] args) {
		AnnonymousFunc af = () -> {
			System.out.println("Called by lambaExpression");
		};

		af.sum();
	}
}
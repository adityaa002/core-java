package com.rays.core.java8;

@FunctionalInterface
public interface AnnonymousFunc {
	public void sum();

	public default void hello() {
		System.out.println("Hello by def method");
	}

	public static void world() {
		System.out.println("world by static method");

	}

}

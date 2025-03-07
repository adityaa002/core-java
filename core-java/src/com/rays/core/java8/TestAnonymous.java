package com.rays.core.java8;

public class TestAnonymous {
	public static void main(String[] args) {
		AnnonymousFunc af = new AnnonymousFunc() {

			@Override
			public void sum() {
				// TODO Auto-generated method stub
				System.out.println("Called method  by annonymmous function");
			}
		};
		af.sum();

		af.hello();
		AnnonymousFunc.world();
	}

}

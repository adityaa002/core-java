package com.rays.core.Intrfc;

public class Businessman implements Richman {

	@Override
	public void earning() {
		System.out.println("Earning more money");

	}

	@Override
	public void donation() {
		System.out.println("Proper donation");
	}

	@Override
	public void parties() {
		System.out.println("Parties");

	}

	 

	@Override
	public void socialWorkking() {
		System.out.println("Do some politics");
	}

}

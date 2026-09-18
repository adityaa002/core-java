package com.oop.expl;

public class TestExplicit extends Explicit {

	public TestExplicit(String name) {
		super(name);
		System.out.println("Child const");
	}

	public static void main(String[] args) {
		//Explicit exp = new Explicit("aditya");
		TestExplicit texp = new TestExplicit("aditya");
		
	}
}

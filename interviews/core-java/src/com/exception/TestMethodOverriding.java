package com.exception;

class Parent {
	void msg() {
		System.out.println("Parent class msg() method..!");
	}
}

public class TestMethodOverriding extends Parent {
	void msg(){
		System.out.println("Subclass msg() method");
	}
	public static void main(String[] args) {
		
		Parent p = new TestMethodOverriding();
		p.msg();
				
	}

}

package com.oop.abstractt;

public class TestAbstractClass extends AbstractClass {

	@Override
	public void display() {
		System.out.println("DisplayMethod of TestClass");
	}

	@Override
	public void show() {
		System.out.println("Show method of  TestClass");
	}

	public static void main(String[] args) {

		TestAbstractClass t = new TestAbstractClass();
		t.display();
		t.show();
		t.simple();
	}
}

package com.oop.methodReturnType;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of reactangle : " + length + breadth);
	}

}

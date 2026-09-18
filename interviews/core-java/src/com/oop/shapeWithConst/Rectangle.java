package com.oop.shapeWithConst;

public class Rectangle extends Shape {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle : " + length * breadth);
	}

}

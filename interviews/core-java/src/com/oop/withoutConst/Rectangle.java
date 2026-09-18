package com.oop.withoutConst;

public class Rectangle extends Shape {

	private int length;
	private int bredth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

	@Override
	public void area() {

		System.out.println("Area of Rectangle:" + length * bredth);

	}

}

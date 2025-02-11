package com.rays.core.inheritance;

public class Rectangle extends Shape{

	private int length;
	private int width;

	public void setLength(int l) {
		length = l;

	}

	public int getLength() {
		return length;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void area() {
		int rArea = length * width;
		System.out.println("Area of rectangle : " + rArea);
	}
}

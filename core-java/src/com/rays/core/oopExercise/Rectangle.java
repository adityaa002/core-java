package com.rays.core.oopExercise;

public class Rectangle extends Shape {
	private int length;
	private int width;
	private String color;

	public void setLength(int length) {
		this.length = length;
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

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub

		double rArea = length * width;
		System.out.println("Area of Rectangle : " + rArea + " " +color);

	}

}

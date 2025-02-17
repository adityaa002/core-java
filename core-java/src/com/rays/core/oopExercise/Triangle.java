package com.rays.core.oopExercise;

public class Triangle extends Shape {

	private int height;
	private int base;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public void area() {

		double tArea = height * base;
		System.out.println("Area of Triangle : " + tArea +" " + color);
		// TODO Auto-generated method stub

	}

}

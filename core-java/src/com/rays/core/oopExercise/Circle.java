package com.rays.core.oopExercise;

public class Circle extends Shape {

	private float radius;
	private final float PI = 3.14f;
	private String color;

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
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
		double cArea = PI * radius * radius;
		System.out.println("Area of Circle : " + cArea + " " + color);

	}

}

package com.rays.core.exceptionHandling;

public class RectangleShape {

	public String color;
	public int borderWidth;

	public RectangleShape(String color, int borderWidth) throws ShapeException {
		if ((color == null || borderWidth <= 0)) {

			ShapeException s = new ShapeException("Color can't be null and bordrWidth can't be less then zero");
			throw s;

		}

		this.color = color;
		this.borderWidth = borderWidth;

	}

	public void getInfo() {
		System.out.println("Color is : " + color + " BorderWidth : " + borderWidth);
	}
}

package com.rays.core.contructors;

public class Shape {
	public String color;
	public int borderWidth;

	public Shape() {
		System.out.println("This is a def constructor");
	}

	public Shape(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;

	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

}

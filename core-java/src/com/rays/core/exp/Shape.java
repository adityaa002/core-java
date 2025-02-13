package com.rays.core.exp;

public class Shape {

	public int borderWidth;
	public String color;

	public Shape() {
	}
	public Shape(int borderWidth, String color) {
		this.borderWidth = borderWidth;
		this.color = color;
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

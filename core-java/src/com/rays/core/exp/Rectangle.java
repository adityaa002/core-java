package com.rays.core.exp;

public class Rectangle extends Shape {

	public int length;
	public int width;

	public Rectangle() {

	}

	public Rectangle(int l, int w) {
		length = l;
		width = w;

	}

	public Rectangle(int length, int width, String color, int borderWidth) {
		super(borderWidth, color);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void area() {
		int rArea = length * width;
	}
}

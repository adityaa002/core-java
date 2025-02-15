package com.rays.core.deepCloning;

public class Marks implements Cloneable {
	public String subjectName;
	public int score;

	public Marks(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

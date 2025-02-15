package com.rays.core.deepCloning;

public class Student implements Cloneable {
	public String studentName;
	public Marks marks;

	public Student(String studentName, Marks marks) {
		this.studentName = studentName;
		this.marks = marks;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.marks = (Marks) s.marks.clone();

		return s;
	}

}

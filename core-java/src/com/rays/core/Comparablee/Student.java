package com.rays.core.Comparablee;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private double marks;
	private String subject;

	public Student(int rollNo, String name, double marks, String subject) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}

	@Override
	public String toString() {
		String str = rollNo + " " + name + " " + marks + " " + subject;

		return str;
	}

	@Override
	public int compareTo(Student s) {
		return this.rollNo - s.rollNo;
		// return this.name.compareTo(s.name);

	}

}

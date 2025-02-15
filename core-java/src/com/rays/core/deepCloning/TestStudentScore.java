package com.rays.core.deepCloning;

public class TestStudentScore {
	public static void main(String[] args) throws CloneNotSupportedException {
		Marks m = new Marks("Maths", 100);

		Student s1 = new Student("Vijay", m);

		Student s2 = (Student) s1.clone();

		System.out.println(s1.studentName);
		System.out.println(s1.marks.subjectName);
		System.out.println(s1.marks.score);

		System.out.println();

		s2.studentName = "john";
		s2.marks.subjectName = "Physics	";
		s2.marks.score = 200;

		System.out.println(s2.studentName);
		System.out.println(s2.marks.subjectName);
		System.out.println(s2.marks.score);

	}
}

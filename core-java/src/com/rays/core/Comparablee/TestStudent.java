package com.rays.core.Comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List maths = new ArrayList();

		maths.add(new Student(105, "Vijay", 29, "Maths"));
		maths.add(new Student(103, "Devansh", 36, "Maths"));
		maths.add(new Student(106, "Nipun", 32, "Maths"));
		maths.add(new Student(108, "Yusuf", 33, "Maths"));
		maths.add(new Student(101, "Aditya", 35, "Maths"));
		maths.add(new Student(107, "Shrey", 39, "Maths"));
		maths.add(new Student(104, "Keshav", 30, "Maths"));
		maths.add(new Student(102, "Aman", 31, "Maths"));
		Collections.sort(maths);
		for (Object MathMarks : maths) {
			System.out.println(MathMarks);
		}

		System.out.println();

		List science = new ArrayList();

		science.add(new Student(105, "Vijay", 19, "Science"));
		science.add(new Student(103, "Devansh", 16, "Science"));
		science.add(new Student(106, "Nipun", 20, "Science"));
		science.add(new Student(108, "Yusuf", 25, "Science"));
		science.add(new Student(101, "Aditya", 27, "Science"));
		science.add(new Student(107, "Shrey", 29, "Science"));
		science.add(new Student(104, "Keshav", 25, "Science"));
		science.add(new Student(102, "Aman", 31, "Science"));

		Collections.sort(science);

		for (Object ScienceMarks : science) {
			System.out.println(ScienceMarks);
		}

	}

}

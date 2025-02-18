package com.rays.core.oopExercise;

public class TestAbsPerson {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.donation();
		s1.party();


		BusinessMan b1 = new BusinessMan();
		System.out.println();
		b1.donation();
		b1.party();
	}
}

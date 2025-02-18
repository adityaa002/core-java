package com.rays.core.oopExercise;

public class Person {
	public String firstName;
	public String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}

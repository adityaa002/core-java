package com.oop.pojo;

public class Person {
	private String firstName;
	private String lastName;
	public static final int AGE = 23;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirtName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public static int getAge() {
		return AGE;
	}

}

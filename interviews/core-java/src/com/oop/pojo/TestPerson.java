package com.oop.pojo;

public class TestPerson {
	public static void main(String[] args) {

		Person p = new Person();

		p.setFirstName("aditya");
		p.setLastName("sharma");

		System.out.println(p.getFirtName());
		System.out.println(p.getLastName());
		System.out.println(Person.AGE);
	}

}

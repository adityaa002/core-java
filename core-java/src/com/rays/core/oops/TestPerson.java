package com.rays.core.oops;

import java.text.ParseException;

public class TestPerson {
	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		p.setDate("26/07/2002");
		System.out.println(p.getDate());

		p.setName("Aditya");
		System.out.println(p.getName());

	}
}

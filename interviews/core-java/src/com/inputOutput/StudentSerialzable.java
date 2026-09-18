package com.inputOutput;

import java.io.Serializable;

public class StudentSerialzable implements Serializable{
	transient int id;
	String name;

	public StudentSerialzable(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return ("id : " + id + " name: " + name);
	}
}

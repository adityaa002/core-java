package com.rays.core.streamApi;

public class Contestent implements Comparable<Contestent> {
	String name = null;
	String phone = null;

	public Contestent(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		String str = name + " = " + phone;
		return str;
	}

	@Override
	public int compareTo(Contestent c) {
		return this.name.compareTo(c.name);

	}
}

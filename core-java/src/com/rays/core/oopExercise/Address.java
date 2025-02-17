package com.rays.core.oopExercise;

public class Address implements Cloneable {

	public String permanentAddress;
	public String localAddress;

	public Address(String permanentAddress, String localAddress) {
		this.permanentAddress = permanentAddress;
		this.localAddress = localAddress;

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
 		return super.clone();
	}

}

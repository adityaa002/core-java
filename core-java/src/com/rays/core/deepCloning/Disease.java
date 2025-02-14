package com.rays.core.deepCloning;

public class Disease implements Cloneable {

	public int noOfDisease;
 
	public Disease(  int diseaseCount) {
 		noOfDisease = diseaseCount;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

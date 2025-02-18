package com.rays.core.exceptionHandling;

public class StringClass {

	public String name;

	public StringClass(String name) throws OverAllException {
		if (name == null) {
			OverAllException sce = new OverAllException("Enter the valid name.....Null can't proceed");
			throw sce;
		}
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public char getCharAtIndex(int index) throws OverAllException {
		
		if (index >= name.length()) {
			OverAllException sce = new OverAllException("Enter the valid name.....Null can't proceed");
throw sce;
		}
		return name.charAt(index);

	}

}

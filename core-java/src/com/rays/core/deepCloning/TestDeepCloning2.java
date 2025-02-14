package com.rays.core.deepCloning;

public class TestDeepCloning2 {
	public static void main(String[] args) throws CloneNotSupportedException {

		Disease d = new Disease(10);
		Patient p = new Patient("abc", d);

		Patient p1 = (Patient) p.clone();

		p1.name = "xyz";
		p1.disease.noOfDisease = 300;

		System.out.println(p.name);
		System.out.println(p.disease.noOfDisease);

		System.out.println();

		System.out.println(p1.name);
		System.out.println(p1.disease.noOfDisease);
	}
}

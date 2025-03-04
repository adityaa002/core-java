package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception {
		Marksheet m = new Marksheet();
		m.id = 101;
		m.name = "Aditya";
		m.chem = 77;
		m.maths = 70;
		m.phy = 79;
		m.total = m.maths + m.phy + m.chem;

		FileOutputStream out = new FileOutputStream("C:\\Users\\aaead\\Desktop\\rays\\io\\obj11.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(m);

		obj.close();
		out.close();

		System.out.println("data write Successfully");
		System.out.println("Total marks : " + m.total);
	}
}

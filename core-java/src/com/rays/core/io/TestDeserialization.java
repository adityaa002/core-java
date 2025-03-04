package com.rays.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\aaead\\Desktop\\rays\\io\\obj11.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		Marksheet m = (Marksheet) obj.readObject();

		System.out.println("id:" + m.id);
		System.out.println("name : " + m.name);
		System.out.println("maths: " + m.maths);
		System.out.println("chem: " + m.chem);
		System.out.println("phy: " + m.phy);
		System.out.println("total : " + m.total);

		obj.close();
		file.close();
	}
}

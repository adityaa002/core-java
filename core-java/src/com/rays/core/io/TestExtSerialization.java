package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExtSerialization {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();
		emp.id = 101;
		emp.name = "aditya";
		emp.address = "Indore";
		emp.salary = 9000;

		FileOutputStream file = new FileOutputStream("C:\\Users\\aaead\\Desktop\\rays\\io\\ExtSerial.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(emp);

		System.out.println("Object is Gone From Jvm");
		System.out.println("Work Done");

		out.close();
		file.close();
	}
}

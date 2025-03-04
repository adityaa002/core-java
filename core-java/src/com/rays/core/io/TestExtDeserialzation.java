package com.rays.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestExtDeserialzation {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\aaead\\Desktop\\rays\\io\\ExtSerial.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		Employee emp = (Employee) in.readObject();

		System.out.println("id :" + emp.id);
		System.out.println("name : " + emp.name);
		System.out.println("address : " + emp.address);
		System.out.println("salary : " + emp.salary);

		in.close();
		file.close();

	}
}

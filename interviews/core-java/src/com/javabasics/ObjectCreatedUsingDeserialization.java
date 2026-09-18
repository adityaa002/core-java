package com.javabasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCreatedUsingDeserialization implements Serializable {
	public void display() {
		System.out.println("Object created using deserialzation");
	}

	public static void main(String[] args) {
		try {
 			ObjectCreatedUsingDeserialization original = new ObjectCreatedUsingDeserialization();
			FileOutputStream fos = new FileOutputStream("objectcreateusingdeserialization.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(original);
			oos.close();

 			FileInputStream fis = new FileInputStream("objectcreateusingdeserialization.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectCreatedUsingDeserialization deserialized = (ObjectCreatedUsingDeserialization) ois.readObject();
			ois.close();

			deserialized.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

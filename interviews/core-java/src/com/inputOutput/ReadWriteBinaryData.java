package com.inputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryData {
	public static void main(String[] args) throws IOException {

		DataOutputStream out = new DataOutputStream(
				new FileOutputStream("C://Users//Aditya//OneDrive//Desktop//test.txt"));

		out.writeInt(10);
		out.writeBoolean(true);
		out.writeDouble(8.76);
		out.writeFloat(4.2f);
		out.writeChar('a');
		
		out.close();
		
		System.out.println("Data Added Successfully..!");

		DataInputStream in = new DataInputStream(new FileInputStream("C://Users//Aditya//OneDrive//Desktop//test.txt"));

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readFloat());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		
		
		in.close();
		
		System.out.println("Succeed..!");
		
	}
}

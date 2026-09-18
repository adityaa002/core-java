package com.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinary {
	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("C://Users//Aditya//OneDrive//Desktop//IO//bmw.jpg");

		FileOutputStream out = new FileOutputStream("C://Users//Aditya//OneDrive//Desktop//bm.jpg");

		int i = in.read();

		while (i != -1) {
			out.write(i);
			i = in.read();

		}

		out.close();
		in.close();

	}
}

package com.inputOutput;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("C://Users//Aditya//OneDrive//Desktop//test.txt");

		int i = reader.read();

		while (i != -1) {
			System.out.println((char) i);
			i = reader.read();

		}
	}

}

package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C://Users//Aditya//OneDrive//Desktop//test.txt"));

		String str = reader.readLine();

		while (str != null) {
			System.out.println(str);
			str = reader.readLine();
		}
reader.close();
	}
}

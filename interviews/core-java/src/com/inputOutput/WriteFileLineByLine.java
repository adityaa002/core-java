package com.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileLineByLine {
	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new FileWriter("C://Users//Aditya//OneDrive//Desktop//test.txt"));

		out.println("Hello");
		out.println("Aditya");
		out.println("Sharma");

		out.close();

	}

}

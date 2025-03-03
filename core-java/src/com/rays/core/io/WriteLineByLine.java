package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io.txt");
		PrintWriter pr = new PrintWriter(fw);

		pr.println("Heyyy Aditya");
		pr.println("How Are you ");

		pr.close();
		fw.close();
		System.out.println("Data Written Success...!!!");
	}
}

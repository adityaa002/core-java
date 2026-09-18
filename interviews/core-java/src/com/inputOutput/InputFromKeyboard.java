package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromKeyboard {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("C://Users//Aditya//OneDrive//Desktop//test.txt");

		System.out.println("enter text here ..!");

		String str = br.readLine();

		while (str != null) {
			fw.write(str);
			fw.write("\n");
			System.out.println(str);

			str = br.readLine();
		}

		fw.close();
		br.close();

		System.out.println("Data written successfully.");
	}

}

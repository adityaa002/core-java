package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C://Users//Aditya//OneDrive//Desktop//IO//MergedFile.txt");

		BufferedReader br = new BufferedReader(new FileReader("C://Users//Aditya//OneDrive//Desktop//IO//file1.txt"));

		String str1 = br.readLine();

		while (str1 != null) {

			fw.write(str1);
			str1 = br.readLine();
			
		}

		fw.write("\n");
		br.close();

		br = new BufferedReader(new FileReader("C://Users//Aditya//OneDrive//Desktop//IO//file2.txt"));

		String str2 = br.readLine();

		while (str2 != null) {

			fw.write(str2);
			str2 = br.readLine();
		}
		br.close();
		fw.close();
		System.out.println("Files Merged");
	}

}

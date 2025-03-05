package com.rays.core.ioQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MergeAllFiles {
	public static void main(String[] args) throws Exception {

		/*
		 * FileReader read1 = new
		 * FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit1.txt");
		 * BufferedReader br1 = new BufferedReader(read1);
		 * 
		 * FileReader read2 = new
		 * FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit2.txt");
		 * BufferedReader br2 = new BufferedReader(read2);
		 * 
		 * FileReader read3 = new
		 * FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit3.txt");
		 * BufferedReader br3 = new BufferedReader(read3);
		 * 
		 * FileReader read4 = new
		 * FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit4.txt");
		 * BufferedReader br4 = new BufferedReader(read4);
		 * 
		 * FileReader read5 = new
		 * FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit5.txt");
		 * BufferedReader br5 = new BufferedReader(read5);
		 */
		FileWriter out = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\Merged.txt");
		PrintWriter pw = new PrintWriter(out);
		System.out.println("file created");

		for (int i = 1; i <= 5; i++) {

			System.out.println("first for loop :" + i);

			FileReader read = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit" + i + ".txt");

			System.out.println("readed " + i + "file");

			BufferedReader br = new BufferedReader(read);

			for (int j = 1; j <= 2; j++) {
				System.out.println("second for loop :" + j);

				String line = br.readLine();

				if (line != null) {
					System.out.println("Written line " + j + " success");
					pw.println(line);
				}
			}
		}
		pw.close();
		System.out.println("done");

	}
}

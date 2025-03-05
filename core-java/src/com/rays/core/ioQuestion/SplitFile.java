package com.rays.core.ioQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SplitFile {
	public static void main(String[] args) throws Exception {
		int count = 0;
		File fileTosplit = new File("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\10Lines.txt");
		Scanner sc = new Scanner(fileTosplit);

		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("Number of lines : " + count);

		int numberofFiles = 0;

		if (count % 2 == 0) {
			numberofFiles = count / 2;
		} else {
			numberofFiles = (int) count / 2 + 1;
		}

		FileReader read = new FileReader(fileTosplit);
		BufferedReader bw = new BufferedReader(read);

		System.out.println("No of files : " + numberofFiles);

		for (int i = 1; i <= numberofFiles; i++) {
			FileWriter write = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\afterSplit" + i + ".txt");
			PrintWriter pw = new PrintWriter(write);

			for (int j = 1; j <= 2; j++) {
				String line = bw.readLine();
				if (line != null) {
					pw.println(line);
				}

			}
			pw.close();
		}
		read.close();

	}
}

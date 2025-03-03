package com.rays.core.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io.txt");

		Scanner sc = new Scanner(fr);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		fr.close();
	}

}

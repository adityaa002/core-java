package com.rays.core.ioQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CorrectEmail {

	public static void main(String[] args) throws Exception {
		FileReader read = new FileReader("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\email.txt");
		BufferedReader br = new BufferedReader(read);

		FileWriter fw = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\correctEmail.txt");
		PrintWriter pw = new PrintWriter(fw);

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = br.readLine();

		while (line != null) {

			if (line.matches(emailreg)) {
				pw.println(line);
			}else {
				FileWriter fw1 = new FileWriter("C:\\Users\\aaead\\Desktop\\rays\\io\\Que\\IncorrectEmail.txt");
				PrintWriter pw1 = new PrintWriter(fw1);
				pw1.println(line);
			}
			line = br.readLine();

		}
		pw.close();
		br.close();
		System.out.println("done");

	}

}

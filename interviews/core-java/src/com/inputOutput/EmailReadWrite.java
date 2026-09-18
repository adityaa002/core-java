package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailReadWrite {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new FileReader("C://Users//Aditya//OneDrive//Desktop//IO//EmailsList.txt"));

		FileWriter fw = new FileWriter("C://Users//Aditya//OneDrive//Desktop//IO//ValidEmialList.txt");
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String str = br.readLine();

		while (str != null) {
			if (str.matches(emailreg)) {

				fw.write(str);
				fw.write("\n");
			}
			str = br.readLine();
		}

		fw.close();
		br.close();
	}

}

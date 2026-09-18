package com.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharByChar {
	public static void main(String[] args) throws IOException {

		try (FileWriter file = new FileWriter("C:\\Users\\Aditya\\OneDrive\\Desktop\\test.txt")) {
			file.write('H');
			file.write('e');
			file.write('l');
			file.write('l');
			file.write('o');

			
			
		}catch (IOException e) {
		}
	}

}

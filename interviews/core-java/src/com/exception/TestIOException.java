package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestIOException {
	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("fileNotExist.txt");
			int data;

			if ((data = reader.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);

		}
	}
}

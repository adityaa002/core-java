package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws IOException     {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Dashboard");

		System.out.println("Port no : " + url.getPort());
		System.out.println("Host name : " + url.getHost());
		System.out.println("File no :" + url.getFile());
		System.out.println("Protocol : " + url.getProtocol());

		InputStream in = url.openStream();

		Scanner sc = new Scanner(in);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}

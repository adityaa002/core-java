package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient1 {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket client = new Socket("127.0.0.1", 5643);
		System.out.println("Client started..!");

		PrintWriter out = new PrintWriter(client.getOutputStream(), true);

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String line = stdIn.readLine();

		while (line != null) {
			out.println(line);
			System.out.println("Echoo : " + in.readLine());

			if ("bye".equalsIgnoreCase(line)) {
				break;
			}
			line = stdIn.readLine();

		}
		out.close();
		in.close();
		stdIn.close();
		client.close();

	}

}

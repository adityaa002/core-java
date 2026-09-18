package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {

		ServerSocket socket = new ServerSocket(1235);

		System.out.println("Server Started..!");

		while (true) {

		    Socket client = socket.accept();

		    talk(client);
		}
	}

	public static void talk(Socket client) throws IOException {
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		String line = in.readLine();

		while (line != null) {
			
			System.out.println("Recived from Client : " + line);
			
			out.println(line + "...." + line);
			
			if (line.equalsIgnoreCase("bye")) {
				
			    break;
			}
			line = in.readLine();
		}

		in.close();
		out.close();
		client.close();

	}

}

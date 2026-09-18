package com.networking;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.DatagramPacket;

public class UDPClient {

	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket();

		System.out.println("Client waiting for server..!");

		byte[] bt = "Hello Server...from client..!".getBytes();

		InetAddress address = InetAddress.getByName("127.0.0.1");

		DatagramPacket packet = new DatagramPacket(bt, bt.length, address, 2345);

		socket.send(packet);

		bt = new byte[256];

		packet = new DatagramPacket(bt, bt.length);

		socket.receive(packet);

		String message = new String(packet.getData()).trim();
		System.out.println("Recieved from Server : " + message);

		socket.close();

		System.out.println("Client closed..!");

	}

}

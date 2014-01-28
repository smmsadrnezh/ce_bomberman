package com.cebomberman.game.controler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Networking {

	char[] password;
	int portNumber;
	String ipAddress;
	char[] internetPassword;

	/**
	 * This constructor gets network informations from game starter and set them
	 * 
	 * @param password
	 *            password to join multiplayer game
	 * @param portNumber
	 *            port number
	 * @param ipAddress
	 *            local IP address of server
	 * @param internetPassword
	 *            password for connecting to game server on Internet
	 * @throws IOException
	 * @throws UnknownHostException
	 */

	public Networking(char[] password, String portNumber, String ipAddress,
			char[] internetPassword) {
		this.password = password;
		this.portNumber = Integer.parseInt(portNumber);
		this.ipAddress = ipAddress;
		this.internetPassword = internetPassword;

	}

	public void writeToClient() throws IOException, Exception {
		Socket playerNetworkSocket = new Socket(this.ipAddress, this.portNumber);
		PrintWriter writer = new PrintWriter(
				playerNetworkSocket.getOutputStream());
		writer.println("connection established");
	}

	public void readFromClient() throws IOException, Exception {
		Socket playerNetworkSocket = new Socket(this.ipAddress, this.portNumber);
		InputStreamReader stream = new InputStreamReader(
				playerNetworkSocket.getInputStream());
		BufferedReader reader = new BufferedReader(stream);
		String message = reader.readLine();
	}

}

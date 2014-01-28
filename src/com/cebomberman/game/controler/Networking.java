package com.cebomberman.game.controler;

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
	 */

	public Networking(char[] password, String portNumber, String ipAddress,
			char[] internetPassword) {
		this.password = password;
		this.portNumber = Integer.parseInt(portNumber);
		this.ipAddress = ipAddress;
		this.internetPassword = internetPassword;
	}

}

package com.cebomberman.game.controler;

public class Networking {
	
	char[] password;
	int portNumber;
	String ipAddress;
	char[] internetPassword;
	
	public Networking(char[] password, String portNumber, String ipAddress,
			char[] internetPassword) {
		this.password = password;
		this.portNumber = Integer.parseInt(portNumber);
		this.ipAddress = ipAddress;
		this.internetPassword = internetPassword;
	}
	
}

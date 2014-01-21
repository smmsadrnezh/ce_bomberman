package com.cebomberman.game.graphics;

import javax.swing.ImageIcon;

public class PlayerGraphics {

	private String color;
	
	private String upImageLocation;
	private String downImageLocation;
	private String rightImageLocation;
	private String leftImageLocation;
	private String upMovingImageLocation;
	private String downMovingImageLocation;
	private String righMovingtImageLocation;
	private String leftMovingImageLocation;
	
	public PlayerGraphics(){
		
		this.rightImageLocation = "images/players/"+color+"/right.png";
		this.leftImageLocation = "images/players/"+color+"/left.png";
		this.upImageLocation = "images/players/"+color+"/up.png";
		this.downImageLocation = "images/players/"+color+"/down.png";
		
		this.righMovingtImageLocation = "images/players/"+color+"/movingright.png";
		this.leftMovingImageLocation = "images/players/"+color+"/movingleft.png";
		this.upMovingImageLocation = "images/players/"+color+"/movingup.png";
		this.downMovingImageLocation = "images/players/"+color+"/movingdown.png";
		
}
	rightImageLocation = /player/color/
	public void moveRight(String rightImageLocation){
		player.setIcon(new ImageIcon(
				"rightImageLocation"));
		player.setLocation(player.getX() + 5, player.getY());
		keyPressed = 39;
	}
	public void moveleft(String leftImageLocation){
		player.setIcon(new ImageIcon(
				"leftImageLocation"));
		for (int i = 0; i < 5; i++) {
			player.setLocation(player.getX() - 1, player.getY());
		}
		keyPressed = 37;
	}
	public void moveUp(String upImageLocation){
		player.setIcon(new ImageIcon("upImageLocation"));
		player.setLocation(player.getX(), player.getY() - 5);
		keyPressed = 38;
	}
	public void moveDown(String downImageLocation){
		player.setIcon(new ImageIcon(
				"downImageLocation"));
		player.setLocation(player.getX(), player.getY() + 5);
		keyPressed = 40;
	}
	public void loseLifeIcon(){
		
	}
}

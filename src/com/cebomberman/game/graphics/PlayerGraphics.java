package com.cebomberman.game.graphics;

import javax.swing.ImageIcon;

public class PlayerGraphics {

	private String upImageLocation;
	private String downImageLocation;
	private String rightImageLocation;
	private String leftImageLocation;
	private String upMovingImageLocation;
	private String downMovingImageLocation;
	private String righMovingtImageLocation;
	private String leftMovingImageLocation;
	
	public PlayerGraphics(){
		this.rightImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.leftImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.upImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.downImageLocation = "images/players/"+super.logic.color+"/right.png";
		
		this.righMovingtImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.leftMovingImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.upMovingImageLocation = "images/players/"+super.logic.color+"/right.png";
		this.downMovingImageLocation = "images/players/"+super.logic.color+"/right.png";
		
		
		
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

package com.cebomberman.game.graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerGraphics extends JLabel {

	private String color;

	private String upImageLocation;
	private String downImageLocation;
	private String rightImageLocation;
	private String leftImageLocation;
	private String upMovingImageLocation;
	private String downMovingImageLocation;
	private String righMovingtImageLocation;
	private String leftMovingImageLocation;

	private int currentPositionX;
	private int currentPositionY;

	/**
	 * 
	 */
	public PlayerGraphics() {

		

	}

	/**
	 * 
	 * @param righMovingtImageLocation
	 */
	public void moveRight() {
		setIcon(new ImageIcon(righMovingtImageLocation));
		setLocation(this.getX() + 5, this.getY());
		// keyPressed = 39;
	}

	/**
	 * 
	 * @param leftMovingtImageLocation
	 */
	public void moveLeft() {
		setIcon(new ImageIcon(leftMovingImageLocation));
		setLocation(getX()-5,getY());
//		for (int i = 0; i < 5; i++) {
//			setLocation(getX() - 1, getY());
//			try {
//				Thread.sleep(5);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		// keyPressed = 37;
	}

	/**
	 * 
	 * @param upMovingImageLocation
	 */
	public void moveUp() {
		setIcon(new ImageIcon(upMovingImageLocation));
		setLocation(getX(), getY() - 5);
		// keyPressed = 38;
	}

	/**
	 * 
	 * @param downMovingImageLocation
	 */
	public void moveDown() {
		setIcon(new ImageIcon(downMovingImageLocation));
		setLocation(getX(), getY() + 5);
		// keyPressed = 40;
	}

	/**
 * 
 */
	public void loseLifeIcon() {

	}

	/**
	 * this method calculates integer x coordinate of player.
	 * 
	 * @return x coordinate of player.
	 */
	public int getCurrentPositionX() {
		currentPositionX = this.getX() / 32;
		if (this.getX() % 32 > 16)
			currentPositionX++;
		return currentPositionX;
	}

	/**
	 * this method calculates integer y coordinate of player.
	 * 
	 * @return y coordinate of player.
	 */
	public int getCurrentPositionY() {
		currentPositionY = this.getY() / 32;
		if (this.getY() % 32 > 16)
			currentPositionY++;
		return currentPositionY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		
		this.rightImageLocation = "images/players/" + color + "/right.gif";
		this.leftImageLocation = "images/players/" + color + "/left.gif";
		this.upImageLocation = "images/players/" + color + "/up.gif";
		this.downImageLocation = "images/players/" + color + "/down.gif";

		this.righMovingtImageLocation = "images/players/" + color
				+ "/movingright.gif";
		this.leftMovingImageLocation = "images/players/" + color
				+ "/movingleft.gif";
		this.upMovingImageLocation = "images/players/" + color
				+ "/movingup.gif";
		this.downMovingImageLocation = "images/players/" + color
				+ "/movingdown.gif";
	}


}

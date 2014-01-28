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
	private String boomImage;
	private int speed = 5;

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
	public void moveRight(int speed) {
		setIcon(new ImageIcon(righMovingtImageLocation));
		setLocation(this.getX() + speed, this.getY());
		// keyPressed = 39;
	}

	/**
	 * 
	 * @param leftMovingtImageLocation
	 */
	public void moveLeft(int speed) {
		setIcon(new ImageIcon(leftMovingImageLocation));
		setLocation(getX() - speed, getY());
	}

	/**
	 * 
	 * @param upMovingImageLocation
	 */
	public void moveUp(int speed) {
		setIcon(new ImageIcon(upMovingImageLocation));
		setLocation(getX(), getY() - speed);
		// keyPressed = 38;
	}

	/**
	 * 
	 * @param downMovingImageLocation
	 */
	public void moveDown(int speed) {
		setIcon(new ImageIcon(downMovingImageLocation));
		setLocation(getX(), getY() + speed);
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

	public void boom() {
		this.setIcon(new ImageIcon(this.boomImage));
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
		this.boomImage = "images/players/" + color + "/=" + color + "boom.gif";

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setUpImage() {
		this.setIcon(new ImageIcon(upImageLocation));
	}

	public void setDownImage() {
		this.setIcon(new ImageIcon(downImageLocation));
	}

	public void setRightImage() {
		this.setIcon(new ImageIcon(rightImageLocation));
	}

	public void setLeftImage() {
		this.setIcon(new ImageIcon(leftImageLocation));
	}

}

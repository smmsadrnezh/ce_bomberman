package com.cebomberman.game.gameplay;

import javax.swing.JLabel;

import com.cebomberman.game.graphics.MainBoardGraphics;
public class Player extends JLabel {
	//Images
	private String upImage ;
	private String downImage ;
	private String leftImage ;
	private String rightImage ;
	private String upWalkingImage ;
	private String downWalkingImage ;
	private String leftWalingImage ;
	private String rightWalkingImage ;
	
	//
	private boolean isWinner =false; 
	private String name;
	private int currentPositionX ;
	private int currentPositionY ;
	private int lifeNumber;
	private int speed;
	private int bombStrength ;
	private int bombNumber;
	
	Player() {
		
	}
	public String getUpImage() {
		return upImage ;
	}
	public void setUpImage(String upImage){
		this.upImage = upImage ;
	}
	public String getDownImage() {
		return downImage;
	}
	public void setDownImage(String downImage) {
		this.downImage = downImage;
	}
	public String getLeftImage() {
		return leftImage;
	}
	public void setLeftImage(String leftImage) {
		this.leftImage = leftImage;
	}
	public String getRightImage() {
		return rightImage;
	}
	public void setRightImage(String rightImage) {
		this.rightImage = rightImage;
	}
	public String getUpWalkingImage() {
		return upWalkingImage;
	}
	public void setUpWalkingImage(String upWalkingImage) {
		this.upWalkingImage = upWalkingImage;
	}
	public String getDownWalkingImage() {
		return downWalkingImage;
	}
	public void setDownWalkingImage(String downWalkingImage) {
		this.downWalkingImage = downWalkingImage;
	}
	public String getLeftWalingImage() {
		return leftWalingImage;
	}
	public void setLeftWalingImage(String leftWalingImage) {
		this.leftWalingImage = leftWalingImage;
	}
	public String getRightWalkingImage() {
		return rightWalkingImage;
	}
	public void setRightWalkingImage(String rightWalkingImage) {
		this.rightWalkingImage = rightWalkingImage;
	}
	
}

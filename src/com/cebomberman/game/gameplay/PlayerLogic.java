package com.cebomberman.game.gameplay;
public class PlayerLogic {		
	
	private boolean isWinner =false; 
	private String playerName;
	private int currentPositionX ;
	private int currentPositionY ;
	private int lifeNumber;
	private int speed;
	private int bombStrength ;
	private int bombNumber;
	
	public PlayerLogic() {
		
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
	private int getCurrentPositionX() {
		return currentPositionX;
	}
	private void setCurrentPositionX(int currentPositionX) {
		this.currentPositionX = currentPositionX;
	}
	private int getCurrentPositionY() {
		return currentPositionY;
	}
	private void setCurrentPositionY(int currentPositionY) {
		this.currentPositionY = currentPositionY;
	}
	private int getSpeed() {
		return speed;
	}
	private void setSpeed(int speed) {
		this.speed = speed;
	}
	private int getLifeNumber() {
		return lifeNumber;
	}
	private void setLifeNumber(int lifeNumber) {
		this.lifeNumber = lifeNumber;
	}
	private int getBombStrength() {
		return bombStrength;
	}
	private void setBombStrength(int bombStrength) {
		this.bombStrength = bombStrength;
	}
	private int getBombNumber() {
		return bombNumber;
	}
	private void setBombNumber(int bombNumber) {
		this.bombNumber = bombNumber;
	}
	private boolean isWinner() {
		return isWinner;
	}
	private void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	private String getPlayerName() {
		return playerName;
	}
	private void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}

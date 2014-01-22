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

package com.cebomberman.game.gameplay;

import java.util.ArrayList;

/**
 * 
 * @author
 * 
 */

public class PlayerLogic {

	private boolean isWinner = false;
	private String playerName;
	private int lifeNumber;
	private int speed;
	private int bombStrength;
	private int bombNumber;

	// public int bombX;
	// public int bombY;

	/**
	 * 
	 */
	public PlayerLogic() {
		this.lifeNumber = 1;
		this.bombStrength = 1;
	}

	/**
	 * 
	 */
	public void bombing(int bombX, int bombY) {
		if (getBombNumber() > 0) {
			Bomb bomb = new Bomb(bombX, bombY, bombStrength);
		}
		setBombNumber(getBombNumber() - 1);
	}

	public void getBonus(String bonus) {
		switch (bonus) {
		case "speed":
			this.speed += 5;
			break;
		case "life":
			this.lifeNumber++;
			break;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return
	 */
	public int getLifeNumber() {
		return lifeNumber;
	}

	public void lifeNumberIncrement() {
		lifeNumber++;
	}

	public void lifeNumberDecrement() {
		lifeNumber--;
	}

	/**
	 * 
	 * @param lifeNumber
	 */
	public void setLifeNumber(int lifeNumber) {
		this.lifeNumber = lifeNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getBombStrength() {
		return bombStrength;
	}

	/**
	 * 
	 * @param bombStrength
	 */
	public void setBombStrength(int bombStrength) {
		this.bombStrength = bombStrength;
	}

	/**
	 * 
	 * @return
	 */
	public int getBombNumber() {
		return bombNumber;
	}

	/**
	 * 
	 * @param bombNumber
	 */
	public void setBombNumber(int bombNumber) {
		this.bombNumber = bombNumber;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isWinner() {
		return isWinner;
	}

	/**
	 * 
	 * @param isWinner
	 */
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	/**
	 * 
	 * @return
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * 
	 * @param playerName
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}

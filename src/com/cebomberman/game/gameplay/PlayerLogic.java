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
	//public int bombX;
	//public int bombY;

	/**
	 * 
	 */
	public PlayerLogic() {
		this.lifeNumber = 1;
	}

	/**
	 * 
	 */
	public void bombing(int bombX,int bombY) {
		if(getBombNumber()>0){
			Bomb bomb = new Bomb(bombX, bombY, bombStrength);
		}
		setBombNumber(getBombNumber()-1) ;
	}

	/**
	 * 
	 * @return
	 */
	private int getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param speed
	 */
	private void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return
	 */
	private int getLifeNumber() {
		return lifeNumber;
	}

	/**
	 * 
	 * @param lifeNumber
	 */
	private void setLifeNumber(int lifeNumber) {
		this.lifeNumber = lifeNumber;
	}

	/**
	 * 
	 * @return
	 */
	private int getBombStrength() {
		return bombStrength;
	}

	/**
	 * 
	 * @param bombStrength
	 */
	private void setBombStrength(int bombStrength) {
		this.bombStrength = bombStrength;
	}

	/**
	 * 
	 * @return
	 */
	private int getBombNumber() {
		return bombNumber;
	}

	/**
	 * 
	 * @param bombNumber
	 */
	private void setBombNumber(int bombNumber) {
		this.bombNumber = bombNumber;
	}

	/**
	 * 
	 * @return
	 */
	private boolean isWinner() {
		return isWinner;
	}

	/**
	 * 
	 * @param isWinner
	 */
	private void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	/**
	 * 
	 * @return
	 */
	private String getPlayerName() {
		return playerName;
	}

	/**
	 * 
	 * @param playerName
	 */
	private void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}

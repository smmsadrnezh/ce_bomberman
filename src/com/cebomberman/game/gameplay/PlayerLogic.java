package com.cebomberman.game.gameplay;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.print.attribute.Size2DSyntax;

/**
 * 
 * @author
 * 
 */

public class PlayerLogic {

	private boolean isWinner = false;
	private String playerName;
	private String playerNickname;
	private int lifeNumber;
	private int speed = 5;
	private int bombStrength;
	private int bombNumber;
	private boolean invertArrowKeys = false;
	private boolean passingAbility;
	private boolean loseBombAbility ;
	Timer timer = new Timer();
	ArrayList<String> positiveAbilities = new ArrayList<>();

	// public int bombX;
	// public int bombY;

	/**
	 * 
	 */
	public PlayerLogic() {
		this.lifeNumber = 1;
		this.bombStrength = 2;
		this.bombNumber = 1;
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
		case "speedUp":
			positiveAbilities.add("speedUp");
			this.speed += 5;
			break;
		case "addLife":
			positiveAbilities.add("addLife");
			this.lifeNumber++;
			break;
		case "bombNumberIncrement":
			positiveAbilities.add("bombNumberIncrement");
			this.bombNumber++;
			break;
		case "bombStrengthIncrement":
			positiveAbilities.add("bombStrengthIncrement");
			this.bombStrength++;
			break;
		case "passingAbility":
			positiveAbilities.add("passingAbility");
			this.passingAbility = true;
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					passingAbility = false;
				}

			}, 5000, 1);
			break;
		case "invertArrowKeys":

			invertArrowKeys = true;
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					invertArrowKeys = false;
				}

			}, 5000, 1);

			break;
		case "loseLastAbility":
			switch (positiveAbilities.get(positiveAbilities.size() - 1)) {
			case "speedUp":
				this.speed -= 5;
				break;
			case "addLife":
				this.lifeNumber-- ;
				break;
			case "bombNumberIncrement":
				this.bombNumber-- ;
				break;
			case "bombStrengthIncrement":
				this.bombStrength--;
				break;
			case "passingAbility":
				passingAbility = false;
				break;
			}
			positiveAbilities.remove(positiveAbilities.size() - 1);
			break;
		case "loseBombingAbility":
			setLoseBombAbility(true) ;
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					setLoseBombAbility(false) ;
				}

			}, 5000, 1);
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

	private String getPlayerNickname() {
		return playerNickname;
	}

	public void setPlayerNickname(String playerNickname) {
		this.playerNickname = playerNickname;
	}

	public boolean isInvertArrowKeys() {
		return invertArrowKeys;
	}

	public void setInvertArrowKeys(boolean invertArrowKeys) {
		this.invertArrowKeys = invertArrowKeys;
	}

	public boolean isPassingAbility() {
		return passingAbility;
	}

	public void setPassingAbility(boolean passingAbility) {
		this.passingAbility = passingAbility;
	}

	public boolean isLoseBombAbility() {
		return loseBombAbility;
	}

	public void setLoseBombAbility(boolean loseBombAbility) {
		this.loseBombAbility = loseBombAbility;
	}

}

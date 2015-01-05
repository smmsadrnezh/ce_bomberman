package com.cebomberman.game.gameplay;

/**
 * 
 * @author test commit from git to local
 * 
 */

public class Bomb {
	private int positionX;
	private int positionY;
	private int strength;

	/**
	 * 
	 * @param positionX
	 * @param positionY
	 * @param strength
	 */
	Bomb(int positionX, int positionY, int strength) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.strength = strength;
	}

	/**
 * 
 */
	private void explode() {
		// for (int j = 0; j <
		// com.cebomberman.game.controler.Controller.playerNumbers; j++) {
		// for (int i = 0; i < strength; i++) {
		// if (positionX + i == players[j].playerGraphics.getCurrentPositionX()
		// || positionX - i == players[j].playerGraphics.getCurrentPositionX()
		// || positionY + i == players[j].playerGraphics.getCurrentPositionY()
		// || positionY - i == players[j].playerGraphics.getCurrentPositionY())
		// players[j].playerLogic.looselife();
		// }
		// }

	}

	/**
	 * 
	 * @return
	 */
	private int getPositionX() {
		return positionX;
	}

	/**
	 * 
	 * @return
	 */
	private int getPositionY() {
		return positionY;
	}

	/**
	 * 
	 * @return
	 */
	private int getStrength() {
		return strength;
	}

}

// test commit from local to git

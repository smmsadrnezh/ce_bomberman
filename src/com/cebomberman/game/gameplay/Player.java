package com.cebomberman.game.gameplay;

import java.util.ArrayList;

import com.cebomberman.game.graphics.PlayerGraphics;

/**
 * 
 * @author
 * 
 */
public class Player {
	public PlayerLogic playerLogic;
	public PlayerGraphics playerGraphics;

	/**
	 * 
	 */
	public Player() {
		playerLogic = new PlayerLogic();
		playerGraphics = new PlayerGraphics();
	}

	/**
	 * 
	 */
	public void setBombCoordinate() {
		playerLogic.bombX = playerGraphics.getCurrentPositionX();
		playerLogic.bombY = playerGraphics.getCurrentPositionY();
	}
}
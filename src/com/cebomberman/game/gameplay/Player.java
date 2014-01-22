package com.cebomberman.game.gameplay;

import java.util.ArrayList;

import com.cebomberman.game.graphics.PlayerGraphics;

/**
 * 
 * @author
 * 
 */
public class Player {
	PlayerLogic playerLogic;
	PlayerGraphics playerGraphics;

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
	private void removePoint(){
		
	}
	private void invertKeys(){
		
	}
}
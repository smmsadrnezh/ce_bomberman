package com.cebomberman.game.gameplay;

public class Bomb {
	private int positionX;
	private int positionY;
	private int strength;

	Bomb(int positionX, int positionY, int strength) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.strength = strength;
	}

	private void explode() {

	}

	private int getPositionX() {
		return positionX;
	}

	private int getPositionY() {
		return positionY;
	}

	private int getStrength() {
		return strength;
	}

}

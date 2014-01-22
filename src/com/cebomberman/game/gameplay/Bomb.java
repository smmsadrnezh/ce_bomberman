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
		for (int j = 0; j < com.cebomberman.game.controler.ActionListeners.playerNumbers; j++) {
			for (int i = 0; i < strength; i++) {
				if (positionX + i == players[j].playerGraphics.getCurrentPositionX() || positionX - i == players[j].playerGraphics.getCurrentPositionX() || positionY + i == players[j].playerGraphics.getCurrentPositionY() || positionY - i == players[j].playerGraphics.getCurrentPositionY())
					players[j].playerLogic.looselife();
			}
		}
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

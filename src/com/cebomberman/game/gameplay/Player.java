package com.cebomberman.game.gameplay;

import java.util.ArrayList;

import com.cebomberman.game.graphics.PlayerGraphics;

public class Player {
	PlayerLogic playerLogic;
	PlayerGraphics playerGraphics;
	
	public Player() {
		playerLogic = new PlayerLogic();
		playerGraphics = new PlayerGraphics();
	}
	public void method(){
		playerLogic.x = playerGraphics.getCurrentPositionX();
	}

}
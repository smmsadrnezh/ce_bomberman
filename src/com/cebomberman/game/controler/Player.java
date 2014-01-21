package com.cebomberman.game.controler;

import java.util.ArrayList;

import com.cebomberman.game.gameplay.PlayerLogic;
import com.cebomberman.game.graphics.PlayerGraphics;

public class Player {
	int playerNumbers;
	ArrayList<Player> players = new ArrayList();
	public Player() {
		PlayerLogic playerLogic = new PlayerLogic();
		PlayerGraphics playerGraphics = new PlayerGraphics();
	}
	void PlayerBuilder (){
		for (int i = 0; i < playerNumbers; i++) {
			Player player = new Player();
			players.add(player);
		}
	}
}
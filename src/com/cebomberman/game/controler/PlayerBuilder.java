package com.cebomberman.game.controler;

import java.util.ArrayList;
import com.cebomberman.game.gameplay.Player;

public class PlayerBuilder {
	int playerNumbers = 5;
	ArrayList<Player> players = new ArrayList();
	public PlayerBuilder() {
		for (int i = 0; i < playerNumbers; i++) {
			Player player = new Player();
			players.add(player);
		}
	}
}
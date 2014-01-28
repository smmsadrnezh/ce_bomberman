package com.cebomberman.game.controler;

import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.gameplay.Time;

public class GameLauncher {

	/**
	 * This method gets game options and launch the game.
	 * 
	 * @param fileLocation
	 *            map file location
	 * @param minutes
	 *            total minutes
	 * @param seconds
	 *            total seconds
	 */

	public void gameLauncher(String fileLocation, String minutes, String seconds) {

		// run main game functions
		Controller gameLaunch = new Controller();
		Time timer = new Time();

		// set game options from user input in game starter
		gameLaunch.fileLocation = fileLocation;
		timer.setGameTimeCountdown(minutes, seconds);
	}

	/**
	 * This method build new player and set it's options.
	 * 
	 * @param firstName
	 *            Name of player
	 * @param nickName
	 *            Nickname of player
	 * @param redColor
	 *            set if color of player is red
	 * @param greenColor
	 *            set if color of player is green
	 * @param yellowColor
	 *            set if color of player is yellow
	 * @param blueColor
	 *            set if color of player is blue
	 * @return
	 */
	public Player playerBuilder(String firstName, String nickName,
			boolean redColor, boolean greenColor, boolean yellowColor,
			boolean blueColor) {

		// build new player
		Player player = new Player();

		// Set player name and nickname
		player.playerLogic.setPlayerName(firstName);
		player.playerLogic.setPlayerNickname(nickName);

		// Set player Color
		if (redColor) {
			player.playerGraphics.setColor("red");
		}
		if (greenColor) {
			player.playerGraphics.setColor("green");
		}
		if (yellowColor) {
			player.playerGraphics.setColor("yellow");
		}
		if (blueColor) {
			player.playerGraphics.setColor("blue");
		}
		return player;
		
	}
}

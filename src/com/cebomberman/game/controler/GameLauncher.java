package com.cebomberman.game.controler;

import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.gameplay.Time;
import com.cebomberman.game.graphics.GameStarterComponents;
	
	
public class GameLauncher {
	
	int playersNumber;
	
	public GameLauncher(){
		
	}
	
	public void gameLauncher(String fileLocation, String minutes,String seconds){
		Controller gameLaunch = new Controller();
		gameLaunch.fileLocation = fileLocation;
		Time timer = new Time();
		timer.setGameTimeCountdown(minutes,seconds);
	}
	
	public Player playerBuilder(String firstName, String nickName, boolean redColor, boolean greenColor, boolean yellowColor, boolean blueColor){
		Player player = new Player();
		player.name = firstName;
		return player;
	}
	
}

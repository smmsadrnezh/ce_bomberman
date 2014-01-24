package com.cebomberman.game.gameplay;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
	
	private int gameTimeCountdown;
	int twoSecondsHoleTimer;
	int bombTimer;
	int passingAbilityTimer;
	int bombingDisabilityTimer;
	static Timer timer;
	static int interval;
	
	Time() {
		this.twoSecondsHoleTimer = 2;
		this.bombTimer = 3;
		this.passingAbilityTimer = 5;
		this.bombingDisabilityTimer = 5;
	}
	private void holeMaker(){
	    String secs = "5";
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    System.out.println(secs);
	    timer.scheduleAtFixedRate(new TimerTask() {

	        private int interval = 5;

			public void run() {
	        	Map.holeMaker();
				interval--;
	            if (interval == 1)
	                timer.cancel();
	        }
	    }, delay, period);
	}
	
	int getGameTimeCountdown() {
		return gameTimeCountdown;
	}
	void setGameTimeCountdown(String gameTimeCountdown) {
		this.gameTimeCountdown = Integer.parseInt(gameTimeCountdown);
	}
	
}

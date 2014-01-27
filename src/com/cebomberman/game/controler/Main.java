package com.cebomberman.game.controler;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.cebomberman.game.gameplay.Map;
import com.cebomberman.game.graphics.GameStarter;
import com.cebomberman.game.graphics.MainBoardGraphics;
import com.cebomberman.game.graphics.WinnerReward;
import com.cebomberman.game.sounds.Music;

/**
 * 
 * @author 
 *
 */

public class Main {
	public static void main(String[] args) {
		
		//Player test = new Player();
		//new WinnerReward();
		//MainBoardGraphics test = new MainBoardGraphics(); 
		//new Controller();
		Map map = new Map();
		map.mapCellReader("map.txt");
		for (int i = 0; i < map.getMapWidth(); i++) {
			for (int j = 0; j < map.getMapHeight(); j++) {
				System.out.print(map.getMapWidth());
				System.out.print(map.getMap(i, j)+" ");
			}
			
		}
		
		System.out.println("");
//		Music testsong = new Music("sounds/Explosion.mid");
//		testsong.playSound();
		
	//	GameStarter testing = new GameStarter(); // Create and show the GUI.
//		test.setCellContent(1,6,"box");
//		test.setCellContent(2,4,"box");
//		test.setCellContent(2,8,"box");
//		
//		
//		test.fireEffect(2, 6, 4);
	}

}

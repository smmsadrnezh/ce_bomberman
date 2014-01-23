package com.cebomberman.game.controler;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
		new Controller() ;
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		
//		Music testsong = new Music("sounds/Explosion.mid");
//		testsong.playSound();
		
		//new GameStarter().setVisible(true); // Create and show the GUI.
//		test.setCellContent(1,6,"box");
//		test.setCellContent(2,4,"box");
//		test.setCellContent(2,8,"box");
//		
//		
//		test.fireEffect(2, 6, 4);
	}

}

package com.cebomberman.game.controler;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.graphics.MainBoardGraphics;
import com.cebomberman.game.graphics.PlayerGraphics;

import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * 
 * @author 
 *
 */

public class ActionListeners {
	
	public int playerNumbers = 4;
	public Player[] players = new Player[playerNumbers] ;
	MainBoardGraphics mainBoard ;
	ActionListeners(){
		for (int i = 0; i < playerNumbers; i++) {
			players[i] = new Player() ;
		}
		mainBoard =  new MainBoardGraphics(players);
		
		mainBoard.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case 37:
					mainBoard.players[0].playerGraphics.moveRight("images/players/yellow/movingright.gif");
					break;
				case 38:
					players[0].playerGraphics.moveUp();
					break;
				case 39:
					//players[0].playerGraphics.moveRight();
					break;
				case 40:
					players[0].playerGraphics.moveDown();
					break;
				}
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
	
				// TODO Auto-generated method stub
//				switch (e.getKeyCode()) {
//				case 37:
//					player[].playerGraphics.setIcon(new ImageIcon("images/players/pl2/left.gif"));
//					break;
//				case 38:
//					player[].playerGraphics.setIcon(new ImageIcon("images/players/pl2/up.gif"));
//					break;
//				case 39:
//					player[].playerGraphics.setIcon(new ImageIcon("images/players/pl2/right.gif"));
//					break;
//				case 40:
//					player[].playerGraphics.setIcon(new ImageIcon("images/players/pl2/down.gif"));
//					break;
//				case 13:
//					player.setBombCoordinate();
//					player.playerLogic.bombing();
//				}
			}
	
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
	
			}
	
		});
		
	}
	/**
	 * 
	 * @param playerNumbers
	 */
	void PlayerBuilder (int playerNumbers){
		

	}
}

package com.cebomberman.game.controler;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.graphics.MainBoardGraphics;
import com.cebomberman.game.graphics.PlayerGraphics;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author
 * 
 */

public class Controller implements Runnable {
	Thread a;
	public int playerNumbers = 4;
	public Player[] players = new Player[playerNumbers];
	MainBoardGraphics mainBoard;
	ArrayList<Integer> pressedKeys1 = new ArrayList<>();
	Set<Integer> pressedKeys = new HashSet<Integer>();

	Controller() {

		a = new Thread(this);
		a.setDaemon(true);
		a.start();

		for (int i = 0; i < playerNumbers; i++) {
			players[i] = new Player();
		}
		mainBoard = new MainBoardGraphics(players);

		mainBoard.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case 37:
					pressedKeys.add(37);
					break;
				case 38:
					// mainBoard.players[0].playerGraphics.moveUp();
					pressedKeys.add(38);
					break;
				case 39:
					// mainBoard.players[0].playerGraphics.moveRight();
					pressedKeys.add(39);
					break;
				case 40:
					// mainBoard.players[0].playerGraphics.moveDown();
					pressedKeys.add(40);
					break;
				case 32:
					pressedKeys.add(32);
					break;
				case 65: // a
					pressedKeys.add(65);
					break;
				case 87:
					pressedKeys.add(87);
					break;
				case 68:
					pressedKeys.add(68);
					break;
				case 83:
					pressedKeys.add(83);
					break;
				case 81: // bomb
					pressedKeys.add(81);
					break;
				case 71:
					// mainBoard.players[2].playerGraphics.moveLeft();
					pressedKeys.add(71);
					break;
				case 89:
					// mainBoard.players[2].playerGraphics.moveUp();
					pressedKeys.add(89);
					break;
				case 74: // j
					// mainBoard.players[2].playerGraphics.moveRight();
					pressedKeys.add(74);
					break;
				case 72: // h
					// mainBoard.players[2].playerGraphics.moveDown();
					pressedKeys.add(72);
					break;
				case 84:// bomb
					pressedKeys.add(84);
					break;
				case 75:
					pressedKeys.add(75);
					break;
				case 79: // o
					pressedKeys.add(79);
					break;
				case 186:
					pressedKeys.add(186);
					break;
				case 76:
					pressedKeys.add(76);
					break;
				case 73:
					pressedKeys.add(73);
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case 37:
					// mainBoard.players[0].playerGraphics.moveRight();
					pressedKeys.remove(37);
					break;
				case 38:
					pressedKeys.remove(38);
					break;
				case 39:
					pressedKeys.remove(39);
					break;
				case 40:
					pressedKeys.remove(40);
					break;
				case 32:
					pressedKeys.remove(32);
					break;
				case 65: // a
					// mainBoard.players[1].playerGraphics.moveLeft();
					pressedKeys.remove(65);
					break;
				case 87:
					// mainBoard.players[1].playerGraphics.moveUp();
					pressedKeys.remove(87);
					break;
				case 68:
					// mainBoard.players[1].playerGraphics.moveRight();
					pressedKeys.remove(68);
					break;
				case 83:
					// mainBoard.players[1].playerGraphics.moveDown();
					pressedKeys.remove(83);
					break;
				case 81: // bomb
					pressedKeys.remove(81);
					break;
				case 71:
					// mainBoard.players[2].playerGraphics.moveLeft();
					pressedKeys.remove(71);
					break;
				case 89:
					// mainBoard.players[2].playerGraphics.moveUp();
					pressedKeys.remove(89);
					break;
				case 74: // j
					// mainBoard.players[2].playerGraphics.moveRight();
					pressedKeys.remove(74);
					break;
				case 72: // h
					pressedKeys.remove(72);
					break;
				case 84:// bomb
					pressedKeys.remove(84);
					break;
				case 75:
					pressedKeys.remove(75);
					break;
				case 79: // o
					pressedKeys.remove(79);
					break;
				case 186:
					pressedKeys.remove(186);
					break;
				case 76:
					pressedKeys.remove(76);
					break;
				case 73:
					pressedKeys.remove(73);
					break;
				}

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
	void PlayerBuilder(int playerNumbers) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		while (true) {
			
			
			if (pressedKeys.size() != 0) {	
			try{
				for (int key : pressedKeys) {
					switch (key) {
					case 37:
						mainBoard.players[0].playerGraphics.moveRight();
						break;
					case 38:
						mainBoard.players[0].playerGraphics.moveUp();
						break;
					case 39:
						mainBoard.players[0].playerGraphics.moveRight();
						break;
					case 40:
						mainBoard.players[0].playerGraphics.moveDown();
						break;
					case 65:
						mainBoard.players[1].playerGraphics.moveLeft();
						break;
					case 87:
						mainBoard.players[1].playerGraphics.moveUp();
						break;
					case 68:
						mainBoard.players[1].playerGraphics.moveRight();
						break;
					case 83:
						mainBoard.players[1].playerGraphics.moveDown();
						break;
					case 81: // bomb
						pressedKeys.remove(81);
						break;
					case 71:
						mainBoard.players[2].playerGraphics.moveLeft();
						break;
					case 89:
						mainBoard.players[2].playerGraphics.moveUp();
						break;
					case 74: // j
						mainBoard.players[2].playerGraphics.moveRight();
						break;
					case 72: // h
						mainBoard.players[2].playerGraphics.moveDown();
						break;
					case 84:// bomb
						pressedKeys.remove(84);
						break;
					case 75:
						mainBoard.players[3].playerGraphics.moveLeft();
						break;
					case 79: // o
						mainBoard.players[3].playerGraphics.moveUp();
						break;
					case 186:
						mainBoard.players[3].playerGraphics.moveRight();
						break;
					case 76:
						mainBoard.players[3].playerGraphics.moveDown();
						break;
					case 73:
						pressedKeys.remove(73);
						break;
					}

				}
			}catch(ConcurrentModificationException e){
				
			}
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
	}

}

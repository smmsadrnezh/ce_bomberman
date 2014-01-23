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

public class Controller {

	public int playerNumbers = 4;
	public Player[] players = new Player[playerNumbers];
	MainBoardGraphics mainBoard;

	Controller() {
		for (int i = 0; i < playerNumbers; i++) {
			players[i] = new Player();
		}
		mainBoard = new MainBoardGraphics(players);

		mainBoard.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
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
				case 32:
					mainBoard.jp.setCellContent(
							mainBoard.players[0].playerGraphics
									.getCurrentPositionY(),
							mainBoard.players[0].playerGraphics
									.getCurrentPositionX(), "bomb");
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
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				 case 37:
				 players[0].playerGraphics.setIcon(new
				 ImageIcon("images/players/yellow/movingleft.gif"));
				 break;
				// case 38:
				// player[].playerGraphics.setIcon(new
				// ImageIcon("images/players/pl2/up.gif"));
				// break;
				// case 39:
				// player[].playerGraphics.setIcon(new
				// ImageIcon("images/players/pl2/right.gif"));
				// break;
				// case 40:
				// player[].playerGraphics.setIcon(new
				// ImageIcon("images/players/pl2/down.gif"));
				// break;
				// case 13:
				// player.setBombCoordinate();
				// player.playerLogic.bombing();
				// }
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
}

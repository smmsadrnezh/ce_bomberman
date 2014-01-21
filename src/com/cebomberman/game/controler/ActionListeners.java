package com.cebomberman.game.controler;

import com.cebomberman.game.graphics.MainBoardGraphics;

public class ActionListeners {
	
	MainBoardGraphics mainBoard = new MainBoardGraphics();
	ActionListeners(){
		mainBoard.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// int a =0;
				switch (e.getKeyCode()) {
				case 37:
					player.setIcon(new ImageIcon(
							"images/players/pl2/p2left.gif"));
					for (int i = 0; i < 5; i++) {
						player.setLocation(player.getX() - 1, player.getY());
					}
					keyPressed = 37;
					break;
				case 38:
					player.setIcon(new ImageIcon("images/players/pl2/p2up.gif"));
					player.setLocation(player.getX(), player.getY() - 5);
					keyPressed = 38;
					break;
				case 39:
					player.setIcon(new ImageIcon(
							"images/players/pl2/p2right.gif"));
					player.setLocation(player.getX() + 5, player.getY());
					keyPressed = 39;
					break;
				case 40:
					player.setIcon(new ImageIcon(
							"images/players/pl2/p2down.gif"));
					player.setLocation(player.getX(), player.getY() + 5);
					keyPressed = 40;
					break;
				}
			}
	
			@Override
			public void keyReleased(KeyEvent e) {
	
				// TODO Auto-generated method stub
				switch (keyPressed) {
				case 37:
					player.setIcon(new ImageIcon("images/players/pl2/left.gif"));
					break;
				case 38:
					player.setIcon(new ImageIcon("images/players/pl2/up.gif"));
					break;
				case 39:
					player.setIcon(new ImageIcon("images/players/pl2/right.gif"));
					break;
				case 40:
					player.setIcon(new ImageIcon("images/players/pl2/down.gif"));
					break;
				}
			}
	
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
	
			}
	
		});
	}
}

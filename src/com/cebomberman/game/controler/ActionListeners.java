package com.cebomberman.game.controler;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import com.cebomberman.game.graphics.MainBoardGraphics;
import com.cebomberman.game.graphics.PlayerGraphics;
import java.awt.event.KeyListener;
public class ActionListeners {
	
	MainBoardGraphics mainBoard = new MainBoardGraphics();
	
	ActionListeners(){
		mainBoard.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case 37:
					PlayerGraphics.leftIcon();
					break;
				case 38:
					PlayerGraphics.upIcon();
					break;
				case 39:
					PlayerGraphics.rightIcon();
					break;
				case 40:
					PlayerGraphics.downIcon();
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
	
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
	
			}
	
		});
	}
}

package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.cebomberman.game.controler.ActionListeners;

public class MainBoardGraphics implements Runnable {
	final Cell[][] btns = new Cell[15][15];

	public MainBoardGraphics() {
		//mainboard and its features
		JFrame mainBoard = new JFrame("Bomberman");
		mainBoard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainBoard.setVisible(true);
		mainBoard.setBounds(10, 10, 608, 508);
		mainBoard.setLayout(null);
		mainBoard.setResizable(false);

		// main panel
		JPanel jp = new JPanel();
		mainBoard.setContentPane(jp);
		jp.setLayout(null);

		// information panel
		Panel information = new Panel();
		jp.add(information);
		information.setBounds(0, 0, 120, 480);
		information.setLayout(null);
		information.setBackground(Color.BLACK);

		// gameBoard panel
		Panel gameBoard = new Panel();
		jp.add(gameBoard);
		gameBoard.setBounds(120, 0, 480, 480);
		gameBoard.setBackground(Color.GRAY);
		gameBoard.setLayout(null);

		
		
		final JLabel player = new JLabel();
		player.setBounds(32, 32, 32, 32);
		gameBoard.add(player);
		player.setDisabledIcon(new ImageIcon("player1.gif"));
		player.setIcon(new ImageIcon("player1.gif"));
		player.grabFocus();
		information.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				player.grabFocus();
			}
		});

		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				btns[i][j] = new Cell();
				gameBoard.add(btns[i][j]);
				btns[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				btns[i][j].setEnabled(false);
				btns[i][j].setBackground(Color.GRAY);
				btns[i][j].setBorder(null);
			}
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 14 || j == 0 || j == 14) {
					btns[i][j].setDisabledIcon(new ImageIcon("brick1.gif"));
					btns[i][j].setIcon(new ImageIcon("brick1.gif"));
				}
			}
		btns[5][5].setDisabledIcon(new ImageIcon("images/bomb.gif"));
		btns[5][5].setIcon(new ImageIcon("images/bomb.gif"));
		new Thread(this).start();
		// player.addKeyListener(new KeyListener() {
		//
		// @Override
		// public void keyTyped(KeyEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void keyReleased(KeyEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void keyPressed(KeyEvent e) {
		// // TODO Auto-generated method stub
		//
		// switch (e.getKeyCode()) {
		// case 37:
		// if (player.getX() > 32) {
		// player.setLocation(player.getX() - 8, player.getY());
		// }
		// break;
		// case 38:
		// if (player.getY() > 32) {
		// player.setLocation(player.getX(), player.getY() - 8);
		// }
		// break;
		// case 39:
		// if (player.getX() < 416) {
		// player.setLocation(player.getX() + 8, player.getY());
		// }
		// break;
		// case 40:
		// if (player.getY() < 416) {
		// player.setLocation(player.getX(), player.getY() + 8);
		// }
		// break;
		// case 32:
		//
		//
		// btns[5][5].setDisabledIcon(new ImageIcon("images/bomb.gif"));
		// btns[5][5].setIcon(new ImageIcon("images/bomb.gif"));
		// // for(int i=0;i<15;i++)
		// // for(int j=0;j<15;j++){
		// // if(btns[i][j].getX()<player.getX() &&
		// btns[i][j+1].getX()>player.getX() && btns[i][j].getY()<player.getY()
		// && btns[i+1][j].getY()>player.getY()){
		// // btns[i][j].setDisabledIcon(new ImageIcon("images/bomb.gif"));
		// // btns[i][j].setIcon(new ImageIcon("images/bomb.gif"));
		// // }
		// // }
		//
		//
		// }
		//
		// }
		// });

	}

	public static void main(String[] args) {
		new MainBoardGraphics();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btns[5][4].setDisabledIcon(new ImageIcon("images/flame/leftfire.gif"));
		btns[5][4].setIcon(new ImageIcon("images/flame/leftfire.gif"));
		
		
		btns[5][5].setDisabledIcon(new ImageIcon("images/flame/fire.gif"));
		btns[5][5].setIcon(new ImageIcon("images/flame/fire.gif"));
		
		btns[5][6].setDisabledIcon(new ImageIcon("images/flame/rightfire.gif"));
		btns[5][6].setIcon(new ImageIcon("images/flame/rightfire.gif"));
		
		btns[4][5].setDisabledIcon(new ImageIcon("images/flame/topfire.gif"));
		btns[4][5].setIcon(new ImageIcon("images/flame/topfire.gif"));
		
		btns[6][5].setDisabledIcon(new ImageIcon("images/flame/bottomfire.gif"));
		btns[6][5].setIcon(new ImageIcon("images/flame/bottomfire.gif"));
		
		
	}
}

class Cell extends JButton {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
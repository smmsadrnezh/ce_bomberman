package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cebomberman.game.controler.ActionListeners;
import com.cebomberman.game.gameplay.Player;
/**
 * 
 * @author
 *
 */
public class MainBoardComponents extends JPanel implements Runnable {
	final CellGraphics[][] cells = new CellGraphics[15][15];
	Player[] players ; 
/**
 * 
 */
	public MainBoardComponents(Player[] players) {

		// information panel
		Panel information = new Panel();
		this.add(information);
		information.setBounds(0, 0, 120, 480);
		information.setLayout(null);
		information.setBackground(Color.BLACK);
		
		// gameBoard panel
		Panel gameBoard = new Panel();
		this.add(gameBoard);
		gameBoard.setBounds(120, 0, 480, 480);
		gameBoard.setBackground(Color.GRAY);
		gameBoard.setLayout(null);
		this.players = players ;
//		Player player1 = new Player() ;
//		gameBoard.add(player1.playerGraphics) ;
//		player1.playerGraphics.setBounds(50, 50, 32, 32);
//		player1.playerGraphics.setBackground(Color.BLUE);
		for(int i=0;i<4;i++){
			gameBoard.add(players[i].playerGraphics);
			players[i].playerGraphics.setBounds(32*i, 32*i, 32, 32);
			
		}
	
		players[0].playerGraphics.moveRight("images/players/yellow/movingright.gif");
		players[0].playerGraphics.setBounds(32, 32, 32, 32);
		
		players[1].playerGraphics.setIcon(new ImageIcon("images/players/blue/left.gif"));
		players[1].playerGraphics.setBounds(416, 32, 32, 32);
		
		players[2].playerGraphics.setIcon(new ImageIcon("images/players/green/right.gif"));
		players[2].playerGraphics.setBounds(32, 416, 32, 32);
		
		players[3].playerGraphics.setIcon(new ImageIcon("images/players/red/right.gif"));
		players[3].playerGraphics.setBounds(416, 416, 32, 32);		
		
	//	new Thread(this).start();
		

		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				cells[i][j] = new CellGraphics();
				gameBoard.add(cells[i][j]);
				cells[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				cells[i][j].setBackground(Color.GRAY);
			}
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 14 || j == 0 || j == 14) {
					cells[i][j].setIcon(new ImageIcon("images/brick1.gif"));
				}
			}

	}
/**
 * 
 * @param i
 * @param j
 * @param content
 */
	public void setCellContent(int i, int j, String content) {
		cells[i][j].setContent(content);
		setDefaultImages();
	}
/**
 * 
 * @param cell
 * @param imagePath
 */
	private void setCellImage(CellGraphics cell, String imagePath) {
		// cell.setDisabledIcon(new ImageIcon(imagePath));
		cell.setIcon(new ImageIcon(imagePath));
	}
/**
 * 
 */
	private void setDefaultImages() {
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (cells[i][j].getContent() == "block") {
					setCellImage(cells[i][j], "images/block.gif");
				} else if (cells[i][j].getContent() == "box") {
					setCellImage(cells[i][j], "images/box.gif");
				}
			}
	}
/**
 * 
 * @param row
 * @param column
 * @param strength
 */
	private void fireUp(int row, int column, int strength) {
		boolean flag = true;
		for (int i = row - 1; i > row - strength; i--) {
			setCellImage(cells[i][column], "images/flame/vfire.gif");
			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/topfire.gif");
				flag = false;
				break;
			} else if (cells[i - 1][column].getContent() == "block" || i == 1) {
				setCellImage(cells[i][column], "images/flame/topfire.gif");
				flag = false;
				break;
			}
		}
		if (flag) {
			setCellImage(cells[row - strength][column],
					"images/flame/topfire.gif");
		}
	}
/**
 * 
 * @param row
 * @param column
 * @param strength
 */
	private void fireDown(int row, int column, int strength) {
		boolean flag = true;
		for (int i = row + 1; i < row + strength; i++) {
			setCellImage(cells[i][column], "images/flame/vfire.gif");

			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/downfire.gif");
				flag = false;
				break;
			} else if (cells[i + 1][column].getContent() == "block" || i == 13) {
				setCellImage(cells[i][column], "images/flame/bottomfire.gif");
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row + strength][column],
					"images/flame/bottomfire.gif");
		}
	}
/**
 * 
 * @param row
 * @param column
 * @param strength
 */
	private void fireRight(int row, int column, int strength) {
		boolean flag = true;
		for (int i = column + 1; i < column + strength; i++) {
			setCellImage(cells[row][i], "images/flame/hfire.gif");

			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/rightfire.gif");
				flag = false;
				break;
			} else if (cells[row][i + 1].getContent() == "block" || i == 13) {
				setCellImage(cells[row][i], "images/flame/rightfire.gif");
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row][column + strength],
					"images/flame/rightfire.gif");
		}
	}
/**
 * 
 * @param row
 * @param column
 * @param strength
 */
	private void fireLeft(int row, int column, int strength) {
		boolean flag = true;
		for (int i = column - 1; i > column - strength; i--) {
			setCellImage(cells[row][i], "images/flame/hfire.gif");

			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/leftfire.gif");
				flag = false;
				break;
			} else if (cells[row][i - 1].getContent() == "block" || i == 1) {
				setCellImage(cells[row][i], "images/flame/leftfire.gif");
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row][column - strength],
					"images/flame/leftfire.gif");
		}

	}
/**
 * 
 * @param row
 * @param column
 * @param strength
 */
	public void fireEffect(int row, int column, int strength) {
		// if (row != 1 && row != 13 && column != 1 && column != 13) {
		setCellImage(cells[row][column], "images/flame/fire.gif");
		// right fire
		if (cells[row][column + 1].getContent() != "block" && column != 13)
			fireRight(row, column, strength);
		// left fire
		if (cells[row][column - 1].getContent() != "block" && column != 1)
			fireLeft(row, column, strength);
		// top fire
		if (cells[row - 1][column].getContent() != "block" && row != 1)
			fireUp(row, column, strength);
		// down fire
		if (cells[row + 1][column].getContent() != "block" && row != 13)
			fireDown(row, column, strength);

	}
/**
 * 
 */
	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 5; i++) {
//			player.setIcon(new ImageIcon("images/players/yellow/right.gif"));
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			player.setIcon(new ImageIcon(""));
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		player.setIcon(new ImageIcon("images/players/yellow/right.gif"));
//		// player.setIcon(new ImageIcon("images/players/yellow/right.gif"));
	}

}

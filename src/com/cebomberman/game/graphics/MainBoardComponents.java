package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cebomberman.game.controler.Controller;
import com.cebomberman.game.gameplay.Player;

/**
 * 
 * @author
 * 
 */
public class MainBoardComponents extends JPanel implements Runnable {
	final CellGraphics[][] cells = new CellGraphics[15][15];
	Player[] players;
	Thread thread1;

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

		this.players = players;
//		 Player player1 = new Player() ;
//		 gameBoard.add(player1.playerGraphics) ;
//		 player1.playerGraphics.setBounds(100, 100, 32, 32);
//		 player1.playerGraphics.setIcon(new ImageIcon("images/speed.gif"));
		for (int i = 0; i < 4; i++) {
			gameBoard.add(players[i].playerGraphics);
			players[i].playerGraphics.setBounds(32 * i, 32 * i, 32, 32);

		}

		players[0].playerGraphics.setColor("yellow");
		players[0].playerGraphics.moveRight();
		// players[0].playerGraphics.moveRight("images/players/yellow/movingright.gif");
		players[0].playerGraphics.setBounds(32, 32, 32, 32);

		players[1].playerGraphics.setColor("green");
		players[1].playerGraphics.setBounds(416, 32, 32, 32);
		players[1].playerGraphics.moveLeft();

		players[2].playerGraphics.setColor("blue");
		players[2].playerGraphics.setBounds(32, 416, 32, 32);
		players[2].playerGraphics.moveRight();

		players[3].playerGraphics.setColor("red");
		players[3].playerGraphics.setBounds(416, 416, 32, 32);
		players[3].playerGraphics.moveLeft();

		// new Thread(this).start();

		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				cells[i][j] = new CellGraphics();
				gameBoard.add(cells[i][j]);
				cells[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				cells[i][j].setBackground(Color.GRAY);
				if (i != 0 && i != 14 && j != 0 && j != 14)
					cells[i][j].setContent("empty");
			}
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 14 || j == 0 || j == 14) {
					cells[i][j].setIcon(new ImageIcon("images/brick.gif"));
					setCellContent(i, j, "block");
				}
			}
		
		cells[5][5].box.setContent("speed");
		setCellContent(5,5,"box");
		setCellContent(3,5,"block");
	
		
		
		new Thread(this).start();
		
	}

	/**
	 * 
	 * @param i
	 * @param j
	 * @param content
	 */

	public CellGraphics getCell(int row, int column) {
		return cells[row][column];
	}

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
					setCellImage(cells[i][j], "images/brick.gif");
				} else if (cells[i][j].getContent() == "box") {
					setCellImage(cells[i][j], "images/box.gif");
				} else if (cells[i][j].getContent() == "bomb") {
					setCellImage(cells[i][j], "images/bomb.gif");
				} else if (cells[i][j].getContent() == "empty") {
					setCellImage(cells[i][j], "");
				}
			}
	}

	public void activateBomb(final int row, final int column, final int strength) {
		fireEffect(row, column, strength);
		final Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				for (int i = row - strength; i <= row + strength; i++)
					for (int j = column - strength; j <= column + strength; j++) {
						if (i == row || j == column)
							if (i > 0 && i < 14 && j > 0 && j < 14) {
								if(cells[i][j].getContent()=="box" ){
									switch(cells[i][j].box.getContent()){
									case "life":
										setCellImage(cells[i][j],cells[i][j].box.getLifeImageePath()) ;
										break;
									case "speed":
										setCellContent(i,j,"empty") ;
										System.out.println(i+" "+j);
										cells[i][j].setIcon(new ImageIcon("images/speed.gif"));
										break;
									case "bombstrength":
										
										break;
									case "passingability":
									
										break;
									case "bombnumber":
										
										break;
									case "invertkeys":
										
										break;
									case "loselastability":
										
										break;
									case "losebombingability":
										
										break;
									}
								}else if(cells[i][j].getContent()!="block" /*&& (cells[i][j].getContent()!="bomb" && i!=row && j!=column)*/ ){
									setCellContent(i, j, "empty");
									System.out.println("no if");
								}
								else{
									//setCellContent(i, j, "empty");
									System.out.println("no");
								}
								cells[i][j].setIsFired(false);
							}
					}
				timer.cancel();

			}

		}, 4000, 1);
		// System.out.println("test");
		//setDefaultImages();
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
			cells[i][column].setIsFired(true); // ////////////
			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/topfire.gif");
				cells[i][column].setIsFired(true);
				flag = false;
				break;
			} else if (cells[i - 1][column].getContent() == "block" || i == 1) {
				setCellImage(cells[i][column], "images/flame/topfire.gif");
				cells[i][column].setIsFired(true);
				flag = false;
				break;
			}
		}
		if (flag) {
			setCellImage(cells[row - strength][column],
					"images/flame/topfire.gif");
			cells[row - strength][column].setIsFired(true);
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
			cells[i][column].setIsFired(true);
			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/bottomfire.gif");
				cells[i][column].setIsFired(true);
				flag = false;
				break;
			} else if (cells[i + 1][column].getContent() == "block" || i == 13) {
				setCellImage(cells[i][column], "images/flame/bottomfire.gif");
				cells[i][column].setIsFired(true);
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row + strength][column],
					"images/flame/bottomfire.gif");
			cells[row + strength][column].setIsFired(true);
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
			cells[row][i].setIsFired(true);
			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/rightfire.gif");
				cells[row][i].setIsFired(true);
				flag = false;
				break;
			} else if (cells[row][i + 1].getContent() == "block" || i == 13) {
				setCellImage(cells[row][i], "images/flame/rightfire.gif");
				cells[row][i].setIsFired(true);
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row][column + strength],
					"images/flame/rightfire.gif");
			cells[row][column + strength].setIsFired(true);
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
			cells[row][i].setIsFired(true);
			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/leftfire.gif");
				cells[row][i].setIsFired(true);
				flag = false;
				break;
			} else if (cells[row][i - 1].getContent() == "block" || i == 1) {
				setCellImage(cells[row][i], "images/flame/leftfire.gif");
				cells[row][i].setIsFired(true);
				flag = false;
				break;
			}

		}
		if (flag) {
			setCellImage(cells[row][column - strength],
					"images/flame/leftfire.gif");
			cells[row][column - strength].setIsFired(true);
		}

	}

	/**
	 * 
	 * @param row
	 * @param column
	 * @param strength
	 */
	public void fireEffect(final int row, final int column, final int strength) {
		final Timer timer1 = new Timer();
		final Timer timer2 = new Timer();
		timer1.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				setCellImage(cells[row][column], "images/flame/fire.gif");
				cells[row][column].setIsFired(true);
				// right fire
				if (cells[row][column + 1].getContent() != "block"
						&& column != 13)
					fireRight(row, column, strength);
				// left fire
				if (cells[row][column - 1].getContent() != "block"
						&& column != 1)
					fireLeft(row, column, strength);
				// top fire
				if (cells[row - 1][column].getContent() != "block" && row != 1)
					fireUp(row, column, strength);
				// down fire
				if (cells[row + 1][column].getContent() != "block" && row != 13)
					fireDown(row, column, strength);
				timer1.cancel();
			}

		}, 3000, 1);
		
		// System.out.println("test");
		// setDefaultImages();

		// if (row != 1 && row != 13 && column != 1 && column != 13) {

	}

	/**
 * 
 */
	@Override
	public void run() {
		while (true) {
			for (int i = 1; i < 14; i++)
				for (int j = 1; j < 14; j++) {
					for (int k = 0; k < 4; k++) {
						if (cells[i][j].isFired()
								&& players[k].playerGraphics
										.getCurrentPositionX() == j
								&& players[k].playerGraphics
										.getCurrentPositionY() == i) { // // k=
																		// player
																		// numbers
							if (players[k].playerLogic.getLifeNumber() == 1) {
								players[k].playerGraphics
										.boom();
								players[k].playerGraphics.setVisible(false);
							}
							players[k].playerLogic
									.setLifeNumber(players[0].playerLogic
											.getLifeNumber() - 1);

						}
					}
				}
		}
		// fireEffect(1,1,1);
		// // TODO Auto-generated method stub
		// for (int p = 0; p < 5; p++) {
		// players[0].playerGraphics.setIcon(new
		// ImageIcon("images/players/yellow/right.gif"));
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// players[0].playerGraphics.setIcon(new ImageIcon(""));
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		// players[0].playerGraphics.setIcon(new
		// ImageIcon("images/players/yellow/right.gif"));
		// // player.setIcon(new ImageIcon("images/players/yellow/right.gif"));
	}
}

package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cebomberman.game.controler.Controller;
import com.cebomberman.game.gameplay.Map;
import com.cebomberman.game.gameplay.Player;

/**
 * sets all properties and features of mainboard of game
 * @author arman and masud
 * 
 */
public class MainBoardComponents extends JPanel implements Runnable {
	final CellGraphics[][] cells = new CellGraphics[15][15];
	Player[] players;
	Thread thread1;
	Map map;

	/**
 * creates the components of the main board 
 */
	public MainBoardComponents(Player[] players) {

		// information panel
//		GameBoardPanel jp2 = new GameBoardPanel();
//		this.add(jp2);
//		jp2.setBounds(0, 0, 120, 480);
		
//		GameBoardPanel panel1 = new GameBoardPanel() ;
//		this.add(panel1) ;
//		panel1.setBounds(0, 0, 120, 480);
//		panel1.setLayout(null);
		
		// gameBoard panel
		Panel gameBoard = new Panel();
		this.add(gameBoard);
		gameBoard.setBounds(120, 0, 480, 480);
		gameBoard.setBackground(Color.GRAY);
		gameBoard.setLayout(null);
		
		this.players = players;
		for (int i = 0; i < 4; i++) {
			gameBoard.add(players[i].playerGraphics);
			players[i].playerGraphics.setBounds(32 * i, 32 * i, 32, 32);

		}

		players[0].playerGraphics.setColor("yellow");
		players[0].playerGraphics.setRightImage();
		players[0].playerGraphics.setBounds(32, 32, 32, 32);

		players[1].playerGraphics.setColor("green");
		players[1].playerGraphics.setBounds(416, 32, 32, 32);
		players[1].playerGraphics.setLeftImage();

		players[2].playerGraphics.setColor("blue");
		players[2].playerGraphics.setBounds(32, 416, 32, 32);
		players[2].playerGraphics.setRightImage();

		players[3].playerGraphics.setColor("red");
		players[3].playerGraphics.setBounds(416, 416, 32, 32);
		players[3].playerGraphics.setLeftImage();

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
		// for (int i = 0; i < 15; i++)
		// for (int j = 0; j < 15; j++) {
		// if (i == 0 || i == 14 || j == 0 || j == 14) {
		// cells[i][j].setIcon(new ImageIcon("images/brick.gif"));
		// setCellContent(i, j, "block");
		// }
		// }
		// cells[2][3].box.setContent("speed");
		// cells[4][3].box.setContent("life");
		// setCellContent(5, 5, "box");
		// setCellContent(4, 5, "box");
		// setCellContent(3, 5, "block");

		map = new Map();
		map.mapCellReader("map.txt");
		for (int i = 0; i < map.getMapWidth(); i++) {
			for (int j = 0; j < map.getMapHeight(); j++) {
				setCellContent(i, j, map.getMap(i, j));

			}

		}
		setBoxContent();
		new Thread(this).start();

	}
/**
 * this method sets the content of all boxes by the probability  
 */
	void setBoxContent() {

		int boxNumber = 0;

		int speedupProbability = 3;
		int bombNumberIncrementProbability = 3;
		int bombStrenghtIncrementProbability = 2;
		int addLifeProbability = 1;
		int passingAbilityProbability = 1;
		int invertArrowKeysProbability = 1;
		int loseLastAbilityProbability = 2;
		int loseBombingAbilityProbability = 2;

		int totalProbability = speedupProbability
				+ bombNumberIncrementProbability
				+ bombStrenghtIncrementProbability + addLifeProbability
				+ passingAbilityProbability + invertArrowKeysProbability
				+ loseLastAbilityProbability + loseBombingAbilityProbability;

		for (int i = 0; i < map.getMapWidth(); i++)
			for (int j = 0; j < map.getMapHeight(); j++) {
				if (cells[i][j].getContent() == "box") {
					boxNumber++;
				}
			}

		double[] boxRandomProbability = new double[boxNumber];
		CellGraphics[] boxCellPointer = new CellGraphics[boxNumber];
		int h = 0;
		for (int j = 0; j < map.getMapWidth(); j++)
			for (int k = 0; k < map.getMapHeight(); k++) {
				if (cells[j][k].getContent() == "box") {
					boxCellPointer[h] = cells[j][k];
					h++;
				}
			}

		for (int i = 0; i < boxNumber; i++) {
			Random temp = new Random();
			boxRandomProbability[i] = temp.nextDouble();
			System.out.println(boxRandomProbability[i]);
			if (0 < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) speedupProbability
							/ totalProbability)
				boxCellPointer[i].box.setContent("speedUp");

			if ((float) speedupProbability / totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability + bombNumberIncrementProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("bombNumberIncrement");
			if ((float) (speedupProbability + bombNumberIncrementProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability + bombStrenghtIncrementProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("bombStrenghtIncrement");
			if ((float) (speedupProbability + bombNumberIncrementProbability + bombStrenghtIncrementProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrenghtIncrementProbability + addLifeProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("addLife");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrenghtIncrementProbability + addLifeProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrenghtIncrementProbability
							+ addLifeProbability + passingAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("passingAbility");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrenghtIncrementProbability + addLifeProbability + passingAbilityProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrenghtIncrementProbability
							+ addLifeProbability + passingAbilityProbability + invertArrowKeysProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("invertArrowKeys");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrenghtIncrementProbability + addLifeProbability
					+ passingAbilityProbability + invertArrowKeysProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrenghtIncrementProbability
							+ addLifeProbability + passingAbilityProbability
							+ invertArrowKeysProbability + loseLastAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("loseLastAbility");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrenghtIncrementProbability + addLifeProbability
					+ passingAbilityProbability + invertArrowKeysProbability + loseLastAbilityProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrenghtIncrementProbability
							+ addLifeProbability + passingAbilityProbability
							+ invertArrowKeysProbability
							+ loseLastAbilityProbability + loseBombingAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box
						.setContent("loseBombingAbility");

		}

		for (int i = 0; i < 10; i++)
			System.out.println(boxCellPointer[i].box.getContent());
	}

	/**
	 * 
	 * @param row
	 * @param column
	 * @return cell in rownumber row and columnnumber column
	 */
	public CellGraphics getCell(int row, int column) {
		return cells[row][column];
	}

	public void setCellContent(int i, int j, String content) {
		cells[i][j].setContent(content);
		setDefaultImage(i, j);
	}

	/**
	 * 
	 * @param cell
	 * @param imagePath path of the image that will be set on the cell
	 */
	private void setCellImage(CellGraphics cell, String imagePath) {
		// cell.setDisabledIcon(new ImageIcon(imagePath));
		cell.setIcon(new ImageIcon(imagePath));
	}

	/**
	 * 
	 * @param i row of the cell 
	 * @param j	column of the cell
	 */
	private void setDefaultImage(int i, int j) {
		// for (int i = 0; i < 15; i++)
		// for (int j = 0; j < 15; j++) {

		if (cells[i][j].getContent() == "block") {
			setCellImage(cells[i][j], "images/brick.gif");
		} else if (cells[i][j].getContent() == "box") {
			setCellImage(cells[i][j], "images/box.gif");
			// } else if (cells[i][j].getContent() == "bomb") {
			// setCellImage(cells[i][j], "images/bomb.gif");
		} else if (cells[i][j].getContent() == "empty") {
			setCellImage(cells[i][j], "");
		} else if (cells[i][j].getContent() == "openedbox") {
			setCellImage(cells[i][j], "");
		} else if (cells[i][j].getContent() == "hole") {
			setCellImage(cells[i][j], "images/hole.gif");
		}
	}

	/**
	 * 
	 * @param row = row of the bomb cell
	 * @param column = column of the bomb cell
	 * @param strength = strength of the bomb
	 */
	public void activateBomb(final int row, final int column, final int strength) {
		// fireEffect(row, column, strength);
		// setDefaultImages();
		setCellContent(row, column, "empty");
		// cells[row][column].setIcon(new ImageIcon("images/brick.gif"));
		for (int i = row - strength; i <= row + strength; i++)
			for (int j = column - strength; j <= column + strength; j++) {
				if (i == row || j == column)
					if (i > 0 && i < 14 && j > 0 && j < 14)
						if (cells[i][j].getContent() == "box") {
							if (cells[i][j].box.isOpened())
								if (cells[i][j].box.getContent() == "addLife")
									setCellImage(cells[i][j],
											cells[i][j].box.getLifeImagePath());
								else if (cells[i][j].box.getContent() == "speedUp")
									setCellImage(cells[i][j],
											cells[i][j].box.getSpeedImagePath());
								else if (cells[i][j].box.getContent() == "bombNumberIncrement")
									setCellImage(cells[i][j],
											cells[i][j].box
													.getBombNumberImagePath());
								else if (cells[i][j].box.getContent() == "bombStrenghtIncrement")
									setCellImage(cells[i][j],
											cells[i][j].box
													.getBombStrengthImagePath());
								else if (cells[i][j].box.getContent() == "passingAbility")
									setCellImage(
											cells[i][j],
											cells[i][j].box
													.getPassingAbilityImagePath());
								else if (cells[i][j].box.getContent() == "invertArrowKeys")
									setCellImage(
											cells[i][j],
											cells[i][j].box
													.getInvertArrowKeysImagePath());
								else if (cells[i][j].box.getContent() == "loseLastAbility")
									setCellImage(
											cells[i][j],
											cells[i][j].box
													.getLoseLastAbilityImagePath());
								else if (cells[i][j].box.getContent() == "loseBombingAbility")
									setCellImage(cells[i][j],
											cells[i][j].box
													.getLoseBombingAbility());

						} else if (cells[i][j].getContent() == "block") {
							setDefaultImage(i, j);
						}

			}

	}

	/**
	 * 
	 * @param row 
	 * @param column
	 * @param strength = strength of the bomb
	 */
	private void fireUp(int row, int column, int strength) {
		boolean flag = true;
		for (int i = row - 1; i > row - strength; i--) {
			setCellImage(cells[i][column], "images/flame/vfire.gif");
			cells[i][column].setIsFired(true); // ////////////
			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/topfire.gif");
				cells[i][column].setIsFired(true);
				cells[i][column].box.setIsOpened(true);
				// setCellContent(i,column,"openedbox") ;
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
	 * @param strength = strength of the bomb
	 */
	private void fireDown(int row, int column, int strength) {
		boolean flag = true;
		for (int i = row + 1; i < row + strength; i++) {
			setCellImage(cells[i][column], "images/flame/vfire.gif");
			cells[i][column].setIsFired(true);
			if (cells[i][column].getContent() == "box") {
				setCellImage(cells[i][column], "images/flame/bottomfire.gif");
				cells[i][column].setIsFired(true);
				cells[i][column].box.setIsOpened(true);
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
	 * @param strength = strength of the bomb
	 */
	private void fireRight(int row, int column, int strength) {
		boolean flag = true;
		for (int i = column + 1; i < column + strength; i++) {
			setCellImage(cells[row][i], "images/flame/hfire.gif");
			cells[row][i].setIsFired(true);
			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/rightfire.gif");
				cells[row][i].setIsFired(true);
				cells[row][i].box.setIsOpened(true);
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
	 * @param strength = strength of the bomb
	 */ 
	private void fireLeft(int row, int column, int strength) {
		boolean flag = true;
		for (int i = column - 1; i > column - strength; i--) {
			setCellImage(cells[row][i], "images/flame/hfire.gif");
			cells[row][i].setIsFired(true);
			if (cells[row][i].getContent() == "box") {
				setCellImage(cells[row][i], "images/flame/leftfire.gif");
				cells[row][i].setIsFired(true);
				cells[row][i].box.setIsOpened(true);
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
	 * @param row = row of the bomb
	 * @param column = column of the bomb
	 * @param strength = strength of the bomb
	 */
	public void fireEffect(final int row, final int column, final int strength,final Player bomber) {
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
		timer2.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = row - strength; i <= row + strength; i++)
					for (int j = column - strength; j <= column + strength; j++) {
						if (i == row || j == column)
							if (i > 0 && i < 14 && j > 0 && j < 14) {
								setDefaultImage(i, j);
								cells[i][j].setIsFired(false);
							}
					}
				bomber.playerLogic.setBombNumber(bomber.playerLogic.getBombNumber()+1);
				activateBomb(row, column, strength);
				timer2.cancel();

			}

		}, 4000, 1);

	
	}

	/**
 * ckecks the number of player lives and set appropriate properties when player get bonus 
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

								players[k].playerGraphics.boom();
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								players[k].playerGraphics.setVisible(false);
								// System.out.println("test");
							}
							players[k].playerLogic.lifeNumberDecrement();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							cells[i][j].setIsFired(false);

						}
					}
				}
			// System.out.println(players[0].playerLogic.getLifeNumber());
			for (int i = 1; i < 14; i++)
				for (int j = 1; j < 14; j++)
					for (int k = 0; k < 4; k++) {
						if (cells[i][j].box.isOpened()) {
							if (players[k].playerGraphics.getCurrentPositionX() == j
									&& players[k].playerGraphics
											.getCurrentPositionY() == i) {
								players[k].playerLogic.getBonus(cells[i][j].box
										.getContent());
								// System.out.println(players[k].playerLogic
								// .getLifeNumber());
								cells[i][j].box.setIsOpened(false);
								setCellContent(i, j, "empty");
							}
						}
					}

		}

	}
}
package com.cebomberman.game.graphics;

import java.awt.Color;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cebomberman.game.gameplay.Map;
import com.cebomberman.game.gameplay.Player;

/**
 * sets all properties and features of mainboard of game
 * 
 * @author arman and masud
 * 
 */
public class MainBoardComponents extends JPanel implements Runnable {
	final CellGraphics[][] cells = new CellGraphics[15][15];
	Player[] players;
	Thread thread1;
	Map map;
	int row;
	int column;
	int playersNumber;
	Timer timer;
	int interval;

	/**
	 * creates the components of the main board
	 */
	public MainBoardComponents(Player[] players, int playersNumber) {
		final JLabel time = new JLabel();
		// information panel
		// Panel jp2 = new Panel();
		// this.add(jp2);
		// jp2.setBounds(0, 0, 120, 480);

		// GameBoardPanel panel1 = new GameBoardPanel() ;
		// this.add(panel1) ;
		// panel1.setBounds(0, 0, 120, 480);
		// panel1.setVisible(true);
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				interval--;
				time.setText(interval + "");
				if (interval == 0) {
					timer.cancel();
				}
			}
		}, 1000, 1000);

		// gameBoard panel
		JPanel gameBoard = new JPanel();
		this.add(gameBoard);
		gameBoard.setBounds(120, 0, 480, 480);
		gameBoard.setBackground(Color.GRAY);
		gameBoard.setLayout(null);
		// gameBoard.setFocusable(true);
		// gameBoard.requestFocusInWindow() ;
		// gameBoard.grabFocus();
		this.playersNumber = playersNumber;
		this.players = players;
		for (int i = 0; i < playersNumber; i++) {
			gameBoard.add(players[i].playerGraphics);
			players[i].playerGraphics.setBounds(32, 32, 32, 32);

		}

		// map
		map = new Map();
		map.mapCellReader("map.txt");

		row = map.getMapWidth();
		column = map.getMapHeight();

		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++) {
				cells[i][j] = new CellGraphics();
				gameBoard.add(cells[i][j]);
				cells[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				cells[i][j].setBackground(Color.GRAY);
				if (i != 0 && i != row && j != 0 && j != column)
					cells[i][j].setContent("empty");
			}

		for (int i = 0; i < map.getMapWidth(); i++) {
			for (int j = 0; j < map.getMapHeight(); j++) {
				setCellContent(i, j, map.getMap(i, j));

			}

		}

		setBoxContent();
		if (playersNumber == 2) {
			setPlayers();
		} else if (playersNumber == 3) {
			setPlayers();
			players[2].playerGraphics.setColor("blue");
			players[2].playerGraphics.setBounds(32, (row - 2) * 32, 32, 32);
			players[2].playerGraphics.setRightImage();
		} else if (playersNumber == 4) {
			setPlayers();
			players[2].playerGraphics.setColor("blue");
			players[2].playerGraphics.setBounds(32, (row - 2) * 32, 32, 32);
			players[2].playerGraphics.setRightImage();
			players[3].playerGraphics.setColor("red");
			players[3].playerGraphics.setBounds((column - 2) * 32,
					(row - 2) * 32, 32, 32);
			players[3].playerGraphics.setLeftImage();
		}

		new Thread(this).start();

	}

	void setPlayers() {
		players[0].playerGraphics.setColor("yellow");
		players[0].playerGraphics.setRightImage();
		players[0].playerGraphics.setBounds(32, 32, 32, 32);

		players[1].playerGraphics.setColor("green");
		players[1].playerGraphics.setBounds((column - 2) * 32, 32, 32, 32);
		players[1].playerGraphics.setLeftImage();
	}

	/**
	 * this method sets the content of all boxes by the probability
	 */
	void setBoxContent() {

		int boxNumber = 0;

		int speedupProbability = 2;
		int bombNumberIncrementProbability = 1;
		int bombStrengthIncrementProbability = 1;
		int addLifeProbability = 2;
		int passingAbilityProbability = 1;
		int invertArrowKeysProbability = 2;
		int loseLastAbilityProbability = 2;
		int loseBombingAbilityProbability = 2;
		int emptyProbability = 2;

		int totalProbability = speedupProbability
				+ bombNumberIncrementProbability
				+ bombStrengthIncrementProbability + addLifeProbability
				+ passingAbilityProbability + invertArrowKeysProbability
				+ loseLastAbilityProbability + loseBombingAbilityProbability
				+ emptyProbability;

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
			// System.out.println(boxRandomProbability[i]);
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
							+ bombNumberIncrementProbability + bombStrengthIncrementProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("bombStrengthIncrement");
			if ((float) (speedupProbability + bombNumberIncrementProbability + bombStrengthIncrementProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability + addLifeProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("addLife");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrengthIncrementProbability + addLifeProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability
							+ addLifeProbability + passingAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("passingAbility");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrengthIncrementProbability + addLifeProbability + passingAbilityProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability
							+ addLifeProbability + passingAbilityProbability + invertArrowKeysProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("invertArrowKeys");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrengthIncrementProbability + addLifeProbability
					+ passingAbilityProbability + invertArrowKeysProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability
							+ addLifeProbability + passingAbilityProbability
							+ invertArrowKeysProbability + loseLastAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("loseLastAbility");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrengthIncrementProbability + addLifeProbability
					+ passingAbilityProbability + invertArrowKeysProbability + loseLastAbilityProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability
							+ addLifeProbability + passingAbilityProbability
							+ invertArrowKeysProbability
							+ loseLastAbilityProbability + loseBombingAbilityProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("loseBombingAbility");
			if ((float) (speedupProbability + bombNumberIncrementProbability
					+ bombStrengthIncrementProbability + addLifeProbability
					+ passingAbilityProbability + invertArrowKeysProbability + loseLastAbilityProbability)
					/ totalProbability < boxRandomProbability[i]
					&& boxRandomProbability[i] < (float) (speedupProbability
							+ bombNumberIncrementProbability
							+ bombStrengthIncrementProbability
							+ addLifeProbability + passingAbilityProbability
							+ invertArrowKeysProbability
							+ loseLastAbilityProbability
							+ loseBombingAbilityProbability + emptyProbability)
							/ totalProbability)
				boxCellPointer[i].box.setContent("empty");

		}

	}

	/**
	 * 
	 * @param row
	 * @param column
	 * @return cell in row number row and column number column
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
	 * @param imagePath
	 *            path of the image that will be set on the cell
	 */
	private void setCellImage(CellGraphics cell, String imagePath) {
		// cell.setDisabledIcon(new ImageIcon(imagePath));
		cell.setIcon(new ImageIcon(imagePath));
	}

	/**
	 * 
	 * @param i
	 *            row of the cell
	 * @param j
	 *            column of the cell
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
	 * @param row
	 *            = row of the bomb cell
	 * @param column
	 *            = column of the bomb cell
	 * @param strength
	 *            = strength of the bomb
	 */
	public void activateBomb(final int row, final int column, final int strength) {
		// fireEffect(row, column, strength);
		// setDefaultImages();
		setCellContent(row, column, "empty");
		// cells[row][column].setIcon(new ImageIcon("images/brick.gif"));
		for (int i = row - strength; i <= row + strength; i++)
			for (int j = column - strength; j <= column + strength; j++) {
				if (i == row || j == column)
					if (i > 0 && i < this.row && j > 0 && j < this.column)
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
								else if (cells[i][j].box.getContent() == "bombStrengthIncrement")
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
								else if (cells[i][j].box.getContent() == "empty")
									setCellImage(cells[i][j], "");
						} else if (cells[i][j].getContent() == "block") {
							setDefaultImage(i, j);
						}

			}

	}

	/**
	 * 
	 * @param row
	 * @param column
	 * @param strength
	 *            = strength of the bomb
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
	 * @param strength
	 *            = strength of the bomb
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
	 * @param strength
	 *            = strength of the bomb
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
	 * @param strength
	 *            = strength of the bomb
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
	 * @param row
	 *            = row of the bomb
	 * @param column
	 *            = column of the bomb
	 * @param strength
	 *            = strength of the bomb
	 */
	public void fireEffect(final int row, final int column, final int strength,
			final Player bomber) {
		final int boardRow = this.row;
		final int boardColumn = this.column;
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
							if (i > 0 && i < boardRow && j > 0
									&& j < boardColumn) {
								setDefaultImage(i, j);
								cells[i][j].setIsFired(false);
							}
					}
				bomber.playerLogic.setBombNumber(bomber.playerLogic
						.getBombNumber() + 1);
				activateBomb(row, column, strength);
				timer2.cancel();

			}

		}, 4000, 1);

	}

	/**
	 * ckecks the number of player lives and set appropriate properties when
	 * player get bonus
	 */
	@Override
	public void run() {
		while (true) {
			for (int i = 1; i < row; i++)
				for (int j = 1; j < column; j++) {
					for (int k = 0; k < playersNumber; k++) {
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
								players[k].playerLogic.setDead(true);

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

			for (int i = 1; i < row; i++)
				for (int j = 1; j < column; j++)
					for (int k = 0; k < playersNumber; k++) {
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
			for (int k = 0; k < this.playersNumber; k++)
				for (int i = 0; i < row; i++)
					for (int j = 0; j < column; j++) {
						if (cells[i][j].getContent() == "hole"
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
								players[k].playerLogic.setDead(true);
								// System.out.println("test");
							}
							players[k].playerLogic.lifeNumberDecrement();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
		}

	}
}
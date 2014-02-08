package com.cebomberman.game.controler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;

import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.graphics.CellGraphics;
import com.cebomberman.game.graphics.MainBoardGraphics;

/**
 * 
 * @author
 * 
 */

public class Controller implements Runnable {
	Thread a;
	CellGraphics test = new CellGraphics();
	public int playerNumbers = 4;
	String fileLocation;
	public Player[] players = new Player[playerNumbers];
	MainBoardGraphics mainBoard;
	ArrayList<Integer> pressedKeys1 = new ArrayList<>();
	Set<Integer> pressedKeys = new HashSet<Integer>();

	public Controller(int playerNumbers) {

		a = new Thread(this);
		a.setDaemon(true);
		a.start();

		for (int i = 0; i < playerNumbers; i++) {
			players[i] = new Player();
		}
		mainBoard = new MainBoardGraphics(players, playerNumbers);
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
				case 59:
					pressedKeys.add(59);
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
					mainBoard.players[0].playerGraphics.setLeftImage();
					pressedKeys.remove(37);
					break;
				case 38:
					mainBoard.players[0].playerGraphics.setUpImage();
					pressedKeys.remove(38);
					break;
				case 39:
					mainBoard.players[0].playerGraphics.setRightImage();
					pressedKeys.remove(39);
					break;
				case 40:
					mainBoard.players[0].playerGraphics.setDownImage();
					pressedKeys.remove(40);
					break;
				case 32:
					pressedKeys.remove(32);
					break;
				case 65: // a
					mainBoard.players[1].playerGraphics.setLeftImage();
					pressedKeys.remove(65);
					break;
				case 87:
					mainBoard.players[1].playerGraphics.setUpImage();
					pressedKeys.remove(87);
					break;
				case 68:
					mainBoard.players[1].playerGraphics.setRightImage();
					pressedKeys.remove(68);
					break;
				case 83:
					mainBoard.players[1].playerGraphics.setDownImage();
					pressedKeys.remove(83);
					break;
				case 81: // bomb
					pressedKeys.remove(81);
					break;
				case 71:
					mainBoard.players[2].playerGraphics.setLeftImage();
					pressedKeys.remove(71);
					break;
				case 89:
					mainBoard.players[2].playerGraphics.setUpImage();
					pressedKeys.remove(89);
					break;
				case 74: // j
					mainBoard.players[2].playerGraphics.setRightImage();
					pressedKeys.remove(74);
					break;
				case 72: // h
					mainBoard.players[2].playerGraphics.setDownImage();
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
				case 59:
					pressedKeys.remove(59);
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

	void moveUp(int i) {
		test = mainBoard.jp.getCell(
				mainBoard.players[i].playerGraphics.getCurrentPositionY() - 1,
				mainBoard.players[i].playerGraphics.getCurrentPositionX());
		if (!players[i].playerLogic.isPassingAbility()) {
			if (!(test.isBlocked()
					&& !(test.isBlocked() && test.box.isOpened()) && mainBoard.players[i].playerGraphics
					.getY() <= test.getY() + 32))
				mainBoard.players[i].playerGraphics
						.moveUp(players[i].playerLogic.getSpeed());
		} else {
			mainBoard.players[i].playerGraphics.moveUp(players[i].playerLogic
					.getSpeed());
		}

	}

	void moveDown(int i) {
		test = mainBoard.jp.getCell(
				mainBoard.players[i].playerGraphics.getCurrentPositionY() + 1,
				mainBoard.players[i].playerGraphics.getCurrentPositionX());
		if (!players[i].playerLogic.isPassingAbility()) {
			if (!(test.isBlocked()
					&& !(test.isBlocked() && test.box.isOpened()) && mainBoard.players[i].playerGraphics
					.getY() + 32 >= test.getY()))
				mainBoard.players[i].playerGraphics
						.moveDown(players[i].playerLogic.getSpeed());
		} else {
			mainBoard.players[i].playerGraphics.moveDown(players[i].playerLogic
					.getSpeed());
		}
	}

	void moveLeft(int i) {
		test = mainBoard.jp.getCell(
				mainBoard.players[i].playerGraphics.getCurrentPositionY(),
				mainBoard.players[i].playerGraphics.getCurrentPositionX() - 1);
		if (!players[i].playerLogic.isPassingAbility()) {
			if (!(test.isBlocked()
					&& !(test.isBlocked() && test.box.isOpened()) && mainBoard.players[i].playerGraphics
					.getX() <= test.getX() + 32))
				mainBoard.players[i].playerGraphics
						.moveLeft(players[i].playerLogic.getSpeed());
		} else {
			mainBoard.players[i].playerGraphics.moveLeft(players[i].playerLogic
					.getSpeed());
		}

	}

	void moveRight(int i) {
		test = mainBoard.jp.getCell(
				mainBoard.players[i].playerGraphics.getCurrentPositionY(),
				mainBoard.players[i].playerGraphics.getCurrentPositionX() + 1);
		if (!players[i].playerLogic.isPassingAbility()) {
			if (!(test.isBlocked()
					&& !(test.isBlocked() && test.box.isOpened()) && mainBoard.players[i].playerGraphics
					.getX() + 32 >= test.getX()))
				mainBoard.players[i].playerGraphics
						.moveRight(players[i].playerLogic.getSpeed());
		} else {
			mainBoard.players[i].playerGraphics
					.moveRight(players[i].playerLogic.getSpeed());
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// CellGraphics test = new CellGraphics();
		while (true) {

			if (pressedKeys.size() != 0) {
				try {
					for (int key : pressedKeys) {
						switch (key) {
						case 37:
							if (players[0].playerLogic.isInvertArrowKeys()) {
								moveRight(0);
							} else {
								moveLeft(0);
							}
							break;
						case 38:
							if (players[0].playerLogic.isInvertArrowKeys()) {
								moveDown(0);
							} else {
								moveUp(0);
							}
							break;
						case 39:
							if (players[0].playerLogic.isInvertArrowKeys()) {
								moveLeft(0);
							} else {
								moveRight(0);
							}
							break;
						case 40:
							if (players[0].playerLogic.isInvertArrowKeys()) {
								moveUp(0);
							} else {
								moveDown(0);
							}
							break;
						case 32:
							if (!players[0].playerLogic.isDead())
								if (!players[0].playerLogic.isLoseBombAbility()) {
									if (players[0].playerLogic.getBombNumber() > 0) {
										mainBoard.players[0].playerLogic
												.bombing(
														mainBoard.players[0].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[0].playerGraphics
																.getCurrentPositionY());
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

										mainBoard.jp
												.setCellContent(
														mainBoard.players[0].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[0].playerGraphics
																.getCurrentPositionX(),
														"bomb");
										mainBoard.jp
												.getCell(
														mainBoard.players[0].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[0].playerGraphics
																.getCurrentPositionX())
												.setIcon(
														new ImageIcon(
																"images/bomb.gif"));
										// mainBoard.players[0].playerLogic.setBombStrength(3);
										mainBoard.jp
												.fireEffect(
														mainBoard.players[0].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[0].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[0].playerLogic
																.getBombStrength(),
														players[0]);
									}
								}
							break;
						case 65:
							if (players[1].playerLogic.isInvertArrowKeys()) {
								moveRight(1);
							} else {
								moveLeft(1);
							}
							break;
						case 87:
							if (players[1].playerLogic.isInvertArrowKeys()) {
								moveDown(1);
							} else {
								moveUp(1);
							}
							break;
						case 68:
							if (players[1].playerLogic.isInvertArrowKeys()) {
								moveLeft(1);
							} else {
								moveRight(1);
							}
							break;
						case 83:
							if (players[1].playerLogic.isInvertArrowKeys()) {
								moveUp(1);
							} else {
								moveDown(1);
							}
							break;
						case 81: // bomb
							if (!players[1].playerLogic.isDead())
								if (!players[1].playerLogic.isLoseBombAbility()) {
									if (players[1].playerLogic.getBombNumber() > 0) {
										mainBoard.players[1].playerLogic
												.bombing(
														mainBoard.players[1].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[1].playerGraphics
																.getCurrentPositionY());
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

										mainBoard.jp
												.setCellContent(
														mainBoard.players[1].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[1].playerGraphics
																.getCurrentPositionX(),
														"bomb");
										mainBoard.jp
												.getCell(
														mainBoard.players[1].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[1].playerGraphics
																.getCurrentPositionX())
												.setIcon(
														new ImageIcon(
																"images/bomb.gif"));
										mainBoard.jp
												.fireEffect(
														mainBoard.players[1].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[1].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[1].playerLogic
																.getBombStrength(),
														players[1]);
									}
								}

							break;
						case 71:
							if (players[2].playerLogic.isInvertArrowKeys()) {
								moveRight(2);
							} else {
								moveLeft(2);
							}
							break;
						case 89:
							if (players[2].playerLogic.isInvertArrowKeys()) {
								moveDown(2);
							} else {
								moveUp(2);
							}
							break;
						case 74: // j

							if (players[2].playerLogic.isInvertArrowKeys()) {
								moveLeft(2);
							} else {
								moveRight(2);
							}
							break;
						case 72: // h
							if (players[2].playerLogic.isInvertArrowKeys()) {
								moveUp(2);
							} else {
								moveDown(2);
							}
							break;
						case 84:// bomb
							if (!players[2].playerLogic.isDead())
								if (!players[2].playerLogic.isLoseBombAbility()) {
									if (players[2].playerLogic.getBombNumber() > 0) {
										mainBoard.players[2].playerLogic
												.bombing(
														mainBoard.players[2].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[2].playerGraphics
																.getCurrentPositionY());
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

										mainBoard.jp
												.setCellContent(
														mainBoard.players[2].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[2].playerGraphics
																.getCurrentPositionX(),
														"bomb");
										mainBoard.jp
												.getCell(
														mainBoard.players[2].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[2].playerGraphics
																.getCurrentPositionX())
												.setIcon(
														new ImageIcon(
																"images/bomb.gif"));
										mainBoard.jp
												.fireEffect(
														mainBoard.players[2].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[2].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[2].playerLogic
																.getBombStrength(),
														players[2]);
									}
								}
							break;
						case 75:
							if (players[3].playerLogic.isInvertArrowKeys()) {
								moveRight(3);
							} else {
								moveLeft(3);
							}
							break;

						case 79: // o
							if (players[3].playerLogic.isInvertArrowKeys()) {
								moveDown(3);
							} else {
								moveUp(3);
							}
							break;
						case 59:
							if (players[3].playerLogic.isInvertArrowKeys()) {
								moveLeft(3);
							} else {
								moveRight(3);
							}
							break;
						case 76:
							if (players[3].playerLogic.isInvertArrowKeys()) {
								moveUp(3);
							} else {
								moveDown(3);
							}
							break;
						case 73: // bomb
							if (!players[3].playerLogic.isDead())
								if (!players[3].playerLogic.isLoseBombAbility()) {
									if (players[3].playerLogic.getBombNumber() > 0) {
										mainBoard.players[3].playerLogic
												.bombing(
														mainBoard.players[3].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[3].playerGraphics
																.getCurrentPositionY());
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

										mainBoard.jp
												.setCellContent(
														mainBoard.players[3].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[3].playerGraphics
																.getCurrentPositionX(),
														"bomb");
										mainBoard.jp
												.getCell(
														mainBoard.players[3].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[3].playerGraphics
																.getCurrentPositionX())
												.setIcon(
														new ImageIcon(
																"images/bomb.gif"));
										mainBoard.jp
												.fireEffect(
														mainBoard.players[3].playerGraphics
																.getCurrentPositionY(),
														mainBoard.players[3].playerGraphics
																.getCurrentPositionX(),
														mainBoard.players[3].playerLogic
																.getBombStrength(),
														players[3]);
									}
								}
							break;

						}

					}
				} catch (ConcurrentModificationException e) {

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

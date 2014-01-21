package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainBoardGraphics implements Runnable {
	final public Cell[][] cells = new Cell[15][15];
	int keyPressed = 0;
	final JLabel player = new JLabel();
	public MainBoardGraphics() {

		// mainboard and its features
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

		//final JLabel player = new JLabel();
		player.setBounds(32, 32, 32, 32);
		gameBoard.add(player);
		// player.setDisabledIcon(new ImageIcon("player1.gif"));
		player.setIcon(new ImageIcon("images/players/pl2/31.gif"));
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

	
		player.addKeyListener(new KeyListener() {

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
		
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				cells[i][j] = new Cell();
				gameBoard.add(cells[i][j]);
				cells[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				// cells[i][j].setEnabled(false);
				cells[i][j].setBackground(Color.GRAY);
				// cells[i][j].setBorder(null);
			}
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 14 || j == 0 || j == 14) {
					// cells[i][j].setDisabledIcon(new ImageIcon(
					// "images/brick1.gif"));
					cells[i][j].setIcon(new ImageIcon("images/brick1.gif"));
				}
			}

		new Thread(this).start();

		
	}

	public void setCellContent(int i, int j, String content) {
		cells[i][j].setContent(content);
		setDefaultImages();
	}

	private void setCellImage(Cell cell, String imagePath) {
		// cell.setDisabledIcon(new ImageIcon(imagePath));
		cell.setIcon(new ImageIcon(imagePath));
	}

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

	
	
	@Override
	public void run() {
		


	}
}

class Cell extends JLabel {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
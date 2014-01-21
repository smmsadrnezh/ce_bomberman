package com.cebomberman.game.graphics;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WinnerReward extends Thread {
	//public JLabel cells[][] = new JLabel[15][15];
	JButton cells[][] = new JButton[15][15];
	public WinnerReward() {
		
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
		gameBoard.setBackground(Color.BLUE);
		gameBoard.setLayout(null);
		JLabel btn1 = new JLabel() ;
		btn1.setBounds(32 , 32 , 32, 32);
		gameBoard.add(btn1) ;
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				cells[i][j] = new JButton();
				gameBoard.add(cells[i][j]);
				cells[i][j].setBounds(32 * (j), 32 * (i), 32, 32);
				cells[i][j].setVisible(true);
				cells[i][j].setEnabled(false);	
			}
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 14 || j == 0 || j == 14) {
					cells[i][j].setIcon(new ImageIcon("images/brick1.gif"));
					cells[i][j].setDisabledIcon(new ImageIcon("images/brick1.gif"));					
				}
			}
		new Thread(this).start();
		
//		cells[5][5].setBackground(Color.GREEN);
//		gameBoard.repaint();
		
	

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int k = 1; k < 7; k++) {
			for (int j = k; j < 14; j++) {
				cells[k][j].setBackground(Color.RED);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = k; i < 14; i++) {
				cells[i][14 - k].setBackground(Color.RED);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int j = 14 - k; j > 0; j--) {
				cells[14 - k][j].setBackground(Color.RED);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 14 - k; i > 0; i--) {
				cells[i][k].setBackground(Color.RED);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}

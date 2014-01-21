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

public class MainBoardGraphics extends JFrame {
	//final public Cell[][] cells = new Cell[15][15];
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
		MainBoardGraphicsComponents jp = new MainBoardGraphicsComponents();
		mainBoard.setContentPane(jp);
		jp.setLayout(null);

	}
	
	
}

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

import com.cebomberman.game.gameplay.Player;
/**
 * 
 * @author
 *
 */
public class MainBoardGraphics extends JFrame {
	//final public Cell[][] cells = new Cell[15][15];
	int keyPressed = 0;
	final JLabel player = new JLabel();
	/**
	 * 
	 */
	public Player[] players;
	public MainBoardGraphics(Player[] players) {
		super("Bomberman");
		this.players = players ;
		// main panel
		MainBoardComponents jp = new MainBoardComponents(players);
		setContentPane(jp);
		jp.setLayout(null);
		
		// mainboard and its features
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(10, 10, 608, 508);
		setLayout(null);
		setResizable(false);
	}
	
	
}

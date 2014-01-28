package com.cebomberman.game.graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.cebomberman.game.gameplay.Player;

/**
 * 
 * @author
 * 
 */
public class MainBoardGraphics extends JFrame {
	// final public Cell[][] cells = new Cell[15][15];
	int keyPressed = 0;
	final JLabel player = new JLabel();
	public MainBoardComponents jp;
	/**
	 * 
	 */
	public Player[] players;

	public MainBoardGraphics(Player[] players) {
		super("Bomberman");
		this.players = players;
		// main panel
		jp = new MainBoardComponents(players);
		setContentPane(jp);
		jp.setLayout(null);
		
		GameBoardPanel jp2 = new GameBoardPanel();
		setContentPane(jp2);

		// mainboard and its features
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(10, 10, 608, 508);
		setLayout(null);
		setResizable(false);
	}

}

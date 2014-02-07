package com.cebomberman.game.graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.cebomberman.game.gameplay.Player;

/**
 * makes the main frame of game
 * 
 * @author Masud and Arman
 * 
 */
public class MainBoardGraphics extends JFrame {
	int keyPressed = 0;
	final JLabel player = new JLabel();
	public MainBoardComponents jp;

	public Player[] players;

	/**
	 * set properties of main frame
	 * 
	 * @param players
	 *            sends players to GameBoardComponents
	 */
	public MainBoardGraphics(Player[] players, int playersNumber) {
		super("Bomberman");
		this.players = players;
		// main panel
		jp = new MainBoardComponents(players, playersNumber);
		setContentPane(jp);
		jp.setLayout(null);

		// mainboard and its features
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(10, 10, 608, 508);
		setLayout(null);
		setResizable(false);
	}

}
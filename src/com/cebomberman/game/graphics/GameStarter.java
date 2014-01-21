package com.cebomberman.game.graphics;

/**
 * 
 * @author sadrnezhaad
 */
public class GameStarter extends javax.swing.JFrame {

	/**
	 * Creates new form GameStarterGui
	 */
	public GameStarter() {
		setPreferredSize(new java.awt.Dimension(500, 340));
		GameStarterComponents starterComponents = new GameStarterComponents();
		setContentPane(starterComponents);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(620, 340));
		setVisible(true);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		pack();
	}
}

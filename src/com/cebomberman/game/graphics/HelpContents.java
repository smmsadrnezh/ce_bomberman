package com.cebomberman.game.graphics;

/**
 * 
 * @author
 */
public class HelpContents extends javax.swing.JFrame {

	/**
	 * Creates new form HelpContents
	 */
	public HelpContents() {
		initComponents();
	}

	private void initComponents() {

		bombDisableIcon = new javax.swing.JLabel();
		bombIcon = new javax.swing.JLabel();
		bombStrenghtIncrement = new javax.swing.JLabel();
		bombNumber = new javax.swing.JLabel();
		boxIcon = new javax.swing.JLabel();
		blockIcon = new javax.swing.JLabel();
		holeIcon = new javax.swing.JLabel();
		invertIcon = new javax.swing.JLabel();
		lifeIcon = new javax.swing.JLabel();
		passingAbilityIcon = new javax.swing.JLabel();
		loseAbilityIcon = new javax.swing.JLabel();
		speedIncrementIcon = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Help Contents");

		bombDisableIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/bombdisable.gif")); // NOI18N
		bombDisableIcon.setText("Bomb Disable Icon");

		bombIcon.setIcon(new javax.swing.ImageIcon(
				"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/bomb.gif")); // NOI18N
		bombIcon.setText("Bomb Icon");

		bombStrenghtIncrement
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/bombpower.gif")); // NOI18N
		bombStrenghtIncrement.setText("Bomb Strenght Increment");

		bombNumber
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/bombnumber.gif")); // NOI18N
		bombNumber.setText("Bomb Number");

		boxIcon.setIcon(new javax.swing.ImageIcon(
				"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/box.gif")); // NOI18N
		boxIcon.setText("Box Icon");

		blockIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/brick.gif")); // NOI18N
		blockIcon.setText("Block Icon");

		holeIcon.setIcon(new javax.swing.ImageIcon(
				"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/hole.gif")); // NOI18N
		holeIcon.setText("Hole Icon");

		invertIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/invertkey.png")); // NOI18N
		invertIcon.setText("Invert Key Icon");

		lifeIcon.setIcon(new javax.swing.ImageIcon(
				"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/life.gif")); // NOI18N
		lifeIcon.setText("Life Icon");

		passingAbilityIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/passingability.gif")); // NOI18N
		passingAbilityIcon.setText("Passing Ability Icon");

		loseAbilityIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/‌loseability.gif")); // NOI18N
		loseAbilityIcon.setText("Lose Ability Icon");

		speedIncrementIcon
				.setIcon(new javax.swing.ImageIcon(
						"/home/smmsadrnezh/NetBeansProjects/GameStarterGui/images/speed.gif")); // NOI18N
		speedIncrementIcon.setText("Speed Increment Icon");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		boxIcon)
																.addContainerGap(
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						bombIcon)
																				.addComponent(
																						bombDisableIcon)
																				.addComponent(
																						bombNumber)
																				.addComponent(
																						bombStrenghtIncrement)
																				.addComponent(
																						blockIcon))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		34,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						loseAbilityIcon)
																				.addComponent(
																						invertIcon)
																				.addComponent(
																						holeIcon)
																				.addComponent(
																						lifeIcon)
																				.addComponent(
																						passingAbilityIcon)
																				.addComponent(
																						speedIncrementIcon))
																.addGap(28, 28,
																		28)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(24, 24, 24)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(bombIcon)
												.addComponent(holeIcon))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(bombDisableIcon)
												.addComponent(invertIcon))
								.addGap(3, 3, 3)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lifeIcon)
												.addComponent(bombNumber))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														passingAbilityIcon)
												.addComponent(
														bombStrenghtIncrement))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														speedIncrementIcon)
												.addComponent(boxIcon))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(loseAbilityIcon)
												.addComponent(blockIcon))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(HelpContents.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HelpContents.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HelpContents.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HelpContents.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HelpContents().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel blockIcon;
	private javax.swing.JLabel bombDisableIcon;
	private javax.swing.JLabel bombIcon;
	private javax.swing.JLabel bombNumber;
	private javax.swing.JLabel bombStrenghtIncrement;
	private javax.swing.JLabel boxIcon;
	private javax.swing.JLabel holeIcon;
	private javax.swing.JLabel invertIcon;
	private javax.swing.JLabel lifeIcon;
	private javax.swing.JLabel loseAbilityIcon;
	private javax.swing.JLabel passingAbilityIcon;
	private javax.swing.JLabel speedIncrementIcon;
	// End of variables declaration//GEN-END:variables
}

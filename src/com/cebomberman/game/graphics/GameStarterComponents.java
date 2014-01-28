package com.cebomberman.game.graphics;

import java.util.Timer;

import com.cebomberman.game.controler.Controller;
import com.cebomberman.game.controler.Networking;
import com.cebomberman.game.gameplay.Player;
import com.cebomberman.game.gameplay.Time;

/**
 * 
 * @author
 */
public class GameStarterComponents extends javax.swing.JPanel {

	/**
	 * Creates new form MainPage
	 */

	public GameStarterComponents() {
		initComponents();
	}

	private void initComponents() {

		colorButtonGroup1 = new javax.swing.ButtonGroup();
		colorButtonGroup2 = new javax.swing.ButtonGroup();
		colorButtonGroup3 = new javax.swing.ButtonGroup();
		colorButtonGroup4 = new javax.swing.ButtonGroup();
		launchGame = new javax.swing.JButton();
		starterBody = new javax.swing.JTabbedPane();
		welcomeTab = new javax.swing.JPanel();
		gameDescription = new javax.swing.JTextArea();
		highScores = new javax.swing.JButton();
		launchMapEditor = new javax.swing.JButton();
		loadMap = new javax.swing.JButton();
		help = new javax.swing.JButton();
		about = new javax.swing.JButton();
		playerProfileTab = new javax.swing.JPanel();
		player1 = new javax.swing.JPanel();
		firstName = new javax.swing.JTextField();
		nickName = new javax.swing.JTextField();
		red = new javax.swing.JRadioButton();
		green = new javax.swing.JRadioButton();
		blue = new javax.swing.JRadioButton();
		yellow = new javax.swing.JRadioButton();
		nameLable = new javax.swing.JLabel();
		avatarLable = new javax.swing.JLabel();
		player2 = new javax.swing.JPanel();
		firstName1 = new javax.swing.JTextField();
		nickName1 = new javax.swing.JTextField();
		red1 = new javax.swing.JRadioButton();
		green1 = new javax.swing.JRadioButton();
		blue1 = new javax.swing.JRadioButton();
		yellow1 = new javax.swing.JRadioButton();
		nameLable1 = new javax.swing.JLabel();
		avatarLable1 = new javax.swing.JLabel();
		player3 = new javax.swing.JPanel();
		firstName2 = new javax.swing.JTextField();
		nickName2 = new javax.swing.JTextField();
		red2 = new javax.swing.JRadioButton();
		green2 = new javax.swing.JRadioButton();
		blue2 = new javax.swing.JRadioButton();
		yellow2 = new javax.swing.JRadioButton();
		nameLable2 = new javax.swing.JLabel();
		avatarLable2 = new javax.swing.JLabel();
		player4 = new javax.swing.JPanel();
		firstName3 = new javax.swing.JTextField();
		nickName3 = new javax.swing.JTextField();
		red3 = new javax.swing.JRadioButton();
		green3 = new javax.swing.JRadioButton();
		blue3 = new javax.swing.JRadioButton();
		yellow3 = new javax.swing.JRadioButton();
		nameLable3 = new javax.swing.JLabel();
		avatarLable3 = new javax.swing.JLabel();
		gameOptions = new javax.swing.JPanel();
		gameTime = new javax.swing.JLabel();
		minutes = new javax.swing.JTextField();
		seconds = new javax.swing.JTextField();
		playerNumberLable = new javax.swing.JLabel();
		gameTimeSlider = new javax.swing.JSlider();
		mapFileLable = new javax.swing.JLabel();
		fileLocation = new javax.swing.JTextField();
		browseButton = new javax.swing.JButton();
		playersNumberSlider = new javax.swing.JSlider();
		playersNumber = new javax.swing.JTextField();
		multiplayerNetworking = new javax.swing.JPanel();
		internet = new javax.swing.JPanel();
		internetPasswordLable = new javax.swing.JLabel();
		internetPasswordField = new javax.swing.JPasswordField();
		localNetwork = new javax.swing.JPanel();
		passwordLable1 = new javax.swing.JLabel();
		passwordField1 = new javax.swing.JPasswordField();
		ipAddress1 = new javax.swing.JLabel();
		ipAddressField1 = new javax.swing.JTextField();
		portLable1 = new javax.swing.JLabel();
		portNumberField1 = new javax.swing.JTextField();
		feedback = new javax.swing.JPanel();
		fromLable = new javax.swing.JLabel();
		subjectLable = new javax.swing.JLabel();
		firstNameField = new javax.swing.JTextField();
		lastNameField = new javax.swing.JTextField();
		textLable = new javax.swing.JLabel();
		subjectField = new javax.swing.JTextField();
		messageTextArea = new javax.swing.JScrollPane();
		messageText = new javax.swing.JTextArea();
		musicSwitch = new javax.swing.JToggleButton();

		setName("Starter"); // NOI18N
		setPreferredSize(new java.awt.Dimension(600, 328));

		launchGame.setText("Launch");
		launchGame.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				launchGameMouseClicked(evt);
			}
		});
		launchMapEditor.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				launchMapEditorMouseClicked(evt);
			}
		});
		launchGame.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				launchGameActionPerformed(evt);
			}
		});

		gameDescription.setEditable(false);
		gameDescription.setColumns(20);
		gameDescription.setLineWrap(true);
		gameDescription.setRows(5);
		gameDescription
				.setText("Bomberman is a strategic, maze-based video game franchis originaly published in 1983.\n\nToday, Bomberman has featured in over 70 different games on numerous platforms, as well as several anime and manga.");
		gameDescription.setWrapStyleWord(true);
		gameDescription.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Game Description"));
		gameDescription.setName(""); // NOI18N

		highScores.setText("High Scores");
		highScores.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				highScoresMouseClicked(evt);
			}
		});
		highScores.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				highScoresActionPerformed(evt);
			}
		});

		launchMapEditor.setText("Launch Map Editor");

		loadMap.setText("Load Map");
		loadMap.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				loadMapMouseClicked(evt);
			}
		});
		loadMap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loadMapActionPerformed(evt);
			}
		});

		help.setText("Help");
		help.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				helpMouseClicked(evt);
			}
		});
		help.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				helpActionPerformed(evt);
			}
		});

		about.setText("About");
		about.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				aboutMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout welcomeTabLayout = new javax.swing.GroupLayout(
				welcomeTab);
		welcomeTab.setLayout(welcomeTabLayout);
		welcomeTabLayout
				.setHorizontalGroup(welcomeTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								welcomeTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												gameDescription,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												425,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(19, 19, 19)
										.addGroup(
												welcomeTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																about,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																highScores,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																loadMap,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																179,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																launchMapEditor,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																help,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(1154, 1154, 1154)));
		welcomeTabLayout
				.setVerticalGroup(welcomeTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								welcomeTabLayout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addGroup(
												welcomeTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																gameDescription)
														.addGroup(
																welcomeTabLayout
																		.createSequentialGroup()
																		.addComponent(
																				highScores)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				launchMapEditor)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				loadMap)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				help)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				about)))
										.addGap(24, 34, Short.MAX_VALUE)));

		starterBody.addTab("Welcome", welcomeTab);

		player1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Player 1"));

		firstName.setForeground(new java.awt.Color(146, 146, 146));
		firstName.setText("Name...");
		firstName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstNameActionPerformed(evt);
			}
		});
		firstName.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstNameFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstNameFocusLost(evt);
			}
		});

		nickName.setForeground(new java.awt.Color(146, 146, 146));
		nickName.setText("Nickname...");
		nickName.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				nickNameFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				nickNameFocusLost(evt);
			}
		});

		colorButtonGroup1.add(red);
		red.setText("Red");
		red.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				redActionPerformed(evt);
			}
		});

		colorButtonGroup1.add(green);
		green.setText("Green");

		colorButtonGroup1.add(blue);
		blue.setText("Blue");

		colorButtonGroup1.add(yellow);
		yellow.setText("Yellow");

		nameLable.setText("Name:");

		avatarLable.setText("Avatar:");

		javax.swing.GroupLayout player1Layout = new javax.swing.GroupLayout(
				player1);
		player1.setLayout(player1Layout);
		player1Layout
				.setHorizontalGroup(player1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player1Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												player1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(nameLable)
														.addComponent(
																avatarLable))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																player1Layout
																		.createSequentialGroup()
																		.addComponent(
																				red)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				green)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				yellow)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				blue))
														.addGroup(
																player1Layout
																		.createSequentialGroup()
																		.addComponent(
																				firstName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				nickName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(12, 12, 12)));
		player1Layout
				.setVerticalGroup(player1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player1Layout
										.createSequentialGroup()
										.addGroup(
												player1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																firstName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nickName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(nameLable))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(red)
														.addComponent(green)
														.addComponent(blue)
														.addComponent(
																avatarLable)
														.addComponent(yellow))));

		player2.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Player 2"));

		firstName1.setForeground(new java.awt.Color(146, 146, 146));
		firstName1.setText("Name...");
		firstName1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstName1ActionPerformed(evt);
			}
		});
		firstName1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstName1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstName1FocusLost(evt);
			}
		});

		nickName1.setForeground(new java.awt.Color(146, 146, 146));
		nickName1.setText("Nickname...");
		nickName1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				nickName1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				nickName1FocusLost(evt);
			}
		});

		colorButtonGroup2.add(red1);
		red1.setText("Red");
		red1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				red1ActionPerformed(evt);
			}
		});

		colorButtonGroup2.add(green1);
		green1.setText("Green");

		colorButtonGroup2.add(blue1);
		blue1.setText("Blue");

		colorButtonGroup2.add(yellow1);
		yellow1.setText("Yellow");

		nameLable1.setText("Name:");

		avatarLable1.setText("Avatar:");

		javax.swing.GroupLayout player2Layout = new javax.swing.GroupLayout(
				player2);
		player2.setLayout(player2Layout);
		player2Layout
				.setHorizontalGroup(player2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player2Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												player2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																nameLable1)
														.addComponent(
																avatarLable1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																player2Layout
																		.createSequentialGroup()
																		.addComponent(
																				red1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				green1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				yellow1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				blue1))
														.addGroup(
																player2Layout
																		.createSequentialGroup()
																		.addComponent(
																				firstName1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				nickName1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(12, 12, 12)));
		player2Layout
				.setVerticalGroup(player2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player2Layout
										.createSequentialGroup()
										.addGroup(
												player2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																firstName1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nickName1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nameLable1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(red1)
														.addComponent(green1)
														.addComponent(blue1)
														.addComponent(
																avatarLable1)
														.addComponent(yellow1))));

		player3.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Player 3"));

		firstName2.setForeground(new java.awt.Color(146, 146, 146));
		firstName2.setText("Name...");
		firstName2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstName2ActionPerformed(evt);
			}
		});
		firstName2.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstName2FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstName2FocusLost(evt);
			}
		});

		nickName2.setForeground(new java.awt.Color(146, 146, 146));
		nickName2.setText("Nickname...");
		nickName2.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				nickName2FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				nickName2FocusLost(evt);
			}
		});

		colorButtonGroup3.add(red2);
		red2.setText("Red");
		red2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				red2ActionPerformed(evt);
			}
		});

		colorButtonGroup3.add(green2);
		green2.setText("Green");

		colorButtonGroup3.add(blue2);
		blue2.setText("Blue");

		colorButtonGroup3.add(yellow2);
		yellow2.setText("Yellow");

		nameLable2.setText("Name:");

		avatarLable2.setText("Avatar:");

		javax.swing.GroupLayout player3Layout = new javax.swing.GroupLayout(
				player3);
		player3.setLayout(player3Layout);
		player3Layout
				.setHorizontalGroup(player3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player3Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												player3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																nameLable2)
														.addComponent(
																avatarLable2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																player3Layout
																		.createSequentialGroup()
																		.addComponent(
																				red2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				green2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				yellow2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				blue2))
														.addGroup(
																player3Layout
																		.createSequentialGroup()
																		.addComponent(
																				firstName2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				nickName2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(12, 12, 12)));
		player3Layout
				.setVerticalGroup(player3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player3Layout
										.createSequentialGroup()
										.addGroup(
												player3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																firstName2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nickName2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nameLable2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(red2)
														.addComponent(green2)
														.addComponent(blue2)
														.addComponent(
																avatarLable2)
														.addComponent(yellow2))));

		player4.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Player 4"));

		firstName3.setForeground(new java.awt.Color(146, 146, 146));
		firstName3.setText("Name...");
		firstName3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstName3ActionPerformed(evt);
			}
		});
		firstName3.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstName3FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstName3FocusLost(evt);
			}
		});

		nickName3.setForeground(new java.awt.Color(146, 146, 146));
		nickName3.setText("Nickname...");
		nickName3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nickName3ActionPerformed(evt);
			}
		});
		nickName3.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				nickName3FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				nickName3FocusLost(evt);
			}
		});

		colorButtonGroup4.add(red3);
		red3.setText("Red");
		red3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				red3ActionPerformed(evt);
			}
		});

		colorButtonGroup4.add(green3);
		green3.setText("Green");

		colorButtonGroup4.add(blue3);
		blue3.setText("Blue");

		colorButtonGroup4.add(yellow3);
		yellow3.setText("Yellow");

		nameLable3.setText("Name:");

		avatarLable3.setText("Avatar:");

		javax.swing.GroupLayout player4Layout = new javax.swing.GroupLayout(
				player4);
		player4.setLayout(player4Layout);
		player4Layout
				.setHorizontalGroup(player4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player4Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												player4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																nameLable3)
														.addComponent(
																avatarLable3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																player4Layout
																		.createSequentialGroup()
																		.addComponent(
																				red3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				green3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				yellow3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				blue3))
														.addGroup(
																player4Layout
																		.createSequentialGroup()
																		.addComponent(
																				firstName3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				nickName3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(12, 12, 12)));
		player4Layout
				.setVerticalGroup(player4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								player4Layout
										.createSequentialGroup()
										.addGroup(
												player4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																firstName3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nickName3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																nameLable3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												player4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(red3)
														.addComponent(green3)
														.addComponent(blue3)
														.addComponent(
																avatarLable3)
														.addComponent(yellow3))));

		javax.swing.GroupLayout playerProfileTabLayout = new javax.swing.GroupLayout(
				playerProfileTab);
		playerProfileTab.setLayout(playerProfileTabLayout);
		playerProfileTabLayout
				.setHorizontalGroup(playerProfileTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								playerProfileTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												playerProfileTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																playerProfileTabLayout
																		.createSequentialGroup()
																		.addComponent(
																				player1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				player3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																playerProfileTabLayout
																		.createSequentialGroup()
																		.addComponent(
																				player2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				player4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		playerProfileTabLayout
				.setVerticalGroup(playerProfileTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								playerProfileTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												playerProfileTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																player1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																player3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												playerProfileTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																player2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																player4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		starterBody.addTab("Players Profile", playerProfileTab);

		gameTime.setText("Game Time:");

		minutes.setForeground(new java.awt.Color(146, 146, 146));
		minutes.setText("Minutes...");
		minutes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				minutesActionPerformed(evt);
			}
		});
		minutes.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				minutesFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				minutesFocusLost(evt);
			}
		});

		seconds.setForeground(new java.awt.Color(146, 146, 146));
		seconds.setText("Seconds...");
		seconds.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				secondsActionPerformed(evt);
			}
		});
		seconds.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				secondsFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				secondsFocusLost(evt);
			}
		});

		playerNumberLable.setText("Players Number:");

		gameTimeSlider.setMaximum(500);
		gameTimeSlider.setToolTipText("");

		mapFileLable.setText("Map File:");

		fileLocation.setForeground(new java.awt.Color(146, 146, 146));
		fileLocation.setText("File Location...");
		fileLocation.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fileLocationActionPerformed(evt);
			}
		});
		fileLocation.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				fileLocationFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				fileLocationFocusLost(evt);
			}
		});

		browseButton.setText("Browse...");
		browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				browseButtonMouseClicked(evt);
			}
		});

		playersNumberSlider.setMaximum(4);
		playersNumberSlider.setMinimum(2);
		playersNumberSlider.setToolTipText("");

		playersNumber.setForeground(new java.awt.Color(146, 146, 146));
		playersNumber.setText("Number...");
		playersNumber.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				playersNumberActionPerformed(evt);
			}
		});
		playersNumber.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				playersNumberFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				playersNumberFocusLost(evt);
			}
		});

		javax.swing.GroupLayout gameOptionsLayout = new javax.swing.GroupLayout(
				gameOptions);
		gameOptions.setLayout(gameOptionsLayout);
		gameOptionsLayout
				.setHorizontalGroup(gameOptionsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																mapFileLable)
														.addGroup(
																gameOptionsLayout
																		.createSequentialGroup()
																		.addGroup(
																				gameOptionsLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								gameOptionsLayout
																										.createSequentialGroup()
																										.addComponent(
																												minutes,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												150,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												seconds,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												125,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								gameTime,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								gameTimeSlider,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addGroup(
																				gameOptionsLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								gameOptionsLayout
																										.createSequentialGroup()
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												playerNumberLable))
																						.addGroup(
																								gameOptionsLayout
																										.createSequentialGroup()
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												playersNumberSlider,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												281,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								gameOptionsLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												playersNumber,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												66,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(215,
																												215,
																												215))))
														.addGroup(
																gameOptionsLayout
																		.createSequentialGroup()
																		.addComponent(
																				fileLocation,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				365,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				browseButton)))
										.addContainerGap(56, Short.MAX_VALUE)));
		gameOptionsLayout
				.setVerticalGroup(gameOptionsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																gameOptionsLayout
																		.createSequentialGroup()
																		.addGroup(
																				gameOptionsLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								gameTime)
																						.addComponent(
																								playerNumberLable))
																		.addGap(2,
																				2,
																				2)
																		.addComponent(
																				gameTimeSlider,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																playersNumberSlider,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gameOptionsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																seconds,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																minutes,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																playersNumber,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(22, 22, 22)
										.addComponent(mapFileLable)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												gameOptionsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																fileLocation,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																browseButton))
										.addContainerGap(32, Short.MAX_VALUE)));

		starterBody.addTab("Game Options", gameOptions);

		internet.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Internet"));

		internetPasswordLable.setText("Server Password:");

		internetPasswordField.setForeground(new java.awt.Color(146, 146, 146));
		internetPasswordField.setText("123456");
		internetPasswordField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						internetPasswordFieldActionPerformed(evt);
					}
				});
		internetPasswordField
				.addFocusListener(new java.awt.event.FocusAdapter() {
					public void focusGained(java.awt.event.FocusEvent evt) {
						internetPasswordFieldFocusGained(evt);
					}

					public void focusLost(java.awt.event.FocusEvent evt) {
						internetPasswordFieldFocusLost(evt);
					}
				});

		javax.swing.GroupLayout internetLayout = new javax.swing.GroupLayout(
				internet);
		internet.setLayout(internetLayout);
		internetLayout
				.setHorizontalGroup(internetLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								internetLayout
										.createSequentialGroup()
										.addGap(6, 6, 6)
										.addComponent(internetPasswordLable)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(internetPasswordField)
										.addContainerGap()));
		internetLayout
				.setVerticalGroup(internetLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								internetLayout
										.createSequentialGroup()
										.addGap(6, 6, 6)
										.addGroup(
												internetLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																internetPasswordLable)
														.addComponent(
																internetPasswordField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 11, Short.MAX_VALUE)));

		localNetwork.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Local Area Network"));

		passwordLable1.setText("Server Password:");

		passwordField1.setForeground(new java.awt.Color(146, 146, 146));
		passwordField1.setText("123456");
		passwordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				passwordField1ActionPerformed(evt);
			}
		});
		passwordField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				passwordField1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				passwordField1FocusLost(evt);
			}
		});

		ipAddress1.setText("IP:");

		ipAddressField1.setForeground(new java.awt.Color(146, 146, 146));
		ipAddressField1.setText("IP Address...");
		ipAddressField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ipAddressField1ActionPerformed(evt);
			}
		});
		ipAddressField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				ipAddressField1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				ipAddressField1FocusLost(evt);
			}
		});

		portLable1.setText("Port:");

		portNumberField1.setForeground(new java.awt.Color(146, 146, 146));
		portNumberField1.setText("Port Num...");
		portNumberField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				portNumberField1FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				portNumberField1FocusLost(evt);
			}
		});

		javax.swing.GroupLayout localNetworkLayout = new javax.swing.GroupLayout(
				localNetwork);
		localNetwork.setLayout(localNetworkLayout);
		localNetworkLayout
				.setHorizontalGroup(localNetworkLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								localNetworkLayout
										.createSequentialGroup()
										.addGroup(
												localNetworkLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																localNetworkLayout
																		.createSequentialGroup()
																		.addGap(0,
																				6,
																				Short.MAX_VALUE)
																		.addComponent(
																				passwordLable1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				passwordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				489,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																localNetworkLayout
																		.createSequentialGroup()
																		.addGap(6,
																				6,
																				6)
																		.addComponent(
																				ipAddress1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				ipAddressField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				411,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				portLable1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				portNumberField1)))
										.addContainerGap()));
		localNetworkLayout
				.setVerticalGroup(localNetworkLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								localNetworkLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												localNetworkLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																ipAddress1)
														.addComponent(
																ipAddressField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																portLable1)
														.addComponent(
																portNumberField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												localNetworkLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																passwordLable1)
														.addComponent(
																passwordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		javax.swing.GroupLayout multiplayerNetworkingLayout = new javax.swing.GroupLayout(
				multiplayerNetworking);
		multiplayerNetworking.setLayout(multiplayerNetworkingLayout);
		multiplayerNetworkingLayout
				.setHorizontalGroup(multiplayerNetworkingLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								multiplayerNetworkingLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												multiplayerNetworkingLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																internet,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																localNetwork,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		multiplayerNetworkingLayout
				.setVerticalGroup(multiplayerNetworkingLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								multiplayerNetworkingLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												internet,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												localNetwork,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));

		starterBody.addTab("Multiplayer Networking", multiplayerNetworking);

		fromLable.setText("From:");

		subjectLable.setText("Subject:");

		firstNameField.setForeground(new java.awt.Color(146, 146, 146));
		firstNameField.setText("First Name...");
		firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstNameFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstNameFieldFocusLost(evt);
			}
		});

		lastNameField.setForeground(new java.awt.Color(146, 146, 146));
		lastNameField.setText("Last Name...");
		lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				lastNameFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				lastNameFieldFocusLost(evt);
			}
		});

		textLable.setText("Text:");

		subjectField.setForeground(new java.awt.Color(146, 146, 146));
		subjectField.setText("Subject...");
		subjectField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				subjectFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				subjectFieldFocusLost(evt);
			}
		});

		messageText.setColumns(20);
		messageText.setForeground(new java.awt.Color(146, 146, 146));
		messageText.setRows(5);
		messageText.setText("Message...");
		messageText.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				messageTextFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				messageTextFocusLost(evt);
			}
		});
		messageTextArea.setViewportView(messageText);

		javax.swing.GroupLayout feedbackLayout = new javax.swing.GroupLayout(
				feedback);
		feedback.setLayout(feedbackLayout);
		feedbackLayout
				.setHorizontalGroup(feedbackLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								feedbackLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												feedbackLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																fromLable,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																subjectLable,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																textLable,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												feedbackLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																subjectField)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																feedbackLayout
																		.createSequentialGroup()
																		.addComponent(
																				firstNameField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				125,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				lastNameField))
														.addComponent(
																messageTextArea,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																554,
																Short.MAX_VALUE))
										.addGap(26, 26, 26)));
		feedbackLayout
				.setVerticalGroup(feedbackLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								feedbackLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												feedbackLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(fromLable)
														.addComponent(
																firstNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lastNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(7, 7, 7)
										.addGroup(
												feedbackLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																subjectLable)
														.addComponent(
																subjectField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												feedbackLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																feedbackLayout
																		.createSequentialGroup()
																		.addComponent(
																				textLable)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addComponent(
																messageTextArea,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																114,
																Short.MAX_VALUE))
										.addContainerGap()));

		starterBody.addTab("Report Bug", feedback);

		musicSwitch.setText("Music");
		musicSwitch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				musicSwitchActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		starterBody,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		652,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(0,
																		0,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		musicSwitch)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		launchGame)))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(36, Short.MAX_VALUE)
								.addComponent(starterBody,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										242,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(launchGame)
												.addComponent(musicSwitch))
								.addGap(17, 17, 17)));

		getAccessibleContext().setAccessibleName("StartGame");
	}// </editor-fold>

	private void helpActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void highScoresActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void launchGameActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void loadMapActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void musicSwitchActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {
		firstNameField.setForeground(new java.awt.Color(77, 77, 77));
		firstNameField.setText("");
	}

	private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {
		if (firstNameField.getText().equals("")) {
			firstNameField.setForeground(new java.awt.Color(146, 146, 146));
			firstNameField.setText("First Name...");
		}
	}

	private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {
		lastNameField.setForeground(new java.awt.Color(77, 77, 77));
		lastNameField.setText("");
	}

	private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {
		if (lastNameField.getText().equals("")) {
			lastNameField.setForeground(new java.awt.Color(146, 146, 146));
			lastNameField.setText("Last Name...");
		}
	}

	private void subjectFieldFocusGained(java.awt.event.FocusEvent evt) {
		subjectField.setForeground(new java.awt.Color(77, 77, 77));
		subjectField.setText("");
	}

	private void subjectFieldFocusLost(java.awt.event.FocusEvent evt) {
		if (subjectField.getText().equals("")) {
			subjectField.setForeground(new java.awt.Color(146, 146, 146));
			subjectField.setText("Subject...");
		}
	}

	private void messageTextFocusGained(java.awt.event.FocusEvent evt) {
		messageText.setForeground(new java.awt.Color(77, 77, 77));
		messageText.setText("");
	}

	private void messageTextFocusLost(java.awt.event.FocusEvent evt) {
		if (messageText.getText().equals("")) {
			messageText.setForeground(new java.awt.Color(146, 146, 146));
			messageText.setText("Message...");
		}
	}

	private void redActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void nickNameFocusLost(java.awt.event.FocusEvent evt) {
		if (nickName.getText().equals("")) {
			nickName.setForeground(new java.awt.Color(146, 146, 146));
			nickName.setText("Nickname...");
		}
	}

	private void nickNameFocusGained(java.awt.event.FocusEvent evt) {
		nickName.setForeground(new java.awt.Color(77, 77, 77));
		nickName.setText("");
	}

	private void firstNameFocusLost(java.awt.event.FocusEvent evt) {
		if (firstName.getText().equals("")) {
			firstName.setForeground(new java.awt.Color(146, 146, 146));
			firstName.setText("Name...");
		}
	}

	private void firstNameFocusGained(java.awt.event.FocusEvent evt) {
		firstName.setText("");
		firstName.setForeground(new java.awt.Color(77, 77, 77));
	}

	private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName1FocusGained(java.awt.event.FocusEvent evt) {
		firstName1.setText("");
		firstName1.setForeground(new java.awt.Color(77, 77, 77));

	}

	private void firstName1FocusLost(java.awt.event.FocusEvent evt) {
		if (firstName1.getText().equals("")) {
			firstName1.setForeground(new java.awt.Color(146, 146, 146));
			firstName1.setText("Name...");
		}
	}

	private void nickName1FocusGained(java.awt.event.FocusEvent evt) {
		nickName1.setText("");
		nickName1.setForeground(new java.awt.Color(77, 77, 77));
	}

	private void nickName1FocusLost(java.awt.event.FocusEvent evt) {
		if (nickName1.getText().equals("")) {
			nickName1.setForeground(new java.awt.Color(146, 146, 146));
			nickName1.setText("Nickname...");
		}
	}

	private void red1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName2FocusGained(java.awt.event.FocusEvent evt) {
		firstName2.setText("");
		firstName2.setForeground(new java.awt.Color(77, 77, 77));

	}

	private void firstName2FocusLost(java.awt.event.FocusEvent evt) {
		if (firstName2.getText().equals("")) {
			firstName2.setForeground(new java.awt.Color(146, 146, 146));
			firstName2.setText("Name...");
		}
	}

	private void nickName2FocusGained(java.awt.event.FocusEvent evt) {
		nickName2.setText("");
		nickName2.setForeground(new java.awt.Color(77, 77, 77));

	}

	private void nickName2FocusLost(java.awt.event.FocusEvent evt) {
		if (nickName2.getText().equals("")) {
			nickName2.setForeground(new java.awt.Color(146, 146, 146));
			nickName2.setText("Nickname...");
		}
	}

	private void red2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstName3FocusGained(java.awt.event.FocusEvent evt) {
		firstName3.setText("");
		firstName3.setForeground(new java.awt.Color(77, 77, 77));

	}

	private void firstName3FocusLost(java.awt.event.FocusEvent evt) {
		if (firstName3.getText().equals("")) {
			firstName3.setForeground(new java.awt.Color(146, 146, 146));
			firstName3.setText("Name...");
		}
	}

	private void nickName3FocusGained(java.awt.event.FocusEvent evt) {
		nickName3.setText("");
		nickName3.setForeground(new java.awt.Color(77, 77, 77));
	}

	private void nickName3FocusLost(java.awt.event.FocusEvent evt) {
		if (nickName3.getText().equals("")) {
			nickName3.setForeground(new java.awt.Color(146, 146, 146));
			nickName3.setText("Nickname...");
		}
	}

	private void red3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void passwordField1FocusGained(java.awt.event.FocusEvent evt) {
		passwordField1.setText("");
		passwordField1.setForeground(new java.awt.Color(77, 77, 77));
	}

	private void passwordField1FocusLost(java.awt.event.FocusEvent evt) {
		if (passwordField1.getText().equals("")) {
			passwordField1.setText("123456");
			passwordField1.setForeground(new java.awt.Color(146, 146, 146));
		}
	}

	private void ipAddressField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void ipAddressField1FocusGained(java.awt.event.FocusEvent evt) {
		ipAddressField1.setForeground(new java.awt.Color(77, 77, 77));
		ipAddressField1.setText("");
	}

	private void ipAddressField1FocusLost(java.awt.event.FocusEvent evt) {
		if (ipAddressField1.getText().equals("")) {
			ipAddressField1.setText("IP Address...");
			ipAddressField1.setForeground(new java.awt.Color(146, 146, 146));
		}
	}

	private void portNumberField1FocusGained(java.awt.event.FocusEvent evt) {
		portNumberField1.setForeground(new java.awt.Color(77, 77, 77));
		portNumberField1.setText("");
	}

	private void portNumberField1FocusLost(java.awt.event.FocusEvent evt) {
		if (portNumberField1.getText().equals("")) {
			portNumberField1.setText("Port Num...");
			portNumberField1.setForeground(new java.awt.Color(146, 146, 146));
		}
	}

	private void internetPasswordFieldActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void internetPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {
		internetPasswordField.setForeground(new java.awt.Color(77, 77, 77));
		internetPasswordField.setText("");
	}

	private void internetPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {
		if (internetPasswordField.getText().equals("")) {
			internetPasswordField.setText("123456");
			internetPasswordField.setForeground(new java.awt.Color(146, 146,
					146));
		}
	}

	private void nickName3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void secondsFocusLost(java.awt.event.FocusEvent evt) {
		if (seconds.getText().equals("")) {
			seconds.setForeground(new java.awt.Color(146, 146, 146));
			seconds.setText("Seconds...");
		}
	}

	private void secondsFocusGained(java.awt.event.FocusEvent evt) {
		seconds.setForeground(new java.awt.Color(77, 77, 77));
		seconds.setText("");
	}

	private void secondsActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void minutesFocusLost(java.awt.event.FocusEvent evt) {
		if (minutes.getText().equals("")) {
			minutes.setForeground(new java.awt.Color(146, 146, 146));
			minutes.setText("Minutes...");
		}
	}

	private void minutesFocusGained(java.awt.event.FocusEvent evt) {
		minutes.setForeground(new java.awt.Color(77, 77, 77));
		minutes.setText("");
	}

	private void minutesActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void fileLocationActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void fileLocationFocusGained(java.awt.event.FocusEvent evt) {
		fileLocation.setForeground(new java.awt.Color(77, 77, 77));
		fileLocation.setText("");
	}

	private void fileLocationFocusLost(java.awt.event.FocusEvent evt) {
		if (fileLocation.getText().equals("")) {
			fileLocation.setForeground(new java.awt.Color(146, 146, 146));
			fileLocation.setText("File Location...");
		}
	}

	private void playersNumberActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void playersNumberFocusGained(java.awt.event.FocusEvent evt) {
		playersNumber.setForeground(new java.awt.Color(77, 77, 77));
		playersNumber.setText("");
	}

	private void playersNumberFocusLost(java.awt.event.FocusEvent evt) {
		if (playersNumber.getText().equals("")) {
			playersNumber.setForeground(new java.awt.Color(146, 146, 146));
			playersNumber.setText("Number...");
		}
	}

	private void browseButtonMouseClicked(java.awt.event.MouseEvent evt) {
		BrowseMap browseMap = new BrowseMap();
		browseMap.setVisible(true);
	}

	private void loadMapMouseClicked(java.awt.event.MouseEvent evt) {
		BrowseMap browseMap = new BrowseMap();
		browseMap.setVisible(true);
	}

	private void aboutMouseClicked(java.awt.event.MouseEvent evt) {
		AboutPage about = new AboutPage();
		about.setBounds(0, 0, 449, 350);
		about.setVisible(true);
	}

	private void highScoresMouseClicked(java.awt.event.MouseEvent evt) {
		HighScores highScores = new HighScores();
		highScores.setVisible(true);
	}

	private void helpMouseClicked(java.awt.event.MouseEvent evt) {
		HelpContents help = new HelpContents();
		help.setVisible(true);
	}

	private void launchGameMouseClicked(java.awt.event.MouseEvent evt) {
		userOptinalsSetter();
	}

	private void launchMapEditorMouseClicked(java.awt.event.MouseEvent evt) {
		MapEditor mapEditor = new MapEditor();
		mapEditor.setVisible(true);

		// MapEditor test = new MapEditor();
		// test.setBounds(0, 0, 159, 310);
		// test.setVisible(true);
	}

	public void userOptinalsSetter() {
	//	Controller controller = new Controller();
		Player[] players = new Player[4];
		Time timer = new Time();
		
//		controller.fileLocation = fileLocation.getText();
		int playerNumbers = Integer.parseInt(playersNumber.getText());
		timer.setGameTimeCountdown(minutes.getText() , seconds.getText());
		
		//		try {
					
			Networking network = new Networking(passwordField1.getPassword(),
					portNumberField1.getText(), ipAddressField1.getText(),
					internetPasswordField.getPassword());
			switch (Integer.parseInt(playersNumber.getText())) {
			case 2:
				players[0] = playerBuilder(
						firstName.getText(), nickName.getText(),
						red.isSelected(), green.isSelected(),
						yellow.isSelected(), blue.isSelected());
				players[1] = playerBuilder(
						firstName1.getText(), nickName1.getText(),
						red1.isSelected(), green1.isSelected(),
						yellow1.isSelected(), blue1.isSelected());
				break;
			case 3:
				players[0] = playerBuilder(
						firstName.getText(), nickName.getText(),
						red.isSelected(), green.isSelected(),
						yellow.isSelected(), blue.isSelected());
				players[1] = playerBuilder(
						firstName1.getText(), nickName1.getText(),
						red1.isSelected(), green1.isSelected(),
						yellow1.isSelected(), blue1.isSelected());
				players[2] = playerBuilder(
						firstName2.getText(), nickName2.getText(),
						red2.isSelected(), green2.isSelected(),
						yellow2.isSelected(), blue2.isSelected());
				break;
			case 4:
				players[0] = playerBuilder(
						firstName.getText(), nickName.getText(),
						red.isSelected(), green.isSelected(),
						yellow.isSelected(), blue.isSelected());
				players[1] = playerBuilder(
						firstName1.getText(), nickName1.getText(),
						red1.isSelected(), green1.isSelected(),
						yellow1.isSelected(), blue1.isSelected());
				players[2] = playerBuilder(
						firstName2.getText(), nickName2.getText(),
						red2.isSelected(), green2.isSelected(),
						yellow2.isSelected(), blue2.isSelected());
				players[3] = playerBuilder(
						firstName3.getText(), nickName3.getText(),
						red3.isSelected(), green3.isSelected(),
						yellow3.isSelected(), blue3.isSelected());
				break;
			}
//		} catch (Exception e) {

//		}
	//	new Controller(players,playerNumbers) ;
	}
	public Player playerBuilder(String firstName, String nickName,
			boolean redColor, boolean greenColor, boolean yellowColor,
			boolean blueColor) {

		// build new player
		Player player = new Player();

		// Set player name and nickname
		player.playerLogic.setPlayerName(firstName);
		player.playerLogic.setPlayerNickname(nickName);

		// Set player Color
		if (redColor) {
			player.playerGraphics.setColor("red");
		}
		if (greenColor) {
			player.playerGraphics.setColor("green");
		}
		if (yellowColor) {
			player.playerGraphics.setColor("yellow");
		}
		if (blueColor) {
			player.playerGraphics.setColor("blue");
		}
		return player;
		
	}

	// Variables declaration - do not modify
	private javax.swing.JButton about;
	private javax.swing.JLabel avatarLable;
	private javax.swing.JLabel avatarLable1;
	private javax.swing.JLabel avatarLable2;
	private javax.swing.JLabel avatarLable3;
	private javax.swing.JRadioButton blue;
	private javax.swing.JRadioButton blue1;
	private javax.swing.JRadioButton blue2;
	private javax.swing.JRadioButton blue3;
	private javax.swing.JButton browseButton;
	private javax.swing.ButtonGroup colorButtonGroup1;
	private javax.swing.ButtonGroup colorButtonGroup2;
	private javax.swing.ButtonGroup colorButtonGroup3;
	private javax.swing.ButtonGroup colorButtonGroup4;
	private javax.swing.JPanel feedback;
	private javax.swing.JTextField fileLocation;
	private javax.swing.JTextField firstName;
	private javax.swing.JTextField firstName1;
	private javax.swing.JTextField firstName2;
	private javax.swing.JTextField firstName3;
	private javax.swing.JTextField firstNameField;
	private javax.swing.JLabel fromLable;
	private javax.swing.JTextArea gameDescription;
	private javax.swing.JPanel gameOptions;
	private javax.swing.JLabel gameTime;
	private javax.swing.JSlider gameTimeSlider;
	private javax.swing.JRadioButton green;
	private javax.swing.JRadioButton green1;
	private javax.swing.JRadioButton green2;
	private javax.swing.JRadioButton green3;
	private javax.swing.JButton help;
	private javax.swing.JButton highScores;
	private javax.swing.JPanel internet;
	private javax.swing.JPasswordField internetPasswordField;
	private javax.swing.JLabel internetPasswordLable;
	private javax.swing.JLabel ipAddress1;
	private javax.swing.JTextField ipAddressField1;
	private javax.swing.JTextField lastNameField;
	private javax.swing.JButton launchGame;
	private javax.swing.JButton launchMapEditor;
	private javax.swing.JButton loadMap;
	private javax.swing.JPanel localNetwork;
	private javax.swing.JLabel mapFileLable;
	private javax.swing.JTextArea messageText;
	private javax.swing.JScrollPane messageTextArea;
	private javax.swing.JTextField minutes;
	private javax.swing.JPanel multiplayerNetworking;
	private javax.swing.JToggleButton musicSwitch;
	private javax.swing.JLabel nameLable;
	private javax.swing.JLabel nameLable1;
	private javax.swing.JLabel nameLable2;
	private javax.swing.JLabel nameLable3;
	private javax.swing.JTextField nickName;
	private javax.swing.JTextField nickName1;
	private javax.swing.JTextField nickName2;
	private javax.swing.JTextField nickName3;
	private javax.swing.JPasswordField passwordField1;
	private javax.swing.JLabel passwordLable1;
	private javax.swing.JPanel player1;
	private javax.swing.JPanel player2;
	private javax.swing.JPanel player3;
	private javax.swing.JPanel player4;
	private javax.swing.JLabel playerNumberLable;
	private javax.swing.JPanel playerProfileTab;
	private javax.swing.JTextField playersNumber;
	private javax.swing.JSlider playersNumberSlider;
	private javax.swing.JLabel portLable1;
	private javax.swing.JTextField portNumberField1;
	private javax.swing.JRadioButton red;
	private javax.swing.JRadioButton red1;
	private javax.swing.JRadioButton red2;
	private javax.swing.JRadioButton red3;
	private javax.swing.JTextField seconds;
	private javax.swing.JTabbedPane starterBody;
	private javax.swing.JTextField subjectField;
	private javax.swing.JLabel subjectLable;
	private javax.swing.JLabel textLable;
	private javax.swing.JPanel welcomeTab;
	private javax.swing.JRadioButton yellow;
	private javax.swing.JRadioButton yellow1;
	private javax.swing.JRadioButton yellow2;
	private javax.swing.JRadioButton yellow3;
	// End of variables declaration
}

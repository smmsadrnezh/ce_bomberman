package com.cebomberman.game.graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author sadrnezhaad
 */
public class GameStarterComponents extends javax.swing.JPanel {

	/**
	 * Creates new form MainPage
	 */
	public GameStarterComponents() {
		initComponents();
	}
	private void initComponents() {

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
		nameLable = new javax.swing.JLabel();
		avatarLable = new javax.swing.JLabel();
		firstName = new javax.swing.JTextField();
		lastName = new javax.swing.JTextField();
		gameOptionsTab = new javax.swing.JPanel();
		gameTime = new javax.swing.JLabel();
		minutes = new javax.swing.JTextField();
		seconds = new javax.swing.JTextField();
		playerNumberLable = new javax.swing.JLabel();
		numberSlider = new javax.swing.JSlider();
		gameOptionsTab1 = new javax.swing.JPanel();
		ipAddress = new javax.swing.JLabel();
		ipAddressField = new javax.swing.JTextField();
		portLable = new javax.swing.JLabel();
		portNumberField = new javax.swing.JTextField();
		passwordField = new javax.swing.JPasswordField();
		passwordLable = new javax.swing.JLabel();
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

		launchGame.setText("Launch");
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
		highScores.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				highScoresActionPerformed(evt);
			}
		});

		launchMapEditor.setText("Launch Map Editor");

		loadMap.setText("Load Map");
		loadMap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loadMapActionPerformed(evt);
			}
		});

		help.setText("Help");
		help.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				helpActionPerformed(evt);
			}
		});

		about.setText("About");

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
																launchMapEditor,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																loadMap,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																help,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																about,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																highScores,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		welcomeTabLayout
				.setVerticalGroup(welcomeTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								welcomeTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												welcomeTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																gameDescription,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																179,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																welcomeTabLayout
																		.createSequentialGroup()
																		.addComponent(
																				highScores)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				launchMapEditor)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
										.addGap(0, 12, Short.MAX_VALUE)));

		starterBody.addTab("Welcome", welcomeTab);

		nameLable.setText("Name:");

		avatarLable.setText("Avatar:");

		firstName.setText("First Name");
		firstName.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				firstNameMouseClicked(evt);
			}
		});
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

		lastName.setText("Last Name");
		lastName.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				lastNameFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				lastNameFocusLost(evt);
			}
		});

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
																				nameLable)
																		.addGap(16,
																				16,
																				16)
																		.addComponent(
																				firstName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				137,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				lastName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				227,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																avatarLable))
										.addContainerGap(166, Short.MAX_VALUE)));
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
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nameLable)
														.addComponent(
																firstName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lastName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(avatarLable)
										.addContainerGap(143, Short.MAX_VALUE)));

		starterBody.addTab("Profile", playerProfileTab);

		gameTime.setText("Game Time:");

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

		numberSlider.setMaximum(4);
		numberSlider.setMinimum(2);
		numberSlider.setToolTipText("");
		numberSlider.setValue(2);

		javax.swing.GroupLayout gameOptionsTabLayout = new javax.swing.GroupLayout(
				gameOptionsTab);
		gameOptionsTab.setLayout(gameOptionsTabLayout);
		gameOptionsTabLayout
				.setHorizontalGroup(gameOptionsTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(gameTime)
														.addComponent(
																playerNumberLable))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gameOptionsTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																gameOptionsTabLayout
																		.createSequentialGroup()
																		.addComponent(
																				minutes)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				seconds,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																numberSlider,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																185,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(286, Short.MAX_VALUE)));
		gameOptionsTabLayout
				.setVerticalGroup(gameOptionsTabLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsTabLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(gameTime)
														.addComponent(
																minutes,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																seconds,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												gameOptionsTabLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gameOptionsTabLayout
																		.createSequentialGroup()
																		.addGap(43,
																				43,
																				43)
																		.addComponent(
																				playerNumberLable))
														.addGroup(
																gameOptionsTabLayout
																		.createSequentialGroup()
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				numberSlider,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(94, Short.MAX_VALUE)));

		starterBody.addTab("Game Options", gameOptionsTab);

		ipAddress.setText("IP:");

		ipAddressField.setText("IP Address...");
		ipAddressField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ipAddressFieldActionPerformed(evt);
			}
		});
		ipAddressField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				ipAddressFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				ipAddressFieldFocusLost(evt);
			}
		});

		portLable.setText("Port:");

		portNumberField.setText("Port Num...");
		portNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				portNumberFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				portNumberFieldFocusLost(evt);
			}
		});

		passwordField.setText("123456");
		passwordField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				passwordFieldActionPerformed(evt);
			}
		});
		passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				passwordFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				passwordFieldFocusLost(evt);
			}
		});

		passwordLable.setText("Server Password:");

		javax.swing.GroupLayout gameOptionsTab1Layout = new javax.swing.GroupLayout(
				gameOptionsTab1);
		gameOptionsTab1.setLayout(gameOptionsTab1Layout);
		gameOptionsTab1Layout
				.setHorizontalGroup(gameOptionsTab1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsTab1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsTab1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gameOptionsTab1Layout
																		.createSequentialGroup()
																		.addComponent(
																				passwordLable)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				passwordField))
														.addGroup(
																gameOptionsTab1Layout
																		.createSequentialGroup()
																		.addComponent(
																				ipAddress)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				ipAddressField,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				399,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				portLable)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				portNumberField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				100,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		gameOptionsTab1Layout
				.setVerticalGroup(gameOptionsTab1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gameOptionsTab1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gameOptionsTab1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(ipAddress)
														.addComponent(
																ipAddressField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(portLable)
														.addComponent(
																portNumberField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												gameOptionsTab1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																passwordField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																passwordLable))
										.addContainerGap(121, Short.MAX_VALUE)));

		starterBody.addTab("Multiplayer", gameOptionsTab1);

		fromLable.setText("From:");

		subjectLable.setText("Subject:");

		firstNameField.setText("First Name...");
		firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				firstNameFieldFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				firstNameFieldFocusLost(evt);
			}
		});

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
																503,
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

		starterBody.addTab("Feedback", feedback);

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
																		musicSwitch)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		launchGame)
																.addGap(6, 6, 6))
												.addComponent(starterBody))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(24, Short.MAX_VALUE)
								.addComponent(starterBody,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										242,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
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

	private void minutesActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void secondsActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void loadMapActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void ipAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void musicSwitchActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void firstNameMouseClicked(java.awt.event.MouseEvent evt) {
	}

	private void firstNameFocusGained(java.awt.event.FocusEvent evt) {
		firstName.setText("");
	}

	private void firstNameFocusLost(java.awt.event.FocusEvent evt) {
		firstName.setText("First Name");
	}

	private void lastNameFocusGained(java.awt.event.FocusEvent evt) {
		lastName.setText("");
	}

	private void lastNameFocusLost(java.awt.event.FocusEvent evt) {
		lastName.setText("Last Name");
	}

	private void minutesFocusGained(java.awt.event.FocusEvent evt) {
		minutes.setText("");
	}

	private void minutesFocusLost(java.awt.event.FocusEvent evt) {
		minutes.setText("Minutes...");

	}

	private void secondsFocusGained(java.awt.event.FocusEvent evt) {
		seconds.setText("");

	}

	private void secondsFocusLost(java.awt.event.FocusEvent evt) {
		seconds.setText("Seconds...");
	}

	private void ipAddressFieldFocusGained(java.awt.event.FocusEvent evt) {
		ipAddressField.setText("");
	}

	private void ipAddressFieldFocusLost(java.awt.event.FocusEvent evt) {
		ipAddressField.setText("IP Address...");
	}

	private void portNumberFieldFocusGained(java.awt.event.FocusEvent evt) {
		portNumberField.setText("");
	}

	private void portNumberFieldFocusLost(java.awt.event.FocusEvent evt) {
		portNumberField.setText("Port Num...");
	}

	private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {
		passwordField.setText("");
	}

	private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {
		passwordField.setText("123456");
	}

	private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {
		firstNameField.setText("");
	}

	private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {
		firstNameField.setText("First Name...");
	}

	private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {
		lastNameField.setText("");
	}

	private void lastNameFieldFocusLost(java.awt.event.FocusEvent evt) {
		lastNameField.setText("Last Name...");
	}

	private void subjectFieldFocusGained(java.awt.event.FocusEvent evt) {
		subjectField.setText("");
	}

	private void subjectFieldFocusLost(java.awt.event.FocusEvent evt) {
		subjectField.setText("Subject...");
	}

	private void messageTextFocusGained(java.awt.event.FocusEvent evt) {
		messageText.setText("");
	}

	private void messageTextFocusLost(java.awt.event.FocusEvent evt) {
		messageText.setText("Message...");
	}

	// Variables declaration - do not modify
	private javax.swing.JButton about;
	private javax.swing.JLabel avatarLable;
	private javax.swing.JPanel feedback;
	private javax.swing.JTextField firstName;
	private javax.swing.JTextField firstNameField;
	private javax.swing.JLabel fromLable;
	private javax.swing.JTextArea gameDescription;
	private javax.swing.JPanel gameOptionsTab;
	private javax.swing.JPanel gameOptionsTab1;
	private javax.swing.JLabel gameTime;
	private javax.swing.JButton help;
	private javax.swing.JButton highScores;
	private javax.swing.JLabel ipAddress;
	private javax.swing.JTextField ipAddressField;
	private javax.swing.JTextField lastName;
	private javax.swing.JTextField lastNameField;
	private javax.swing.JButton launchGame;
	private javax.swing.JButton launchMapEditor;
	private javax.swing.JButton loadMap;
	private javax.swing.JTextArea messageText;
	private javax.swing.JScrollPane messageTextArea;
	private javax.swing.JTextField minutes;
	private javax.swing.JToggleButton musicSwitch;
	private javax.swing.JLabel nameLable;
	private javax.swing.JSlider numberSlider;
	private javax.swing.JPasswordField passwordField;
	private javax.swing.JLabel passwordLable;
	private javax.swing.JLabel playerNumberLable;
	private javax.swing.JPanel playerProfileTab;
	private javax.swing.JLabel portLable;
	private javax.swing.JTextField portNumberField;
	private javax.swing.JTextField seconds;
	private javax.swing.JTabbedPane starterBody;
	private javax.swing.JTextField subjectField;
	private javax.swing.JLabel subjectLable;
	private javax.swing.JLabel textLable;
	private javax.swing.JPanel welcomeTab;
	// End of variables declaration
}

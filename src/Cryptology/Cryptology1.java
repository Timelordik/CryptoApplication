package Cryptology;

import java.math.BigInteger;

public class Cryptology1 extends javax.swing.JFrame {

	public Cryptology1() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		EnterKeywordToGenerateMatrixTextBox = new javax.swing.JFormattedTextField();
		jButton1 = new javax.swing.JButton();
		TextLabel = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		GeneratedMatrix = new Cryptology.JMatrix();
		jSeparator1 = new javax.swing.JSeparator();
		EncryptButton = new javax.swing.JButton();
		EncryptedTextLabel = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		DecryptedButton = new javax.swing.JButton();
		DecryptedTextLabel = new javax.swing.JLabel();
		DecryptedTextTextBox = new javax.swing.JTextField();
		OK = new javax.swing.JButton();
		EncryptedTextTextField = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		RSANewPublicKeyTextField = new javax.swing.JTextArea();
		RSAGenerateKeysButton = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		RSANewPrivateKeyTextBox = new javax.swing.JTextArea();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		SraniyModulus = new javax.swing.JTextField();
		jSeparator3 = new javax.swing.JSeparator();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		PublicKeyTextBox = new javax.swing.JTextArea();
		jLabel7 = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		PlaintextMesageTextBox = new javax.swing.JTextArea();
		jLabel8 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		EncryptedMessageTextBox = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jSeparator4 = new javax.swing.JSeparator();
		jSeparator5 = new javax.swing.JSeparator();
		jPanel6 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jScrollPane6 = new javax.swing.JScrollPane();
		PrivateKeytextBox = new javax.swing.JTextArea();
		jLabel10 = new javax.swing.JLabel();
		jScrollPane7 = new javax.swing.JScrollPane();
		EncryptedMesaageTextBox = new javax.swing.JTextArea();
		DecryptMessaageButton = new javax.swing.JButton();
		jScrollPane8 = new javax.swing.JScrollPane();
		DecryptedMessageTextBox = new javax.swing.JTextArea();
		jLabel11 = new javax.swing.JLabel();
		RSAOKButton = new javax.swing.JButton();
		jSeparator6 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jLabel1.setText("PLAYFAIR");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel2.setText("Enter Keyword To Generate Matrix:");

		EnterKeywordToGenerateMatrixTextBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						EnterKeywordToGenerateMatrixTextBoxActionPerformed(evt);
					}
				});

		jButton1.setText("Generate");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		TextLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		TextLabel.setText("Text:");

		jLabel3.setText("(text is case nonsensetive)");

		jFormattedTextField1.setHighlighter(null);
		jFormattedTextField1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jFormattedTextField1ActionPerformed(evt);
					}
				});

		GeneratedMatrix.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		GeneratedMatrix.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

		javax.swing.GroupLayout GeneratedMatrixLayout = new javax.swing.GroupLayout(
				GeneratedMatrix);
		GeneratedMatrix.setLayout(GeneratedMatrixLayout);
		GeneratedMatrixLayout.setHorizontalGroup(GeneratedMatrixLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		GeneratedMatrixLayout.setVerticalGroup(GeneratedMatrixLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 73, Short.MAX_VALUE));

		EncryptButton.setText("Encrypt");
		EncryptButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EncryptButtonActionPerformed(evt);
			}
		});

		EncryptedTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		EncryptedTextLabel.setText("Encrypted Text:");

		DecryptedButton.setText("Decrypt");
		DecryptedButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DecryptedButtonActionPerformed(evt);
			}
		});

		DecryptedTextLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		DecryptedTextLabel.setText("Decrypted Text:");

		DecryptedTextTextBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						DecryptedTextTextBoxActionPerformed(evt);
					}
				});

		OK.setText("OK");
		OK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OKActionPerformed(evt);
			}
		});

		EncryptedTextTextField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						EncryptedTextTextFieldActionPerformed(evt);
					}
				});

		jLabel12.setText("(text is case");
		jLabel12.setToolTipText("");

		jLabel13.setText("sensetive)");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jSeparator1)
																						.addComponent(
																								jSeparator2,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												DecryptedTextLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												DecryptedTextTextBox))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel3)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jFormattedTextField1))
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel2)
																																						.addGap(13,
																																								13,
																																								13)
																																						.addComponent(
																																								EnterKeywordToGenerateMatrixTextBox,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								189,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addComponent(
																																TextLabel,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																39,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																GeneratedMatrix,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addGap(0,
																												0,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																EncryptedTextLabel,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel12,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(10,
																																				10,
																																				10)
																																		.addComponent(
																																				jLabel13)))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												EncryptedTextTextField)))
																		.addContainerGap())
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(0,
																				230,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												OK,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												69,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(35,
																												35,
																												35))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												DecryptedButton)
																										.addGap(38,
																												38,
																												38))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addGap(221,
																												221,
																												221))))))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(EncryptButton)
										.addGap(42, 42, 42)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(12, 12, 12)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																EnterKeywordToGenerateMatrixTextBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1)
														.addComponent(jLabel2))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								GeneratedMatrix,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(3,
																												3,
																												3)
																										.addComponent(
																												TextLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel3)))
																		.addGap(30,
																				30,
																				30))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jFormattedTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				64,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)))
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(EncryptButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				EncryptedTextLabel)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel12))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				EncryptedTextTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				84,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel13)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
												25, Short.MAX_VALUE)
										.addComponent(
												jSeparator2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(DecryptedButton)
										.addGap(15, 15, 15)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																DecryptedTextTextBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																67,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																DecryptedTextLabel))
										.addGap(18, 18, 18).addComponent(OK)
										.addContainerGap()));

		jTabbedPane1.addTab("PlayFair", jPanel1);

		RSANewPublicKeyTextField.setColumns(20);
		RSANewPublicKeyTextField.setLineWrap(true);
		RSANewPublicKeyTextField.setRows(5);
		jScrollPane1.setViewportView(RSANewPublicKeyTextField);

		RSAGenerateKeysButton.setFont(new java.awt.Font("Times New Roman", 1,
				14)); // NOI18N
		RSAGenerateKeysButton.setText("Generate Keys");
		RSAGenerateKeysButton.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		RSAGenerateKeysButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						RSAGenerateKeysButtonActionPerformed(evt);
					}
				});

		jLabel4.setText("(some time requried)");

		RSANewPrivateKeyTextBox.setColumns(20);
		RSANewPrivateKeyTextBox.setLineWrap(true);
		RSANewPrivateKeyTextBox.setRows(5);
		RSANewPrivateKeyTextBox.setWrapStyleWord(true);
		jScrollPane2.setViewportView(RSANewPrivateKeyTextBox);

		jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel5.setText("New Pubic Key:");

		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel6.setText("New Private Key:");

		SraniyModulus.setEditable(false);
		SraniyModulus.setBackground(new java.awt.Color(255, 255, 255));
		SraniyModulus
				.setText("588ewic3em78cgyazutoblepibal0dddgbjd4488m73mqamlmcfj5cuxh2l0nwpxeo4b0itfjbsueavgjre2rwguua00ihi2pr5vri2o56pbn43mw4nev68cj277zrxw1jxnvbpok7uagwket7bn7ixeyg7bgphmhsfwfhoh0ylfzcm8nsdrd0x3klzqnm37q2k9m3o6v3oegqvbfesdax0r3p5kqbzkcgh4kslyjyf5x8o3cl82iuo8a5nh2oox03iwi01frz02271j7auecu5oayauofnh3h8uoky54cw1k6pygqafb2turhs1m72ddtcggcq1oi8iiya5tkaemn4omtlt5ncx2fgbo7j76dmqjdrqwebl903a3gch65npe7z0uuzondve637lhr3tljtvv7q5frnpd070zauddpdzit5jrn95jml4rop4eg8e0j3m2zpjd0we69zaqshssuws208hbkzivanvct5a26l692vuukmu0nqz1xkgl6ugec3w7pcavk6lbbn8be9jgo2koc3g49frjm2q6qi9v2xwbc8qi876sivngp0j064lft2rb8r7n8pdzjtpltrxzvbkqxz670u4hq5bst8rsrw6hcnqfiiutjte6y4dr49x8emt14uvdagiv83rcqm1wkv1viqad6x5wy9zqzfkezrgbu8nw3135aldvneootjgrkvvk9t8w21y2chejap1bct1m9kdc8v9khorpw6046plskmmaa9ih7w5lfrqyczyu3xk7ob2v9n4fqaf8okln0pfh");
		SraniyModulus.setSelectionColor(new java.awt.Color(255, 255, 255));
		SraniyModulus.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SraniyModulusActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								SraniyModulus,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								3,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane1)
																		.addContainerGap())
														.addComponent(
																jSeparator3)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(0,
																				203,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												RSAGenerateKeysButton,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												140,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(164,
																												164,
																												164))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addGap(186,
																												186,
																												186)))))));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(21, 21, 21)
										.addComponent(
												RSAGenerateKeysButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jSeparator3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												147,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel6)
										.addGap(4, 4, 4)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												178,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(10, 10, 10)
										.addComponent(
												SraniyModulus,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												9,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		jTabbedPane2.addTab("Key Generation", jPanel4);

		PublicKeyTextBox.setColumns(20);
		PublicKeyTextBox.setLineWrap(true);
		PublicKeyTextBox.setRows(5);
		jScrollPane3.setViewportView(PublicKeyTextBox);

		jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel7.setText("Public Key:");

		PlaintextMesageTextBox.setColumns(20);
		PlaintextMesageTextBox.setLineWrap(true);
		PlaintextMesageTextBox.setRows(4);
		jScrollPane4.setViewportView(PlaintextMesageTextBox);

		jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel8.setText("Plaintext Message:");

		jTextArea1.setColumns(20);
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jScrollPane5.setViewportView(jTextArea1);

		EncryptedMessageTextBox.setFont(new java.awt.Font("Times New Roman", 1,
				12)); // NOI18N
		EncryptedMessageTextBox.setText("Encrypted Message:");

		jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jButton2.setText("Encrypt message");
		jButton2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												97,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(195, 195, 195))
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane3)
														.addComponent(
																jScrollPane4)
														.addComponent(
																jScrollPane5)
														.addComponent(
																jSeparator4)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								EncryptedMessageTextBox))
																		.addGap(0,
																				393,
																				Short.MAX_VALUE))
														.addComponent(
																jSeparator5))
										.addContainerGap()));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel7)
										.addGap(3, 3, 3)
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												124,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(12, 12, 12)
										.addComponent(
												jSeparator5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jSeparator4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												6,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(EncryptedMessageTextBox)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												131,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(16, 16, 16)));

		jTabbedPane2.addTab("Encrypt", jPanel5);

		jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel9.setText("Private Key:");

		PrivateKeytextBox.setColumns(20);
		PrivateKeytextBox.setLineWrap(true);
		PrivateKeytextBox.setRows(5);
		jScrollPane6.setViewportView(PrivateKeytextBox);

		jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel10.setText("Encrypted Message:");

		EncryptedMesaageTextBox.setColumns(20);
		EncryptedMesaageTextBox.setLineWrap(true);
		EncryptedMesaageTextBox.setRows(5);
		jScrollPane7.setViewportView(EncryptedMesaageTextBox);

		DecryptMessaageButton.setFont(new java.awt.Font("Times New Roman", 1,
				12)); // NOI18N
		DecryptMessaageButton.setText("Decrypt Message");
		DecryptMessaageButton.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		DecryptMessaageButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						DecryptMessaageButtonActionPerformed(evt);
					}
				});

		DecryptedMessageTextBox.setColumns(20);
		DecryptedMessageTextBox.setLineWrap(true);
		DecryptedMessageTextBox.setRows(5);
		jScrollPane8.setViewportView(DecryptedMessageTextBox);

		jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel11.setText("Decrypted Message:");

		RSAOKButton.setText("OK");
		RSAOKButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RSAOKButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				DecryptMessaageButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				132,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(188,
																				188,
																				188))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(0,
																				419,
																				Short.MAX_VALUE)
																		.addComponent(
																				RSAOKButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				65,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(23,
																				23,
																				23))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jSeparator6,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane8)
																						.addComponent(
																								jScrollPane6,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane7,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel6Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel6Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel9)
																														.addComponent(
																																jLabel10))
																										.addGap(0,
																												393,
																												Short.MAX_VALUE)))
																		.addContainerGap()))));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel9)
										.addGap(4, 4, 4)
										.addComponent(
												jScrollPane6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												78,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel10)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												128,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jSeparator6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel11)
																		.addGap(5,
																				5,
																				5))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				DecryptMessaageButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				33,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				18,
																				Short.MAX_VALUE)))
										.addComponent(
												jScrollPane8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												109,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(RSAOKButton)
										.addGap(6, 6, 6)));

		jTabbedPane2.addTab("Decrypt", jPanel6);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup()
						.addComponent(jTabbedPane2).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.PREFERRED_SIZE, 535, Short.MAX_VALUE));

		jTabbedPane1.addTab("RSA", jPanel2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1)));

		pack();
	}

	private void OKActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void DecryptedTextTextBoxActionPerformed(
			java.awt.event.ActionEvent evt) {

	}

	private void DecryptedButtonActionPerformed(java.awt.event.ActionEvent evt) {
		PlayfairForCryptology.doDecrypt();
	}

	private void EncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {
		PlayfairForCryptology.doEncrypt();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		PlayfairForCryptology.doGenerate();
	}

	private void EnterKeywordToGenerateMatrixTextBoxActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	private void RSAGenerateKeysButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		RSANewPublicKeyTextField.setLineWrap(true);
		KeySet set = new RSAKeyGenerator().generateKeys();
		SraniyModulus.setText(KeySet.intString(set.modulus));
		RSANewPublicKeyTextField.setText(KeySet.intString(set.publicKey));
		RSANewPrivateKeyTextBox.setText(KeySet.intString(set.privateKey));

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		RSAEncryptor rsa = new RSAEncryptor();
		BigInteger plainText = rsa.messageToInteger(PlaintextMesageTextBox
				.getText());
		BigInteger publicKey = KeySet.parseInt(PublicKeyTextBox.getText());
		BigInteger modulus = KeySet.parseInt(SraniyModulus.getText());
		BigInteger result = rsa.encrypt(plainText, publicKey, modulus);

		jTextArea1.setText(KeySet.intString(result));
	}

	private void RSAOKButtonActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void DecryptMessaageButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		RSAEncryptor rsa = new RSAEncryptor();
		BigInteger cipherText = KeySet.parseInt(EncryptedMesaageTextBox
				.getText());
		BigInteger privateKey = KeySet.parseInt(PrivateKeytextBox.getText());
		BigInteger modulus = KeySet.parseInt(SraniyModulus.getText());

		DecryptedMessageTextBox.setText(rsa.integerToMessage(rsa.decrypt(
				cipherText, privateKey, modulus)));

	}

	private void SraniyModulusActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jFormattedTextField1ActionPerformed(
			java.awt.event.ActionEvent evt) {
		PlayfairForCryptology.doDecrypt();
	}

	private void EncryptedTextTextFieldActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Cryptology1.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Cryptology1.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Cryptology1.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Cryptology1.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Создали форму и отобразили ее */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cryptology1().setVisible(true);

			}
		});
	}

	static javax.swing.JTextField pfCustMatrix[] = new javax.swing.JTextField[25];
	{
		for (int i = 0; i < 25; ++i)
			pfCustMatrix[i] = new javax.swing.JTextField();
	}

	// Обявление всех переменных, находящихся в GUI
	public javax.swing.JButton DecryptMessaageButton;
	static javax.swing.JButton DecryptedButton;
	public javax.swing.JTextArea DecryptedMessageTextBox;
	static javax.swing.JLabel DecryptedTextLabel;
	static javax.swing.JTextField DecryptedTextTextBox;
	static javax.swing.JButton EncryptButton;
	public javax.swing.JTextArea EncryptedMesaageTextBox;
	public javax.swing.JLabel EncryptedMessageTextBox;
	static javax.swing.JLabel EncryptedTextLabel;
	public static javax.swing.JTextField EncryptedTextTextField;
	static javax.swing.JFormattedTextField EnterKeywordToGenerateMatrixTextBox;
	public static Cryptology.JMatrix GeneratedMatrix;
	static javax.swing.JButton OK;
	public javax.swing.JTextArea PlaintextMesageTextBox;
	public javax.swing.JTextArea PrivateKeytextBox;
	public javax.swing.JTextArea PublicKeyTextBox;
	static javax.swing.JButton RSAGenerateKeysButton;
	public javax.swing.JTextArea RSANewPrivateKeyTextBox;
	public javax.swing.JTextArea RSANewPublicKeyTextField;
	public javax.swing.JButton RSAOKButton;
	public javax.swing.JTextField SraniyModulus;
	static javax.swing.JLabel TextLabel;
	static javax.swing.JButton jButton1;
	public javax.swing.JButton jButton2;
	public static javax.swing.JFormattedTextField jFormattedTextField1;
	static javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	static javax.swing.JLabel jLabel2;
	static javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	static javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane8;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;
	static javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTextArea jTextArea1;
}

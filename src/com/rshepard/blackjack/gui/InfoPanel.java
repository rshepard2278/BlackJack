/**
 * @author Richard Shepard
 * @version Apr 24, 2015
 */
package com.rshepard.blackjack.gui;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.rshepard.blackjack.game.BlackJackGame;

public class InfoPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5898378813867112142L;
	private BlackJackGame game;
	private JLabel info;
	private JLabel wallet;
	private static final String WALLET_TEXT = "You have: $";
	private int walletAmount;
	private String infoText;

	/**
	 * 
	 */
	public InfoPanel(BlackJackGame game) {
		this.game = game;
		setLayout(new FlowLayout());
		walletAmount =  game.getPlayer().getWallet();
		wallet = new JLabel(WALLET_TEXT + walletAmount);
		info = new JLabel("Please make a bet");
		add(wallet);
		add(info);
	}
	
	public void setText(String text) {
		wallet.setText(WALLET_TEXT + game.getPlayer().getWallet()); 
		info.setText(text);
	}
}

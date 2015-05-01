/**
 * @author Richard Shepard
 * @version Apr 24, 2015
 */
package com.rshepard.blackjack.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JPanel;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.game.Card;
import com.rshepard.blackjack.game.Dealer;
import com.rshepard.blackjack.game.HumanPlayer;
import com.rshepard.blackjack.interfaces.Player;
import com.rshepard.blackjack.states.BetState;
import com.rshepard.blackjack.states.CheckWinState;
import com.rshepard.blackjack.states.DealerTurnState;

public class HandDisplay extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2813901392941793710L;
	private Stack<Card> hand;
	private ArrayList<BufferedImage> cards;
	private CardBuilder cb;
	private Player player;
	private BlackJackGame game;


	public HandDisplay(Player player , BlackJackGame game) {
		this.player = player;
		this.game = game;
		cards = new ArrayList<>();
		hand = player.getHand();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		cb = new CardBuilder();
		loadCards();
	}
	
	private void loadCards() {
		if(game.getState() instanceof BetState) {
			cards.add(cb.getCardImage(null));
			cards.add(cb.getCardImage(null));
		} else if(!(game.getState() instanceof DealerTurnState || game.getState() instanceof CheckWinState) && player.getName().equals("Dealer")) {
			cards.add(cb.getCardImage(hand.get(0)));
			cards.add(cb.getCardImage(null));
		} else {
			for(Card card : hand) {
				cards.add(cb.getCardImage(card));
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		cards.clear();
		hand = player.getHand();
		loadCards();
		drawCards(g);
	}
	
	private void drawCards(Graphics g) {
		int x = 85; //width of card
		BufferedImage cardImage = null;
		for(int i = 0; i < cards.size(); i++) {
			cardImage = cards.get(i);
			g.drawImage(cardImage, x * i, 10, this);
		}
		g.setColor(new Color(0, 255, 30));
		if(player instanceof Dealer) {
			if(game.getState() instanceof DealerTurnState || (game.getState() instanceof CheckWinState)) {
				g.drawString(player.getName() + "'s cards. Score: " + game.getDealerScore(), 10, 155);
			} else {
				g.drawString(player.getName() + "'s cards", 10, 155);
			}
		} else if(player instanceof HumanPlayer && !(game.getState() instanceof BetState)) {
			g.drawString(player.getName() + "'s cards. Score: " + game.getPlayerScore(), 10, 155);
		} else {
			g.drawString(player.getName() + "'s cards", 10, 155);
		}
	}
}

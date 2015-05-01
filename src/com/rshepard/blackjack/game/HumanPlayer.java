/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.game;

import java.util.Stack;

import com.rshepard.blackjack.interfaces.Player;

public class HumanPlayer implements Player{

	
	private Stack<Card> hand;
	private int wallet;
	private String name;
	/**
	 * 
	 */
	public HumanPlayer() {
		name = "Player";
		wallet = 200;
		hand = new Stack<>();
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public Stack<Card> getHand() {
		return hand;
	}
	
	public void addToWallet(double winnings) {
		wallet += winnings;
	}
	
	public void bet(int bet) {
		wallet -= bet;
	}
	
	public void clearHand() {
		hand.clear();
	}

	/**
	 * @return the wallet
	 */
	public int getWallet() {
		return wallet;
	}
	
	public void subtractBet(double bet) {
		wallet -= bet;
	}

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.rshepard.blackjack.interfaces.Player#setHand(com.rshepard.blackjack.game.Card, com.rshepard.blackjack.game.Card)
	 */
	@Override
	public void setHand(Card c1, Card c2) {
		hand.add(c1);
		hand.add(c2);
	}

//	/* (non-Javadoc)
//	 * @see com.rshepard.blackjack.interfaces.Player#getHandScore()
//	 */
//	@Override
//	public int getHandScore() {
//		int score = 0;
//		for(Card c : hand) {
//			if(c.getValue() < 10) {
//				score += c.getValue() + 1;
//			} else {
//				score += 10;
//			}
//		}
//		return score;
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HumanPlayer [name=" + name + "]";
	}

}

/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.game;

import java.util.Stack;

import com.rshepard.blackjack.interfaces.Player;

public class Dealer implements Player{

	private Stack<Card> hand;
	private String name;
	
	
	public Dealer() {
		name = "Dealer";
		hand = new Stack<>();
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public Stack<Card> getHand() {
		return hand;
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
		return "Dealer [name=" + name + "]";
	}

}

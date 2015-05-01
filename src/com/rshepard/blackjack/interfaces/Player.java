/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.interfaces;

import java.util.Stack;

import com.rshepard.blackjack.game.Card;

public interface Player {
	public void addCard(Card c);
	public Stack<Card> getHand();
	public String getName();
	public void setHand(Card c1, Card c2);
	//public int getHandScore();
}

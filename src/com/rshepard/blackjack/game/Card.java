/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.game;

import com.rshepard.blackjack.enumerators.Suit;
import com.rshepard.blackjack.enumerators.Value;

public class Card {
	
	private int cardNumber;
	private Suit suit;
	private Value value;

	/**
	 * 
	 */
	public Card(int cardNumber) {
		if(cardNumber >= 0 && cardNumber < 53) {
			this.cardNumber = cardNumber;
			setSuit();
			setValue();
		} else {
			suit = Suit.CLUBS;
			value = Value.ACE;
		}
	}

	private void setSuit() {
		int suitValue = cardNumber / 13;
		for(Suit s : Suit.values()) {
			if(s.getValue() == suitValue) {
				suit = s;
			}
		}
		
	}
	
	private void setValue() {
		int valueInt = cardNumber % 13;
		for(Value v : Value.values()) {
			if(v.getValue() == valueInt) {
				value = v;
			}
		}
	}
	
	public String toString() {
		return (value + " of " + suit);
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit.getValue();
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value.getValue();
	}
}

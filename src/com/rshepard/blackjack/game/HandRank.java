/**
 * @author Richard Shepard
 * @version May 1, 2015
 */
package com.rshepard.blackjack.game;

import java.util.ArrayList;

import com.rshepard.blackjack.interfaces.Player;

public class HandRank {
	
	private static final int BLACKJACK = 21;
	private static final int BUST = 0;
	private ArrayList<Integer> hand;
	
	public HandRank() {}

	public int checkHand(Player player) {
		getValues(player);
		return getRank();
	}
	
	private void getValues(Player player) {
		hand = new ArrayList<>();
		for(Card c : player.getHand()) {
			if(c.getValue() < 10) {
				if(c.getValue() == 0) {
					hand.add(11);
				} else {
					hand.add(c.getValue() + 1);
				}
			} else {
				hand.add(10);
			}
		}
	}
	
	private int getRank() {
		int rank = 0;
		int score = 0;
		for(Integer i : hand) {
			score += i;
		}
		if(score <= BLACKJACK) {
			rank = score;
		} else {
			rank = checkForAce();
		}
		return rank;
	}
	
	private int checkForAce() {
		int rank = 0;
		for(Integer i : hand) {
			if(i == 11) {
				rank += 1;
			} else {
				rank += i;
			}
		}
		if(rank > BLACKJACK) {
			rank = BUST;
		}
		return rank;
	}
}

/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.game.Deck;
import com.rshepard.blackjack.interfaces.State;

public class DealState implements State {

	private BlackJackGame game;
	/**
	 * 
	 */
	public DealState(BlackJackGame game) {
		this.game = game;
	}
	
	@Override
	public void deal() {
		Deck deck = setupDeck();
		dealCards(deck);
		game.setCurrentState(game.getBet());
	}
	
	private Deck setupDeck() {
		game.setDeck(new Deck());
		game.getDeck().shuffle();
		return game.getDeck();		
	}
	
	private void dealCards(Deck deck) {
		for(int i = 0; i < 2; i++) {
			game.getPlayer().addCard(game.getDeck().deal());
			game.getDealer().addCard(game.getDeck().deal());
		}
	}
	

	
	
	
	
	
	
	
	

	@Override
	public void newGame() {}
	
	@Override
	public void bet() {}

	@Override
	public void hitStand() {
		System.out.println("Called from dealState");
	}

	@Override
	public void hit() {}

	@Override
	public void stand() {}

	@Override
	public void dealerTurn() {}

	@Override
	public void checkWin() {
		System.out.println("Called from dealState");
	}

}

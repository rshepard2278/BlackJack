/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class DealerTurnState implements State {
	
	
	private BlackJackGame game;
	/**
	 * 
	 */
	public DealerTurnState(BlackJackGame game) {
		this.game = game;
	}
	
	@Override
	public void dealerTurn() {
		System.out.println("Dealer gets cards");
		checkCards();
	}
	
	private void checkCards() {
		double playerScore = game.getPlayerScore();
		double dealerScore = game.getDealerScore();
		if(dealerScore != 0) {
			if((playerScore == 0) || (dealerScore >= playerScore) || dealerScore >= 17) {
				game.setWon(true);
				game.setState(game.getCheckWin());
			} else if(dealerScore < 17 && dealerScore > 0) {
				game.getDealer().addCard(game.getDeck().deal());
			}
		} else {
			game.setWon(true);
			game.setState(game.getCheckWin());
		}
	}
	
	
	

	
	@Override
	public void newGame() {}

	@Override
	public void deal() {}

	@Override
	public void bet() {}


	@Override
	public void hitStand() {
		System.out.println("Called form dealerturnState");
	}

	@Override
	public void hit() {}

	@Override
	public void stand() {}

	@Override
	public void checkWin() {
		System.out.println("Called form dealerturnState");
	}
}

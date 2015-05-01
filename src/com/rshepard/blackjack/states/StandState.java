/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class StandState implements State {

	private BlackJackGame game;
	/**
	 * 
	 */
	public StandState(BlackJackGame game) {
		this.game = game;
	}
	
	@Override
	public void stand() {
		System.out.println("You Chose to stand");
		game.setCurrentState(game.getDealerTurn());
	}

	
	
	
	
	
	
	

	@Override
	public void newGame() {}

	@Override
	public void deal() {}

	@Override
	public void bet() {}

	@Override
	public void hitStand() {
		System.out.println("Called From standState");
	}

	@Override
	public void hit() {}

	@Override
	public void dealerTurn() {}

	@Override
	public void checkWin() {
		System.out.println("Called From standState");
	}
}

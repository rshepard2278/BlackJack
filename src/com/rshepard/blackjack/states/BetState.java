/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class BetState implements State {

	/**
	 * 
	 */
	public BetState(BlackJackGame game) {
	}
	

	@Override
	public void bet() {
		
	}

	
	
	
	@Override
	public void checkWin() {
		System.out.println("Called from betState");
	}

	@Override
	public void hitStand() {
		System.out.println("Called from betState");

	}
	
	@Override
	public void newGame() {}

	@Override
	public void deal() {}
	
	@Override
	public void hit() {}

	@Override
	public void stand() {}

	@Override
	public void dealerTurn() {}
}

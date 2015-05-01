/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class CheckWinState implements State {

	private BlackJackGame game;
	/**
	 * 
	 */
	public CheckWinState(BlackJackGame game) {
		this.game = game;
	}
	
	@Override
	public void checkWin() {
		System.out.println("SomeOne wins...game over.");
	}

	
	@Override
	public void newGame() {}

	@Override
	public void deal() {}

	@Override
	public void bet() {}

	@Override
	public void hitStand() {
		System.out.println("called from checkwinSate");

	}
	
	@Override
	public void hit() {}

	@Override
	public void stand() {}

	@Override
	public void dealerTurn() {}
}

/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class HitStandState implements State {

	private BlackJackGame game;
	/**
	 * 
	 */
	public HitStandState(BlackJackGame game) {
		this.game = game;
	}
	
	@Override
	public void hitStand() {
	}
	
	
	
	
	
	
	
	

	
	@Override
	public void newGame() {}

	@Override
	public void deal() {}

	
	@Override
	public void bet() {}

	@Override
	public void hit() {}

	@Override
	public void stand() {}

	@Override
	public void dealerTurn() {}

	@Override
	public void checkWin() {
		System.out.println("Called From hitstandState");
	}

}

/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class HitState implements State {

	private BlackJackGame game;
	/**
	 * 
	 */
	public HitState(BlackJackGame game) {
		this.game = game;
	}

	@Override
	public void hit() {
		game.getPlayer().addCard(game.getDeck().deal());
		game.setCurrentState(game.getHitStand());
	}
	
	
	
	
	
	
	@Override
	public void newGame() {}

	@Override
	public void deal() {}

	@Override
	public void bet() {}

	@Override
	public void hitStand() {
		System.out.println("Called from hitstate");
	}

	@Override
	public void stand() {}

	@Override
	public void dealerTurn() {}

	@Override
	public void checkWin() {
		System.out.println("called from hitstate");
	}
}

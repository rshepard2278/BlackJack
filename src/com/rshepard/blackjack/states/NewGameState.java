/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.states;

import com.rshepard.blackjack.game.BlackJackGame;
import com.rshepard.blackjack.interfaces.State;

public class NewGameState implements State {

	private BlackJackGame game;


	public NewGameState(BlackJackGame game) {
		this.game = game;
	}


	@Override
	public void newGame() {
		game.loadPlayers();
		game.setCurrentState(game.getDeal());
	}
	
	
	
	
	

	@Override
	public void deal() {
	}

	@Override
	public void bet() {
	}

	@Override
	public void hitStand() {
		System.out.println("Called from newGame");
	}

	@Override
	public void hit() {
	}
	
	@Override
	public void stand() {
	}

	@Override
	public void dealerTurn() {
	}

	@Override
	public void checkWin() {
		System.out.println("Called from new game");
	}
}

/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.interfaces;

public interface State {
	public void newGame();
	public void deal();
	public void bet();
	public void hitStand();
	public void hit();
	public void stand();
	public void dealerTurn();
	public void checkWin();
}

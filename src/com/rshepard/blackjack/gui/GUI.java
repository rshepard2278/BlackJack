/**
 * @author Richard Shepard
 * @version Apr 23, 2015
 */
package com.rshepard.blackjack.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.rshepard.blackjack.game.BlackJackGame;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 507860267620863810L;
	private static final int WIDTH = 700;
	private static final int HEIGHT = 400;
	private TablePanel gameTable;

	/**
	 * 
	 */
	public GUI() {
		super("Black Jack Table");
	}
	
	public void loadTable(BlackJackGame game) {
		gameTable = new TablePanel(game);
		setContentPane(gameTable);
		pack();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation( (screensize.width - getWidth())/4, (screensize.height - getHeight())/4);
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	public void getInput() {
		gameTable.waitForClick();
	}

	/**
	 * @return the gameTable
	 */
	public TablePanel getGameTable() {
		return gameTable;
	}	
	
	public void setInfoText(String text) {
		gameTable.updateInfo(text);
	}

}

/**
 * @author Richard Shepard
 * @version Apr 24, 2015
 */
package com.rshepard.blackjack.gui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import com.rshepard.blackjack.game.Card;

public class CardBuilder {
	
	private BufferedImage cardPic;

	public CardBuilder() {
		loadCards();
	}
	
	//Some of this method I didn't create on my own. I 
	//modified it from the book "Intro to Programming Using Java"
	public BufferedImage getCardImage(Card card) {
		int cx; // x-coord of upper left corner of the card inside cardsImage
		int cy; // y-coord of upper left corner of the card inside cardsImage		
		if (card == null) {
			cy = 4 * 123; // coords for a face-down card.
			cx = 2 * 79;
		} else {
			cx = (card.getValue()) * 79;
			switch (card.getSuit()) {
			case 0:
				cy = 0;
				break;
			case 1:
				cy = 123;
				break;
			case 2:
				cy = 2 * 123;
				break;
			default: // spades
				cy = 3 * 123;
				break;
			}
		}
		return cardPic.getSubimage(cx, cy, 79, 123);
	}	
	
	//Image from the book "Intro to Programming Using Java"
	private void loadCards() {
		URL urlToFile = this.getClass().getResource("cards.png");
		try {
			cardPic = ImageIO.read(urlToFile);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

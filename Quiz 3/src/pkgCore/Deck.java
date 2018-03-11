package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck(int numberOfDecks) {
		for (int x = 1; x <= numberOfDecks; x++) {
			for (eRank rank: eRank.values()) {
				for (eSuit suit: eSuit.values()) {
					Card card = new Card(suit,rank);
					cards.add(card);
				}
			}
		}
		Collections.shuffle(cards);
	}
	
	public Deck() {
		this(1);
	}
	
	public Card draw() {
		return cards.remove(0);
	}

	public int getRemaining(Object eNum) {
		int result = 0;
		for (Card card: cards) {
			if (card.geteRank() == eNum || card.geteSuit() == eNum) {
				result++;
			}
		}
		return result;
	}
}

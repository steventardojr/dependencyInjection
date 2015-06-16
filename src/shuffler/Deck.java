package shuffler;

import com.google.inject.*;

public class Deck {
	private Card[] deck;
	private ShuffleStrategy shuffleStrategy;
	
	public Deck() {
		this.deck = new Card[52];
		int cardsAdded = 0;
		for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
			for (int cardNumber = 1; cardNumber <= 13; cardNumber++) {
				deck[cardsAdded] = new Card(cardSuit, cardNumber);
				cardsAdded++;
			}
		}
	}
	
	public Card getCard(int i) {
		return deck[i];
	}
	
	@Inject
	public void setStrategy(ShuffleStrategy shuffleStrategy) {
		this.shuffleStrategy = shuffleStrategy;
	}
	
	public void shuffle() {
		this.deck = shuffleStrategy.shuffleCards(this.deck);
	}
}

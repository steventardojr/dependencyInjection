package shuffler;

import com.google.inject.*;

@Singleton
public class Deck {
	private Card[] deck;
	private ShuffleStrategy shuffleStrategy;
	
	// Create a new deck by creating an array of card objects
	public Deck() {
		this.deck = new Card[52];
		int cardsAdded = 0; // Keep track of index of array
		
		// Add the correct suit and number of each card to the array
		for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
			for (int cardNumber = 1; cardNumber <= 13; cardNumber++) {
				deck[cardsAdded] = new Card(cardSuit, cardNumber);
				cardsAdded++;
			}
		}
	}
	
	// Return a card based on the index of the array
	public Card getCard(int i) {
		return deck[i];
	}
	
	// Set the correct shuffling algorithm
	@Inject
	public void setStrategy(ShuffleStrategy shuffleStrategy) {
		this.shuffleStrategy = shuffleStrategy;
	}
	
	// Shuffle the cards based on the set algorithm
	public void shuffle() {
		this.deck = shuffleStrategy.shuffleCards(this.deck);
	}
}

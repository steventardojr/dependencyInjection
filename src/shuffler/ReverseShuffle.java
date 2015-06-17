package shuffler;

public class ReverseShuffle implements ShuffleStrategy {
	public ReverseShuffle() {
	}
	
	/*
	 * Reverse the order of the array by using a temporary
	 * array populated backwards
	 */
	public Card[] shuffleCards(Card[] deck) {
		Card[] tempDeck = new Card[52];
		int i = 51;
		for (Card card : deck) {
			tempDeck[i] = card;
			i--;
		}
		deck = tempDeck;
		return deck;
	}
}
package shuffler;

public class NoShuffle implements ShuffleStrategy {
	public NoShuffle() {
	}
	
	public Card[] shuffleCards(Card[] deck) {
		return deck;
	}
}
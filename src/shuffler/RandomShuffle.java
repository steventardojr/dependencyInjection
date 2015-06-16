package shuffler;

import java.util.Random;

public class RandomShuffle implements ShuffleStrategy {
	public RandomShuffle() {
	}
	
	public Card[] shuffleCards(Card[] deck) {
		Random random = new Random();
		for (int i = deck.length - 1; i > 0; i--) {
			int newIndex = random.nextInt(i + 1);
			Card tempCard = deck[newIndex];
			deck[newIndex] = deck[i];
			deck[i] = tempCard;
		}
		return deck;
	}
}
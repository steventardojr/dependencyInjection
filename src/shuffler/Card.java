package shuffler;

public class Card {
	// Variables for unique card
	private final int cardNumber;
	private final int cardSuit;
	
	public Card(int cardSuit, int cardNumber) {
		this.cardSuit = cardSuit;
		this.cardNumber = cardNumber;
	}
	
	public int getSuit() {
		return this.cardSuit;
	}
	
	public int getNumber() {
		return this.cardNumber;
	}
	
	public String toString() {
		String card = "";
		
		// Set card number
		switch (this.cardNumber) {
		case 1:
			card = "Ace of ";
			break;
		case 2:
			card = "Two of ";
			break;
		case 3:
			card = "Three of ";
			break;
		case 4:
			card = "Four of ";
			break;
		case 5:
			card = "Five of ";
			break;
		case 6:
			card = "Six of ";
			break;
		case 7:
			card = "Seven of ";
			break;
		case 8:
			card = "Eight of ";
			break;
		case 9:
			card = "Nine of ";
			break;
		case 10:
			card = "Ten of ";
			break;
		case 11:
			card = "Jack of ";
			break;
		case 12:
			card = "Queen of ";
			break;
		case 13:
			card = "King of ";
			break;
		default:
			card = "Bob";
			break;
		}
		
		// Set card suit
		switch (this.cardSuit) {
		case 1:
			card = card + "Clubs";
			break;
		case 2:
			card = card + "Spades";
			break;
		case 3:
			card = card + "Diamonds";
			break;
		case 4:
			card = card + "Hearts";
			break;
		default:
			card = "Jimmy";
			break;
		}
		
		return card;
	}
}

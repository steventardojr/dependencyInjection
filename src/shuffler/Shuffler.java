package shuffler;

import java.util.Scanner;
import com.google.inject.*;

public class Shuffler {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card;
		
		// Create injectors
		Injector randomInjector = Guice.createInjector(new RandomShuffleModule());
		Injector reverseInjector = Guice.createInjector(new ReverseShuffleModule());
		Injector noInjector = Guice.createInjector(new NoShuffleModule());
		
		// Create scanner and variable to hold user input
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		
		// Keep looping until user decides to quit
		while (!(userInput.equals("Q")) || !(userInput.equals("q"))) {
			System.out.println("How would you like to shuffle the cards?");
			System.out.println("[R]andom, [Re]verse, [D]on't Shuffle");
			System.out.println("Enter \"q\" or \"Q\" to quit.");
			userInput = sc.next();
			
			// Use the random shuffle algorithm and print the cards
			if (userInput.equals("R")) {
				deck = randomInjector.getInstance(Deck.class);
				deck.shuffle();
				int i = 0;
				for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
					for (int cardNumber = 1; cardNumber <= 13; cardNumber++) {
						card = deck.getCard(i);
						if (i < 12 || (i > 12 && i < 25) || (i > 25 && i < 38) || (i > 38 && i < 51))
							System.out.print(card.toString() + ", ");
						else if (i != 51)
							System.out.println(card.toString() + ",");
						else if (i == 51) {
							System.out.println(card.toString() + "\n");
						}
						i++;
					}
				}
			}
			
			// Use the reverse shuffle algorithm and print the cards
			else if (userInput.equals("Re")) {
				deck = reverseInjector.getInstance(Deck.class);
				deck.shuffle();
				int i = 0;
				for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
					for (int cardNumber = 1; cardNumber <= 13; cardNumber++) {
						card = deck.getCard(i);
						if (i < 12 || (i > 12 && i < 25) || (i > 25 && i < 38) || (i > 38 && i < 51))
							System.out.print(card.toString() + ", ");
						else if (i != 51)
							System.out.println(card.toString() + ",");
						else if (i == 51) {
							System.out.println(card.toString() + "\n");
						}
						i++;
					}
				}
			}
			
			// Use the no shuffle algorithm and print the cards
			else if (userInput.equals("D")) {
				deck = noInjector.getInstance(Deck.class);
				deck.shuffle();
				int i = 0;
				for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
					for (int cardNumber = 1; cardNumber <= 13; cardNumber++) {
						card = deck.getCard(i);
						if (i < 12 || (i > 12 && i < 25) || (i > 25 && i < 38) || (i > 38 && i < 51))
							System.out.print(card.toString() + ", ");
						else if (i != 51)
							System.out.println(card.toString() + ",");
						else if (i == 51) {
							System.out.println(card.toString() + "\n");
						}
						i++;
					}
				}
			}
			
			// Quit the program
			else if (userInput.equals("Q") || userInput.equals("q")) {
				break;
			}
			
			// Check for invalid input
			else {
				System.out.println("Invalid input. Try again.");
			}
		}
		
		sc.close();
	}
}
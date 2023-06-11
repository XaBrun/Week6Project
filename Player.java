package Week6Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>(); //list of cards in hand
	int score;
	String name;
	
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	
	public void describe() { //describe what cards the player has
		
		System.out.println("\nPlayer " + name + " has these cards: \n" );
		for (Card card: hand) {
			card.describeCard();
		}
	
		
	}
	
	public Card flipCard() { //reveal first card in player's hand
		
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	
	public void incrementScore() { //used to keep score count
		score+=1;
	}
	
	
	public void draw(Deck deck) { //pull first card from deck, add to player's hand
		
		Card card = deck.drawCard();
		hand.add(card);
		
	}

}

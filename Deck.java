package Week6Project;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>(); //list of cards type Card
	
	
	public Deck() {
		for (int a = 2; a < 15; a++) { //if a is between 2 and 14, increment and do the following
			for (int i = 1; i <= 4; i++) { // if i is between 1 and 4, do the following
				cards.add(new Card(a, i)); //add the values of a and i to the card
			}
		}
		
	}
	
	
	
	
	public void shuffleCards() {
		
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		
		Card drawncard = cards.get(0);
		cards.remove(0);
		return drawncard;
	} 
	
	
	

}

package Week6Project;

public class App {

	public static void main(String[] args) {
		
			//instantiating deck and 2 players
			Deck deck = new Deck();
			Player p1 = new Player("Douglas");
			Player p2 = new Player("Ruth");
			
			
			//shuffle cards
			deck.shuffleCards();
			
			
			//add card returned from drawcard method for each player
			for (int i = 0; i < 26; i++) {
				p1.hand.add(deck.drawCard());
				p2.hand.add(deck.drawCard());
			}
			
			// player name and what cards they have
			p1.describe();
			p2.describe();
			
			// flip all cards for each player
			for (int i = 0; i < 26; i ++) {
				Card p1Card = p1.flipCard();
				Card p2Card = p2.flipCard();
			
			
			//determine which player has the higher valued card and add points to round winner
			if (p1Card.getValue()> p2Card.getValue()) {
				p1.incrementScore();
			} else if (p1Card.getValue() < p2Card.getValue()) {
				p2.incrementScore();
			}
			
			}
			
			
			//print the player scores
			System.out.println("\nPlayer 1 has a score of " + p1.score + "\nPlayer 2 has a score of " + p2.score);
			
			//determine which player has the higher score and deem them the winner, or draw if equal 
			if (p1.score > p2.score) {
				System.out.println("\n" + p1.name + " is the winner!");
			} else if (p1.score < p2.score) {
				System.out.println("\n" + p2.name + " is the winner!");
			} else {
				System.out.println("Draw");
			}
			
			
		

		}

	}


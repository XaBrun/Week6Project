package Week6Project;

public class Card {
	
	
	//define fields
	private int value;
	private int name;
	
	//define the integers that the fields will be attached to
	public int Two = 2;
	public int Three = 3;
	public int Four = 4;
	public int Five = 5;
	public int Six = 6;
	public int Seven = 7;
	public int Eight = 8;
	public int Nine = 9;
	public int Ten = 10;
	public int Jack = 11;
	public int Queen = 12;
	public int King = 13;
	public int Ace = 14;
	
	public int Clubs = 1;
	public int Diamonds = 2;
	public int Hearts = 3;
	public int Spades = 4;
	
	// Card constructor to store values
	public Card(int value, int name) {
		this.value = value;
		this.name = name;
	}
	
	
	
	
	public int getValue() {
		return value;
	}
	
	//set value only if card value is between 2 and 14
	public void setValue(int cardValue) {
		if (cardValue >= 2 && cardValue <=14) {
			this.value = cardValue;
		}
		
	}
	
	
	public int getName() {
		
		return name;
	}
	
	//set name only if cardName value is between 1 and 4
	public void setName(int cardName) {
		if (cardName >= 1 && cardName <= 4) {
			this.name = cardName;
		}
		
	}
	
	
	
	public String returnCardName() { //method to form card names
		
		String cardName = ""; //catch anything I will be concatenating
		
		for (int i = 2; i < 11; i++) {
			if(value == i) {
				cardName+= i;
			} //as long as i is less than 11, if the value is equal to i, add that number to the card name
		}

		if (cardName.isEmpty()) { //if the number doesn't meet previous conditions, do the following
			if(value == 11) {
				cardName+= "Jack";
			} else if (value == 12) {
				cardName+= "Queen";
			} else if (value == 13) {
				cardName+= "King";
			} else if (value ==14) {
				cardName+= "Ace";
			}
		}
		
			
		
		if (name == Clubs) { //if the value of name is equal to assigned suit values, concatenate that
			cardName+=" Of Clubs";
		} else if (name == Diamonds) {
			cardName+=" Of Diamonds";
		} else if (name == Hearts) {
			cardName+=" Of Hearts";
		} else if (name == Spades) {
			cardName+=" Of Spades";
		}
		
		return cardName;		
	}
	
	public void describeCard() {
		System.out.println("Your current card is a " + this.returnCardName()); //return the result from the previous method
		
	}
	

}

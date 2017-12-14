
public class Card {
	private String rank;
	private String suit;
	private int pointValue;
	//Constructor
	public Card(String rank, String suit, int pointValue) 
	{
		// TODO Auto-generated constructor stub
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	//Getter
	public String getRank()
	{
		return rank;
	}
	public String getSuit()
	{
		return suit;
	}
	public int getpointValue()
	{
		return pointValue;
	}
	
	//check if this card equals another in value
	public boolean equals(Card otherCard)
	{
		if(this.rank == otherCard.getRank())
		{
			if(this.suit == otherCard.getSuit())
			{
				if(this.pointValue == otherCard.getpointValue())
				{
					return true;
				}
			}
				
		}
		return false;
	}
	
	//toString
	public String toString()
	{
		String s = "["+ "Card rank: "+ rank + " |Card suit: "+ suit + " |Card pointValue: " + pointValue + "]";
		return s;
		
	}
}

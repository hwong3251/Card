import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	/** TEST ***********************************************
	public static void main(String[]args)
	{
		String[]ranks = new String[]{"A","B","C"};
		String[]suits = new String[] {"Giraffes","Lions"};
		int[]values = new int[]{2,1,6};
		Deck u = new Deck(ranks,suits,values);
		for(int i = 0; i < unDealt.size(); i ++)
		{
			System.out.println(unDealt.get(i));
		}
	}
	*****************************************************/
	
	//an arrayList we will use to hold cards we have already seen, so we can shuffle them back in
	ArrayList<Card> Dealt = new ArrayList<Card>();
	//an arrayList of all the cards in the deck
	ArrayList<Card> unDealt = new ArrayList<Card>();
			
	public Deck(String[]ranks, String[]suits, int[]values) 
	{
		
		for(int i = 0; i < suits.length; i++)
		{
			for(int j = 0; j < ranks.length; j++)
			{
				Card n = new Card(ranks[j],suits[i],values[j]);
				unDealt.add(n);
			}
		}
	}
	
	//return true when size of the deck is 0
	public boolean isEmpty()
	{
		if(unDealt.size()==0)
		{
			return true;
		}
		return false;
	}
	
	//return number of cards in deck that are left to be dealt
	public int size()
	{
		return unDealt.size();
	}
	
	//deal a card by removing it from the deck and return it
	public Card deal()
	{
		if(!isEmpty())
		{
			Random rnd = new Random();
			int n = rnd.nextInt(unDealt.size());
			Dealt.add(unDealt.get(n));
			unDealt.remove(n);
			return Dealt.get(n);
		}
		return null;
	}
	
	//shuffle cards from Dealt list back into unDealt
	public void shuffle()
	{
		while(Dealt.size()!=0)
		{
			
		}
	}
}

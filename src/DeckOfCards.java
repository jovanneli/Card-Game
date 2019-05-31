import java.util.ArrayList;

public class DeckOfCards 
{
	private ArrayList<Card> cards;
	private int[] rank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private String[] suit = {"clubs", "diamonds", "hearts", "spades"};
	
	public DeckOfCards()
	{
		cards = new ArrayList<Card>();
		
		for(int i = 1; i < suit.length; i++)
		{
			for(int j = 1; j < rank.length; j++)
			{
				cards.add(new Card(rank[j], suit[i]));
			}
		}
	}
	
	public void shuffle()
	{
		for(int i = 0; i < cards.size(); i++)
		{
			Card temp = cards.get(i);
			int randomLocation = (int)(Math.random()*52 + 1);
			cards.set(i, cards.get(randomLocation));
			cards.set(randomLocation, temp);
		}
	}
	
	public Card deal()
	{
		return(cards.get(0));
	}
}

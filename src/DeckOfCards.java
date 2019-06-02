import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards
{
	private ArrayList<Card> cards;
	private int[] rank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private String[] suit = {"clubs", "diamonds", "hearts", "spades"};
	
	public DeckOfCards()
	{
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < suit.length ; i++)
		{
			for(int j = 0; j < rank.length; j++)
			{
				cards.add(new Card(rank[j], suit[i]));
			}
		}
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	public ArrayList<Card> deal(int numCards)
	{
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		for(int i = 0; i < numCards; i++)
		{
			drawnCards.add(cards.remove(0));
		}
		return drawnCards;
	}
	
	public void collect(Card card)
	{
		cards.add(card);
	}
	
	public int getNumCards()
	{
		return cards.size();
	}
}

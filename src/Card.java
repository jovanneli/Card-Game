import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Card
{
	private BufferedImage image;
	private int rank;
	private String suit;
	
	public Card(int rank, String suit)
	{
		this.rank = rank;
		this.suit = suit;
		
		String filename = rank + suit + ".png";
		try
		{
			this.image = ImageIO.read(new File(filename));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public int getRank()
	{
		return rank;
	}
}

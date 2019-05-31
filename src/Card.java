import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Card extends JComponent
{
	private BufferedImage image;
	private int rank;
	private String suit;
	
	public Card(int rank, String suit)
	{
//		setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
		
		String filename = rank + suit + ".png";
		try
		{
			this.image = ImageIO.read(new File(filename));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	    JLabel label = new JLabel(new ImageIcon(image));
//	    gbc.gridx = 0;
//	    gbc.gridy = 0;
//	    add(label,gbc);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
	}
	
}

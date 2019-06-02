import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JPanel
{	
	private int cardCounter1;
	private int cardCounter2;
	private BufferedImage image;
	
	public Game(DeckOfCards cards)
	{
		setLayout(null);
		
		cards.shuffle();
		ArrayList<Card> cardHand1 = cards.deal(26);
		ArrayList<Card> cardHand2 = cards.deal(26);
		
		cardCounter1 = cardHand1.size();
		cardCounter2 = cardHand2.size();
		
		JLabel player1 = new JLabel("Player 1 Total Cards: ");
		player1.setBounds(10, 20, 130, 20);
		add(player1);
		
		JLabel player2 = new JLabel("Player 2 Total Cards: ");
		player2.setBounds(620, 20, 130, 20);
		add(player2);
		
		JLabel count1 = new JLabel(Integer.toString(cardCounter1));
		count1.setBounds(140, 20, 20, 20);
		add(count1);
		
		JLabel count2 = new JLabel(Integer.toString(cardCounter2));
		count2.setBounds(750, 20, 20, 20);
		add(count2);
		
//		Card card = cardHand1.get(0);
//		JLabel cardLabel = new JLabel(new ImageIcon(card.getImage()));
//		cardLabel.setBounds(275, 50, 250, 350);
//		add(cardLabel);
		
		JLabel cardLabel = new JLabel();
		cardLabel.setBounds(275, 50, 250, 350);
		add(cardLabel);
		
		addKeyListener(new KeyListener()
				{
					@Override
					public void keyTyped(KeyEvent e) 
					{
						if(e.getKeyCode() == KeyEvent.VK_Z)
						{	
							Card card = cardHand1.get(0);
							image = card.getImage();
							ImageIcon icon = new ImageIcon(image);
							cardLabel.setIcon(icon);
							cards.collect(cardHand1.remove(0));
						}
						else if(e.getKeyCode() == KeyEvent.VK_M)
						{
							Card card = cardHand2.get(0);
							image = card.getImage();
							ImageIcon icon = new ImageIcon(image);
							cardLabel.setIcon(icon);
							cards.collect(cardHand2.remove(0));
						}
						else if(e.getKeyCode() == KeyEvent.VK_A)
						{
							ArrayList<Card> temp = cards.deal(cards.getNumCards());
							for(int i = 0; i < temp.size(); i++)
							{
								cardHand1.add(temp.get(i));
							}
						}
						else if(e.getKeyCode() == KeyEvent.VK_L)
						{
							ArrayList<Card> temp = cards.deal(cards.getNumCards());
							for(int i = 0; i < temp.size(); i++)
							{
								cardHand2.add(temp.get(i));
							}
						}
					}

					@Override
					public void keyPressed(KeyEvent e) 
					{

					}

					@Override
					public void keyReleased(KeyEvent e) 
					{
						
					}
					
				});
		
		if(Integer.parseInt(count1.getText()) == 0)
		{
			cardLabel.setText("Player 2 Wins!");
		}
		if(Integer.parseInt(count2.getText()) == 0)
		{
			cardLabel.setText("Player 1 Wins!");
		}
	}
}

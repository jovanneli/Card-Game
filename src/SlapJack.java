import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlapJack extends JFrame
{
	private DeckOfCards deck;
	
	public SlapJack()
	{
		setTitle("SlapJack");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		deck = new DeckOfCards();
		
		JButton begin = new JButton("Begin game.");
		begin.setBounds(240, 20, 120, 20);
		add(begin);
		begin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				deck.deal();
			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new SlapJack();
	}

}

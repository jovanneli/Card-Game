import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SlapJack extends JFrame
{
	private Welcome welcome;
	private Game game;
	private DeckOfCards deck;
	
	public SlapJack()
	{
		setTitle("SlapJack");
		setBounds(100, 100, 800, 500);
		
		deck = new DeckOfCards();
		
		CardLayout c1 = new CardLayout();
		JPanel all = new JPanel();
		all.setLayout(c1);
		add(all);
		
		welcome = new Welcome();
		game = new Game(deck);
		all.add(welcome, "Welcome");
		all.add(game, "Game");
		c1.show(all, "Welcome");
		
		JMenuBar menubar = new JMenuBar();
		JMenuItem home = new JMenuItem("Home");
		JMenuItem begin = new JMenuItem("New Game");
		menubar.add(home);
		menubar.add(begin);
		home.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					c1.show(all, "Welcome");
				}
			});
		begin.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					c1.show(all, "Game");
				}
			});
		this.setJMenuBar(menubar);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new SlapJack();
	}

}

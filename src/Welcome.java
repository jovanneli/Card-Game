import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel
{
	public Welcome()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel welcomeMessage = new JLabel("Welcome to SlapJack!");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(welcomeMessage, gbc);
		
		JLabel instructions = new JLabel("Player 1 Controls: 'Z' to play a card, 'A' to slap the deck.");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(instructions, gbc);
		
		JLabel instruction2 = new JLabel("Player 2 Controls: 'M' to play a card, 'L' to slap the deck.");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(instruction2, gbc);
	}
}

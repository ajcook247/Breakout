import javax.swing.JFrame;
import java.awt.EventQueue;

// Main class for the game
public class Breakout extends JFrame
{
	// Constructor
	public Breakout()
	{
		initUI();
	}
	
	// Sets up the UI for the game
	private void initUI()
	{
		add(new Board());
		setTitle("Breakout");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		pack();
	}
	
	// Main method
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var game = new Breakout();
			game.setVisible(true);
		});
	}
}

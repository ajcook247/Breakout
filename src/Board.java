import javax.swing.*;
import java.awt.*;

// Handles the Board of the game
public class Board extends JPanel
{
	private Timer timer;
	private String message = "Game Over";
	private Ball ball;
	private Paddle paddle;
	private Brick[] bricks;
	private boolean inGame = true;
	
	// Constructor
	public Board()
	{
		initBoard();
	}
	
	private void initBoard()
	{
		addKeyListener(new TAdapter());
		setFocusable(true);
		setPreferredSize(new Dimension(Commons.WIDTH, Commons.HEIGHT));
		
		gameInit();
	}
	
	private void gameInit()
	{
		bricks = new Brick[Commons.N_BRICKS];
		ball = new Ball();
		paddle = new Paddle();
		int k = 0;
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				bricks[k] = new Brick(j * 40 + 30, i * 10 + 50);
				k++;
			}
		}
		
		timer = new Timer(Commons.PERIOD, new GameCycle());
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		var g2d = (Graphics2D)g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		if (inGame)
			drawObjects(g2d);
		else
			gameFinished(g2d);
		
		Toolkit.getDefaultToolkit().sync();
	}
}

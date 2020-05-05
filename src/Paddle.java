import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

// Handles the Paddle object, which is controlled by the player
public class Paddle extends Sprite
{
	private int dx;
	
	// Constructor
	public Paddle()
	{
		initPaddle();
	}
	
	// Initializes the paddle, loads in its image, and places it in the starting position
	private void initPaddle()
	{
		loadImage();
		getImageDimensions();
		resetState();
	}
	
	// Retrieves the image from resources and loads it in
	private void loadImage()
	{
		var icon = new ImageIcon("src/resources/paddle.png");
		image = icon.getImage();
	}
	
	// Sets the ball's coordinates to a default state
	private void resetState()
	{
		x = Commons.INIT_PADDLE_X;
		y = Commons.INIT_PADDLE_Y;
	}
	
	// Handles movement of the paddle
	void move()
	{
		x += dx;
		
		// Paddle reaches left boundary
		if (x <= 0)
			x = 0;
		
		// Paddle reaches right boundary
		if (x >= Commons.WIDTH - imageWidth)
			x = Commons.WIDTH - imageWidth;
	}
	
	// Handles movement when user presses a key
	void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_RIGHT)
			dx = 1;
		
		if (key == KeyEvent.VK_LEFT)
			dx = -1;
	}
	
	// Handles movement when user releases a key
	void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT)
			dx = 0;
	}
}

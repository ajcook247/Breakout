import javax.swing.ImageIcon;

// Handles the Ball object
public class Ball extends Sprite
{
	private int xDir, yDir;
	
	// Constructor
	public Ball()
	{
		initBall();
	}
	
	// Initializes the ball, loads in its image, and places it in the starting position
	private void initBall()
	{
		xDir = 1;
		yDir = -1;
		
		loadImage();
		getImageDimensions();
		resetState();
	}
	
	// Retrieves the image from resources and loads it in
	private void loadImage()
	{
		var icon = new ImageIcon("src/resources/ball.png");
		image = icon.getImage();
	}
	
	// Sets the ball's coordinates to a default state
	private void resetState()
	{
		x = Commons.INIT_BALL_X;
		y = Commons.INIT_BALL_Y;
	}
	
	// Handles the ball movement
	void move()
	{
		x += xDir;
		y += yDir;
		
		// Ball reaches left boundary
		if (x == 0)
			setXDir(1);
		
		// Ball reaches right boundary
		if (x == Commons.WIDTH - imageWidth)
			setXDir(-1);
		
		// Ball reaches top boundary
		if (y == 0)
			setYDir(1);
	}
	
	// Sets current xDir to parameter x
	void setXDir(int x)
	{
		xDir = x;
	}
	
	// Sets current yDir to y
	void setYDir(int y)
	{
		yDir = y;
	}
	
	// Gets current xDir
	int getXDir()
	{
		return xDir;
	}
	
	// Gets current yDir
	int getYDir()
	{
		return yDir;
	}
}

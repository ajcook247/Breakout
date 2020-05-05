
import javax.swing.ImageIcon;

// Handles the brick obstacles
public class Brick extends Sprite
{
	private boolean destroyed;
	
	// Constructor
	public Brick(int x, int y)
	{
		initBrick(x, y);
	}
	
	// Creates a new brick at (x, y), and loads in its image
	private void initBrick(int x, int y)
	{
		this.x = x;
		this.y = y;
		destroyed = false;
		
		loadImage();
		getImageDimensions();
	}
	
	// Retrieves the image from resources and loads it in
	private void loadImage()
	{
		var icon = new ImageIcon("src/resources/brick.png");
		image = icon.getImage();
	}
	
	// Returns if the brick has been destroyed
	boolean isDestroyed()
	{
		return destroyed;
	}
	
	// Sets the value of destroyed to the value d
	void setDestroyed(boolean d)
	{
		destroyed = d;
	}
}

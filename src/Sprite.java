import java.awt.Image;
import java.awt.Rectangle;

// Handles any given sprite on screen
public class Sprite 
{
	int x, y;
	int imageWidth, imageHeight;
	Image image;
	
	// Sets value of x to parameter x
	protected void setX(int x)
	{
		this.x = x;
	}
	
	// Gets current x
	int getX()
	{
		return x;
	}
	
	// Sets value of y to parameter y
	protected void setY(int y)
	{
		this.y = y;
	}
	
	// Gets current y
	int getY()
	{
		return y;
	}
	
	// Gets the current image width
	int getImageWidth()
	{
		return imageWidth;
	}
	
	// Gets the current image height
	int getImageHeight()
	{
		return imageHeight;
	}
	
	// Creates a new rectangle position at (x, y) with appropriate width and height
	Rectangle getRect()
	{
		return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}
	
	// Sets the image width and height
	void getImageDimensions()
	{
		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
	}
}

package window;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author s-afzalr
 * @version 1.3
 * @since 1.2
 */
@SuppressWarnings("serial")
@Deprecated
public abstract class WindowButton extends WindowComponent {
	
	/**
	 * Stores the image to use as the button
	 */
	private BufferedImage image = null;
	
	/**
	 * Constructs a new WindowButton using the image from the filename provided
	 * @param filename Filename for the image to use
	 * @throws HeadlessException
	 */
	public WindowButton(String filename) throws IOException {
		this(ImageIO.read(new File(filename)));
	}
	
	public WindowButton(BufferedImage image) {
		this.image = image;
	}
	
	public void paintComponent(Graphics g) {     
        g.drawImage(this.image,getX(),getY(),null);
    }
	
	/**
	 * Gets the button's image
	 * @return Returns the image of the button
	 */
	public BufferedImage getImage() {
		return this.image;
	}

}

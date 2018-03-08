package window;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * 
 * @author s-afzalr
 * @version 1.3
 * @since 1.1
 */
@SuppressWarnings("serial")
@Deprecated
public abstract class WindowComponent extends JComponent {
	
	/**
	 * The image of the component.
	 */
	private BufferedImage image;
	
	/**
	 * Constructs a new WindowComponent.
	 * @param filename Image file to use for the component's image.
	 */
	public WindowComponent(String filename) {
		super();
		image = null;
		try {
		    image = ImageIO.read(new File(filename));
		} catch (IOException e) {
			System.out.println("WindowComponent " + getName() + " failed to load image!");
		}
		this.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
			     click();
			  }
			});
		this.repaint();
	}
	
	/**
	 * Constructs a new WindowComponent with no image
	 */
	public WindowComponent() {
		super();
		image = null;
	}
	
	public abstract void click();
	
	/**
	 * Paint method, which paints the component's image
	 */
	public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        g.drawImage(image,getX(),getY(),null);
    }

}

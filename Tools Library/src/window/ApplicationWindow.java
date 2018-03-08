package window;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

/**
 * The ApplicationWindow class represents a frame for applications. 
 * It has the ability to tell whether the window is still running,
 * and it also is preset to exit on close, and calls its abstract close() method when doing so. 
 * @author s-afzalr
 * @version 1.3
 * @since 1.0
 */
public abstract class ApplicationWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Tells whether the window is running.
	 */
	private boolean running = true;
	
	/**
	 * Creates a new ApplicationWindow with the specified name and icon.
	 * @param name The window name.
	 * @param filename The filename to source the window icon from.
	 */
	public ApplicationWindow(String name, String filename) {
		super(name);
		try {
			this.setIconImage(ImageIO.read(new File(filename)));
		} catch (IOException e) {
			
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				stop();
			}
		});
	}
	
	/**
	 * Creates a new ApplicationWindow with the specified name, and a null icon.
	 * @param name The window name.
	 */
	public ApplicationWindow(String name) {
		this(name, "");
	}
	
	/**
	 * Tells if the window is running.
	 * @return Returns true if the window is running.
	 */
	public boolean isRunning() {
		return this.running;
	}
	
	/**
	 * Stops the window, closing it and activating its close() method.
	 */
	public void stop() {
		this.running = false;
		this.close();
		this.dispose();
	}
	
	/**
	 * Calls when the window closes.
	 */
	public void close() {}
	
}

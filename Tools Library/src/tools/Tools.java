package tools;

import javax.swing.UIManager;

/**
 * The abstract Tools class contains helpful methods.
 * @author s-afzalr
 * @version 1.3
 * @since 1.2
 */
public abstract class Tools {
	
	/**
	 * Sets the Look and Feel to the operating system's default setting.
	 * @return Returns true if the Look and Feel was set successfully, and false otherwise.
	 */
	 public static boolean setLookAndFeel() {
		 try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			 return true;
		 } catch (Exception e) {
			 return false;
		 }
	 }
	 
	 public static double getTotalMemory() {
		 return Runtime.getRuntime().totalMemory();
	 }

	 public static double getUsedMemory() {
		 return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	 }
	 
	 public static double getAllocatedMemory() {
		 return Runtime.getRuntime().maxMemory();
	 }

}

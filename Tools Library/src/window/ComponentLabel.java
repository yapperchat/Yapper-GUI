package window;

import java.awt.GridBagLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import constraints.Constraints;

/**
 * 
 * @author s-afzalr
 *
 * @param <E> Represents a JComponent.
 */
public class ComponentLabel<E extends JComponent> extends JPanel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private JLabel label;
	/**
	 * 
	 */
	private E component;
	
	/**
	 * 
	 */
	private Constraints c_label;
	/**
	 * 
	 */
	private Constraints c_component;
	
	public Constraints constraints;
	
	public ComponentLabel(E component, String label, Constraints constraints) {
		super(new GridBagLayout());
		
		this.label = new JLabel(label);
		this.component = component;
		this.c_label = new Constraints(0,0);
		this.c_component = new Constraints(0,1);
		
		this.add(this.label, this.c_label);
		this.add(this.component, this.c_component);
		
		this.constraints = constraints;
	}
	
	public ComponentLabel(E component, String label, int x, int y) {
		this(component, label, new Constraints(x, y));
	}
	
	public ComponentLabel(E component, String label) {
		this(component, label, new Constraints());
	}
	
	public E getComponent() {
		return this.component;
	}
	
}

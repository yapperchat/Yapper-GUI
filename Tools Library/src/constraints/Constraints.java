package constraints;

import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class Constraints extends GridBagConstraints {

	public Constraints() {
		super();
	}
	
	public Constraints(int gridx, int gridy) {
		this();
		this.gridx = gridx;
		this.gridy = gridy;
	}

}

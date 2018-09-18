package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Shpere extends Shape {
	private float radius = 0;

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public Shpere(float radius) {
		super();
		
		//radius
		if (radius > 0) {
			this.setRadius(radius);
		} else {
			JOptionPane.showMessageDialog(null,
					"Parameter of " + radius + " is invalid. Radius will be set to 0.",
					"Error",
				    JOptionPane.PLAIN_MESSAGE);
			this.setRadius(0);
		}
	}

}

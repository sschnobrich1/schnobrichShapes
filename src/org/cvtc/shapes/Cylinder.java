package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {
	
	private float radius = 0;
	private float height = 0;
	
	public float getRadius() {
		return radius;
	}
	private void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	public Cylinder(float radius, float height) {
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
		
		//height
		if (height > 0) {
			this.setHeight(height);
		} else {
			JOptionPane.showMessageDialog(null,
					"Parameter of " + height + " is invalid. Height will be set to 0.",
					"Error",
				    JOptionPane.PLAIN_MESSAGE);
			this.setHeight(0);
		}
	}
	
}

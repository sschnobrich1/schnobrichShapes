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
	@Override
	public float surfaceArea() {
		float result = (float) (4*Math.PI*radius*radius);
		return result;
	}
	@Override
	public float volume() {
		float result = (float)(4/3*Math.PI*radius*radius*radius);
		return result;
	}
	@Override
	public void render() {
		String newline = System.getProperty("line.separator");
		float surfaceArea = surfaceArea();
		float volume = volume();
		//make the dialog box
		JOptionPane.showMessageDialog(null,
			    "Radius: " + radius + newline +
			    		"Surface Area: " + surfaceArea + newline +
			    		"Volume: " + volume,
			    "Sphere",
			    JOptionPane.PLAIN_MESSAGE);
	}
}

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
	
	@Override
	public float volume() {
		float result = (float)(Math.PI*radius*radius*height);
		return result;
	}
	
	@Override
	public float surfaceArea() {	
		float result = (float) (2*Math.PI*radius*height + 2*Math.PI*radius*radius);
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
						"Height: " + height + newline +
			    		"Surface Area: " + surfaceArea + newline +
			    		"Volume: " + volume,
			    "Cylinder",
			    JOptionPane.PLAIN_MESSAGE);
	}

}

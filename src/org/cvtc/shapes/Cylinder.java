package org.cvtc.shapes;

public class Cylinder extends Shape implements Render {
	
	private float radius = 0;
	private float height = 0;
	
	private String message;
	private String title;
	
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
	public Cylinder(float radius, float height, Dialog messagebox) {
		super(messagebox);
		
		//radius
		if (radius > 0) {
			this.setRadius(radius);
		} else {
			message = "Parameter of " + radius + " is invalid. Height will be set to 0.";
			title = "Error";
			
			messagebox.show(message, title);
			this.setRadius(0);
		}
		
		//height
		if (height > 0) {
			this.setHeight(height);
		} else {
			message = "Parameter of " + height + " is invalid. Height will be set to 0.";
			title = "Error";
			
			messagebox.show(message, title);
			
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
	
	public int render() {
		String newline = System.getProperty("line.separator");
		float surfaceArea = surfaceArea();
		float volume = volume();
		//make the dialog box
		message = "Radius: " + radius + newline +
				"Height: " + height + newline +
	    		"Surface Area: " + surfaceArea + newline +
	    		"Volume: " + volume;
		title = "Cylinder";
		 return messageBox.show(message, title);
	}

}

package org.cvtc.shapes;

public class Shpere extends Shape implements Render{
	private float radius = 0;
	
	private String message;
	private String title;

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public Shpere(float radius, Dialog messagebox) {
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
	public int render() {
		String newline = System.getProperty("line.separator");
		float surfaceArea = surfaceArea();
		float volume = volume();
		//make the dialog box
		message = "Radius: " + radius + newline +
	    		"Surface Area: " + surfaceArea + newline +
	    		"Volume: " + volume;
		title = "Sphere";
		return messageBox.show(message, title);
	}
}

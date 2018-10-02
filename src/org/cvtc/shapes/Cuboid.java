package org.cvtc.shapes;

public class Cuboid extends Shape implements Render{
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	private String message = "";
	private String title = "";
 
	public float getWidth() {
		return width;
	}
	private void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	private void setDepth(float depth) {
		this.depth = depth;
	}
	public Cuboid(float width, float height, float depth, Dialog messagebox) {
		super(messagebox);
		
		//width
		if (width > 0){
			this.setWidth(width);
		}
		else {
			message = "Parameter of " + width + " is invalid. Width will be set to 0.";
			title = "Error";
			messagebox.show(message, title);
			/* JOptionPane.showMessageDialog(null,
					"Parameter of " + width + " is invalid. Width will be set to 0.",
					"Error",
				    JOptionPane.PLAIN_MESSAGE); */
			
			this.setWidth(0);
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
		
		//depth
		if(depth>0) {
			this.setDepth(depth);
		} else {
			message = "Parameter of " + depth + " is invalid. Height will be set to 0.";
			title = "Error";
			
			messagebox.show(message, title);
			this.setDepth(0);
		}
	}
	
	@Override
	public float surfaceArea() {
		float result = width*height*2 + height*depth*2 + width*depth*2;
		return result;
	}
	
	@Override
	public float volume() {
		float result = (float)(width*depth*height);
		return result;
	}
	
	
	public int render() {
		String newline = System.getProperty("line.separator");
		float surfaceArea = surfaceArea();
		float volume = volume();
		//make the dialog box
		message = "Width: " + width + newline +
				"Depth: " + depth + newline +
				"Height: " + height + newline +
	    		"Surface Area: " + surfaceArea + newline +
	    		"Volume: " + volume;
		title = "Cuboid";
		return messageBox.show(message, title);
	}
}

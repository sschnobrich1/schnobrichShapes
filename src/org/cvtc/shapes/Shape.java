/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Rsaah
 *
 */
public abstract class Shape {
	
	//Surface area methods. Sphere, cuboid, and cylinder respectively.
	public static float surfaceArea(float radius) {
			float result = (float) (4*3.14*radius*radius);
			return result;
		}
	public static float surfaceArea(float width, float depth, float height) {
			float result = width*height*2 + height*depth*2 + width*depth*2;
			return result;
		}
	public static float surfaceArea(float radius, float height) {	
			float result = (float) (2*3.14*radius*height);
			return result;
		}

	//Volume methods. Sphere, cuboid and cylinder respectively
	public static float volume(float radius) {
		float result = (float)(4/3*3.14*radius*radius*radius);
		return result;
	}
	public static float volume(float width, float depth, float height) {
		float result = (float)(width*depth*height);
		return result;
	}
	public static float volume(float radius, float height) {
		float result = (float)(3.14*radius*radius*height);
		return result;
	}

	//render methods for sphere, cuboid and cylinder respectively.
	private static String newline = System.getProperty("line.separator");
	public void render(float radius) {
		float surfaceArea = surfaceArea(radius);
		float volume = volume(radius);
		//make the dialog box
		JOptionPane.showMessageDialog(null,
			    "Radius: " + radius + newline +
			    		"Surface Area: " + surfaceArea + newline +
			    		"Volume: " + volume,
			    "Sphere",
			    JOptionPane.PLAIN_MESSAGE);
	}
	public void render(float width, float depth, float height) {
		float surfaceArea = surfaceArea(width, depth, height);
		float volume = volume(width, depth, height);
		//make the dialog box
		JOptionPane.showMessageDialog(null,
				"Width: " + width + newline +
						"Depth: " + depth + newline +
						"Height: " + height + newline +
			    		"Surface Area: " + surfaceArea + newline +
			    		"Volume: " + volume,
			    "Cuboid",
			    JOptionPane.PLAIN_MESSAGE);
	}
	public void render(float radius, float height) {
		float surfaceArea = surfaceArea(radius, height);
		float volume = volume(radius, height);
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

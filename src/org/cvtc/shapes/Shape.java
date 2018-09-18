/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Rsaah
 *
 */
public abstract class Shape {
	
	public abstract float surfaceArea();

	//Volume method. 
	public abstract float volume();

	//render methods for sphere, cuboid and cylinder respectively.
	public abstract void render();

}

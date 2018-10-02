package org.cvtc.shapesTests;

import static org.junit.Assert.*;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.Shpere;
import org.junit.Test;

public class SphereTest {
	private Dialog messagebox = new MessageBoxSub();
	private ShapeFactory shapeFactory = new ShapeFactory(messagebox);
	
	Shpere testSphere = (Shpere) shapeFactory.make(ShapeType.Sphere);
	
	//The badSphere, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badSphere lines to test them.

	@Test
	public void testGetRadius() {
		assertEquals("sph rad", 3, testSphere.getRadius(), 0.001);
	}

	@Test
	public void testShpere() {
		assertNotNull(testSphere);
	}

	@Test
	public void testSurfaceAreaFloat() {
		//testSphere = 113.1 
		//badSphere = 0
		assertEquals("sph area", 113.1, testSphere.surfaceArea(), 0.01);
	}

	@Test
	public void testVolumeFloat() {
		//testSphere = 113.1
		//badSphere = 0
		assertEquals("sph vol", 84.82, testSphere.volume(), 0.01);
	}

}

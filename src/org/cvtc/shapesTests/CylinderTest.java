package org.cvtc.shapesTests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class CylinderTest {
	private Dialog messagebox = new MessageBoxSub();
	private ShapeFactory shapeFactory = new ShapeFactory(messagebox);
	Cylinder testCyl = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
	
	//The badCyl, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badCyl lines to test them.

	@Test
	public void testGetRadius() {
		assertEquals("cyl rad", 3, testCyl.getRadius(), 0.001);
	}

	@Test
	public void testGetHeight() {
		assertEquals("cyl height", 3, testCyl.getHeight(), 0.001);
	}

	@Test
	public void testCylinder() {
		assertNotNull(testCyl);
	}

	@Test
	public void testSurfaceAreaFloatFloat() {
		//testCyl = 113.1 
		//badCyl = 0
		assertEquals("cyl area", 113.1, testCyl.surfaceArea(), 0.01);
	}

	@Test
	public void testVolumeFloatFloat() {
		//testCyl = 84.82
		//badCyl = 0
		assertEquals(84.82, testCyl.volume(), 0.01);
	}

}

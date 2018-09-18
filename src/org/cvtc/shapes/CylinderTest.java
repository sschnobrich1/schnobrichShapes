package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {
	Cylinder testCyl = new Cylinder(3,3);
	
	//The badCyl, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badCyl lines to test them.
	//Cylinder badCyl = new Cylinder(-3, 0);

	@Test
	public void testGetRadius() {
		assertEquals(3, testCyl.getRadius(), 0.001);
		//assertEquals(0, badCyl.getRadius(), 0.001);
	}

	@Test
	public void testGetHeight() {
		assertEquals(3, testCyl.getHeight(), 0.001);
		//assertEquals(0, badCyl.getHeight(), 0.001);
	}

	@Test
	public void testCylinder() {
		assertNotNull(testCyl);
		//assertNotNull(badCyl);
	}

	@Test
	public void testSurfaceAreaFloatFloat() {
		//testCyl = 113.1 
		//badCyl = 0
		assertEquals(113.1, testCyl.surfaceArea(testCyl.getRadius(), testCyl.getHeight()), 0.01);
		//assertEquals(0, badCyl.surfaceArea(badCyl.getRadius(), badCyl.getHeight()), 0.0001);

	}

	@Test
	public void testVolumeFloatFloat() {
		//testCyl = 84.82
		//badCyl = 0
		assertEquals(84.82, testCyl.volume(testCyl.getRadius(), testCyl.getHeight()), 0.01);
		//assertEquals(0, badCyl.volume(badCyl.getRadius(), badCyl.getHeight()), 0.0001);

	}

}

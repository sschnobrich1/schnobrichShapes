package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {
	Shpere testSphere = new Shpere(3);
	
	//The badSphere, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badSphere lines to test them.
	Shpere badSphere = new Shpere(-3);

	@Test
	public void testGetRadius() {
		assertEquals(3, testSphere.getRadius(), 0.001);
		assertEquals(0, badSphere.getRadius(), 0.001);
	}

	@Test
	public void testShpere() {
		assertNotNull(testSphere);
		assertNotNull(badSphere);
	}

	@Test
	public void testSurfaceAreaFloat() {
		//testSphere = 113.1 
		//badSphere = 0
		assertEquals(113.1, testSphere.surfaceArea(testSphere.getRadius()), 0.01);
		assertEquals(0, badSphere.surfaceArea(badSphere.getRadius()), 0.0001);

	}

	@Test
	public void testVolumeFloat() {
		//testSphere = 113.1
		//badSphere = 0
		assertEquals(84.82, testSphere.volume(testSphere.getRadius()), 0.01);
		assertEquals(0, badSphere.volume(badSphere.getRadius()), 0.0001);

	}

}
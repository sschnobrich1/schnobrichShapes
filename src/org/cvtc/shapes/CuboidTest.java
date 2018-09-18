package org.cvtc.shapes;

import static org.junit.Assert.*;
import org.junit.*;

public class CuboidTest {
	Cuboid testCube = new Cuboid(3,3,3);
	
	//The badCube, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badCube lines to test them.
	//Cuboid badCube = new Cuboid(-3, 0, 5);
	
	@Test
	public void testGetWidth() {				
		assertEquals(3, testCube.getWidth(), 0.0001);
		//assertEquals(0, badCube.getWidth(), 0.0001);
	}

	@Test
	public void testGetHeight() {		
		assertEquals(3, testCube.getHeight(), 0.0001);
		//assertEquals(0, badCube.getHeight(), 0.0001);
	}

	@Test
	public void testGetDepth() {
		assertEquals(3, testCube.getHeight(), 0.0001);
		//assertEquals(5, badCube.getDepth(), 0.0001);
	}

	@Test
	public void testCuboid() {
		assertNotNull(testCube);
		//assertNotNull(badCube);
	}

	@Test
	public void testSurfaceAreaFloatFloatFloat() {
		//formula is 2(h*w) + 2(w*l) + 2(l*h)
		//testCube = 54
		//badCube = 0
		assertEquals(54, testCube.surfaceArea(testCube.getWidth(), testCube.getDepth(), testCube.getHeight()), 0.0001);
		//assertEquals(0, badCube.surfaceArea(badCube.getWidth(), badCube.getDepth(), badCube.getHeight()), 0.0001);
	}

	@Test
	public void testVolumeFloatFloatFloat() {
		//height*width*length
		//testCube = 27
		//badCube = 0
		assertEquals(27, testCube.volume(testCube.getWidth(), testCube.getWidth(), testCube.getHeight()), 0.0001);
		//assertEquals(0, badCube.volume(badCube.getWidth(), badCube.getWidth(), badCube.getHeight()), 0.0001);

	}

}

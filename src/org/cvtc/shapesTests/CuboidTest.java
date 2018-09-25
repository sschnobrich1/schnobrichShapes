package org.cvtc.shapesTests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.junit.*;

public class CuboidTest {
	private Dialog messagebox = new MessageBoxSub();
	Cuboid testCube = new Cuboid(3,3,3, messagebox);
	
	//The badCube, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badCube lines to test them.
	Cuboid badCube = new Cuboid(-3, 0, 5, messagebox);
	
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
		assertEquals(54, testCube.surfaceArea(), 0.0001);
		//assertEquals(0, badCube.surfaceArea(), 0.0001);
	}

	@Test
	public void testVolumeFloatFloatFloat() {
		//height*width*length
		//testCube = 27
		//badCube = 0
		assertEquals(27, testCube.volume(), 0.0001);
		//assertEquals(0, badCube.volume(), 0.0001);

	}

}

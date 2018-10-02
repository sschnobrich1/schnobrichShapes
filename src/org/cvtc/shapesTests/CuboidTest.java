package org.cvtc.shapesTests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class CuboidTest {
	private Dialog messagebox = new MessageBoxSub();
	private ShapeFactory shapeFactory = new ShapeFactory(messagebox);
	Cuboid testCube = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
	
	//The badCube, for testing bad inputs, spits out a lot of dialog boxes. 
	//I've commented it out so you don't have to deal with it. 
	//Feel free to uncomment any badCube lines to test them.
			/*new Cuboid(-3, 0, 5, messagebox);*/
	
	@Test
	public void testGetWidth() {				
		assertEquals("cube width", 3, testCube.getWidth(), 0.0001);
	}

	@Test
	public void testGetHeight() {		
		assertEquals("cube height", 3, testCube.getHeight(), 0.0001);
	}

	@Test
	public void testGetDepth() {
		assertEquals("cube depth", 3, testCube.getDepth(), 0.0001);
	}

	@Test
	public void testCuboid() {
		assertNotNull(testCube);
	}

	@Test
	public void testSurfaceAreaFloatFloatFloat() {
		//formula is 2(h*w) + 2(w*l) + 2(l*h)
		//testCube = 54
		//badCube = 0
		assertEquals("cube area", 54, testCube.surfaceArea(), 0.0001);
	}

	@Test
	public void testVolumeFloatFloatFloat() {
		//height*width*length
		//testCube = 27
		//badCube = 0
		assertEquals("cube volume", 27, testCube.volume(), 0.0001);

	}

}

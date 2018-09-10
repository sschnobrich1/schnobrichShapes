package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		Cylinder cylinder =  new Cylinder(3, 4);
		Shpere sphere = new Shpere(5);
		Cuboid cube = new Cuboid(4,4,4);
		
		cylinder.render(cylinder.getRadius(), cylinder.getHeight());
		sphere.render(sphere.getRadius());
		cube.render(cube.getWidth(), cube.getHeight(), cube.getDepth());

	}

}

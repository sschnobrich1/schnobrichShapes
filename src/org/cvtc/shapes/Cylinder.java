package org.cvtc.shapes;

public class Cylinder extends Shape {
	
	private float radius = 0;
	private float height = 0;
	
	public float getRadius() {
		return radius;
	}
	private void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	public Cylinder(float radius, float height) {
		super();
		if (radius>0) {
			this.setRadius(radius);
		}
		if (height>0) {
			this.setHeight(height);
		}
	}
	
}

package org.cvtc.shapes;

public class Shpere extends Shape {
	private float radius = 0;

	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public Shpere(float radius) {
		super();
		if(radius>0) {
			this.setRadius(radius);
		}
	}
	

}

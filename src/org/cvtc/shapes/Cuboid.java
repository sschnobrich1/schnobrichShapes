package org.cvtc.shapes;

public class Cuboid extends Shape {
	private float width = 0;
	private float height = 0;
	private float depth = 0;
 
	public float getWidth() {
		return width;
	}
	private void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	private void setDepth(float depth) {
		this.depth = depth;
	}
	public Cuboid(float width, float height, float depth) {
		super();
		if (width > 0){
			this.setWidth(width);
		}
		if (height > 0) {
			this.setHeight(height);
		}
		if(depth>0) {
			this.setDepth(depth);
		}
	}

}

package org.cvtc.shapes;

public abstract class Shape {
	protected Dialog messageBox;
	
	public abstract float surfaceArea();
	public abstract float volume();
	
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	};
	
}

package org.cvtc.shapes;



public class ShapeFactory {
	private Dialog dialog;
	
	
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	};
	
	public Shape make(ShapeType shape) {
		if(shape == ShapeType.Sphere){
	         return new Shpere(3, dialog);
	      }
		else if(shape == ShapeType.Cuboid){
	         return new Cuboid(3,3,3, dialog);
	      }
		else if(shape == ShapeType.Cylinder){
			return new Cylinder(3,3, dialog);
	      }
		return null;
	}
	
}

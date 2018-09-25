/**
 * 
 */
package org.cvtc.shapes;

import org.cvtc.shapes.Dialog;

/**
 * @author Rsaah
 *
 */
public abstract class Shape {	
	protected Dialog messagebox;
		
	public Dialog getMessagebox() {
		return messagebox;
	}

	public void setMessagebox(Dialog messagebox) {
		this.messagebox = messagebox;
	}

	
	public abstract float surfaceArea();

	public abstract float volume();
	
	public Shape(Dialog messagebox) {
		this.messagebox = messagebox;
	}
	

}

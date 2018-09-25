package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {
	
	public MessageBox(){}

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null,
				message,
				title,
			    JOptionPane.PLAIN_MESSAGE);
		return JOptionPane.OK_OPTION;
	}
	
}

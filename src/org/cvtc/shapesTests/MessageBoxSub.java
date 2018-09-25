package org.cvtc.shapesTests;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Dialog;

public class MessageBoxSub implements Dialog{

	@Override
	public int show(String message, String title) {
		return JOptionPane.OK_OPTION;
	}
}

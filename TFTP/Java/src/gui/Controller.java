package gui;

import data.*;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * GUI Controller for the program.
 * 
 * Carried over from previous project for CSARCH2
 * 
 * @author Escalona, Jose Miguel
 *
 */
public class Controller implements ActionListener {
	private GUI gui;
	
	public Controller(GUI g) {
		this.gui = g;
		this.gui.setListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		/**
		 * You can just check 
		 * 	if(e.getActionCommand() == {foo.action}){
		 *		foo();
		 * 	}
		 * 
		 * 	if(e.getActionCommand() == {bar.action}){
		 *		bar();
		 * 	}
		 */
	}
}

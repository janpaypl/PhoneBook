package pl.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Window {
	

	
	public Window() {
		JFrame frame = new JFrame("PhoneBook");
		JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(800, 600));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}

	
}
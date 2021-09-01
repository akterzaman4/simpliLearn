package com.arvin.myApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JButton button = new JButton("Click me");
        //Explicitly set the size to what you want
        button.setPreferredSize(new Dimension(100, 100));
         
        //Content pane default layout is BorderLayout which does NOT
        //Respect the preferred sizes. Set it to FlowLayout which does
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(button);
         
        //Finally display the frame
        frame.setVisible(true);
        frame.setBackground(Color.black);
	}

}

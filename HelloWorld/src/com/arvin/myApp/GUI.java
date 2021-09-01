package com.arvin.myApp;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class GUI implements ActionListener {
	
	int count = 0;
	JLabel label;
	
	public GUI() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setTitle("test");
		f.pack();
		
		f.setVisible(true);
		f.setSize(600,400);
	    f.setLocationRelativeTo(null);
	    f.getContentPane().setLayout(new FlowLayout());
   
		
		JButton b = new JButton("click me please");
		b.addActionListener(this);
		b.setPreferredSize(new Dimension(200, 200));
	    f.getContentPane().add(b);
	    label = new JLabel("Number of clicks: 0");
		
		JPanel p = new JPanel(); 
		
		p.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		p.setLayout(new GridLayout(0, 1));
		
		f.add(p, BorderLayout.CENTER);
		
		
		
		p.add(b);
		
		p.add(label);
		
		p.setBackground(Color.green);
		
		
		
        
	}
	

	public static void main(String[] args) {
      new GUI();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of clicks: " + count);
	}
      
}

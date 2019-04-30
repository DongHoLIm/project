package com.kh.miniProject.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectPanel extends JPanel{
	private JPanel select = new JPanel();
	private JFrame start;
	public SelectPanel(JFrame start) {
		this.start = start;
		this.select =this;
		this.setBounds(0, 0, 960, 720);
		this.setBackground(Color.black);
		this.setLayout(null);


		JButton spb1 = new JButton("select 1");
		spb1.setSize(180,20);
		spb1.setLocation(20, 20);

		JButton spb2 = new JButton("select 2");
		spb2.setSize(180,20);
		spb2.setLocation(200, 20);

		this.add(spb1);
		this.add(spb2);
	}

}

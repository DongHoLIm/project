package com.kh.miniProject.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start extends JFrame{
	private JFrame start;
	private JPanel startMain;

	public Start() {
		this.start = this;		
		this.setSize(960,720);
		this.setLayout(null);
		
		startMain = new JPanel();
		startMain.setSize(960,720);
		startMain.setLayout(null);
		
		JButton start = new JButton();
		start.setLocation(430,435);
		start.setSize(100,40);
        JButton exit = new JButton();
        exit.setLocation(428, 470);
        exit.setSize(100,40);
        
        start.addActionListener(new Change());
        
        startMain.add(start);
        startMain.add(exit);
        
        this.add(startMain);
		
		//new Main(this);
        
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.StartChangePanle(start, startMain, new Main(start));			
		}

		
	}
	

}

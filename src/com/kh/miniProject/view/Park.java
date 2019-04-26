package com.kh.miniProject.view;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;


public class Park extends JPanel {
	private JFrame start;
	private JPanel park;

	public Park(JFrame start) {
		this.start = start;
		park = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel parkBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//		parkBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.lightGray);
		System.out.println("패널 생성");
		
		parkInit();
		

		

	}
	public void parkInit() {
		System.out.println("park 내부 인터");
		park.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());
		
		park.add(exit);
		
		
	}
	class ChangeMain implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, park, new Main(start));
		}
		
		
		
	}
}
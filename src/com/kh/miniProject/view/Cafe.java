package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;


public class Cafe extends JPanel {
	private JFrame start;

	private JPanel cafe;

	public Cafe(JFrame start) {
		this.start = start;
		cafe = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel cafeBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//		cafeBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.ORANGE);
		System.out.println("패널 생성");
		
		cafeInit();
		
		


	}

	public void cafeInit() {
		Image icon = new ImageIcon("images/back.png").getImage().getScaledInstance(25, 25, 0);
		System.out.println("cafe 내부 인터");
		cafe.setVisible(true);
		JButton exit = new JButton(new ImageIcon(icon));
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.addActionListener(new ChangeMain());

		cafe.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, cafe, new Main(start));
		}

	}
	

}
package com.kh.miniProject.view;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;

public class Movie extends JPanel {
	private JFrame start;
	
	private JPanel movie;
	private JLabel icon1;
	public Movie(JFrame start) {
		this.start = start;
		movie = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		icon1 = new JLabel(new ImageIcon("images/CGV.jpg"));
	    icon1.setBounds(0, 0, 960, 720);
	
		
		movieInit();
		
		
		
//		mf.addKeyListener(new KeyAdapter() {
//
//			@Override
//			public void keyTyped(KeyEvent e) {
//				int num = 0;
//
//				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//					num = 1;
//				}
//
//			}
//
//		});
		

	}
	public void movieInit() {
		
		movie.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(890, 20);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());
//		exit.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				ChangePanel cp = new ChangePanel(mf , movie);
//				MiniMap mm = new MiniMap(mf);
//				
//				
//				cp.replacePanel(mm);
//			}
//		});
		
		
		movie.add(exit);
		
		
		this.add(icon1);
	}
	class ChangeMain implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, movie, new Main(start));
		}
		
		
		
	}
}

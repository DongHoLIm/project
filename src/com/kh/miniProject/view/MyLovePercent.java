package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyLovePercent extends JPanel{
	private JPanel main;
	private JPanel love;

	public MyLovePercent(JPanel main) {
		this.main = main;
		this.love = this;

		this.setLocation(100,100);
		this.setSize(400,500);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		JLabel label0 = new JLabel("나의 애정도 입니다!!");
		label0.setSize(300,50);
		label0.setLocation(10,10);

		JButton exit = new JButton("x"); 
		exit.setLocation(350,20);
		exit.setSize(30,30);

		Image girl1 = new ImageIcon("images/girl1.png").getImage().getScaledInstance(50, 50, 0);
		JLabel label1 = new JLabel(new ImageIcon(girl1));
		label1.setLocation(10,60);
		label1.setSize(50,50);

		Image girl2 = new ImageIcon("images/girl2.png").getImage().getScaledInstance(50, 50, 0);
		JLabel label2 = new JLabel(new ImageIcon(girl2));
		label2.setLocation(10,120);
		label2.setSize(50, 50);

		Image girl3 = new ImageIcon("images/girl3.png").getImage().getScaledInstance(50, 50, 0);
		JLabel label3 = new JLabel(new ImageIcon(girl3));
		label3.setLocation(10,180);
		label3.setSize(50, 50);

		Image girl4 = new ImageIcon("images/girl4.png").getImage().getScaledInstance(50, 50, 0);
		JLabel label4 = new JLabel(new ImageIcon(girl4));
		label4.setLocation(10,240);
		label4.setSize(50, 50);

		Image girl5 = new ImageIcon("images/girl5.png").getImage().getScaledInstance(50, 50, 0);
		JLabel label5 = new JLabel(new ImageIcon(girl5));
		label5.setLocation(10,300);
		label5.setSize(50, 50);
		
		exit.addActionListener(new Delete());

		this.add(label0);
		this.add(exit);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		
		main.add(this);
		main.repaint();
		
		

	}
	
	class Delete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DeletePanel.DeletePanel(main, love);
			
		}
		
	}

}

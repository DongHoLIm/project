package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyLovePercent extends JPanel{
	private JFrame start;
	private JPanel love;
	private JPanel loveIn;

	public MyLovePercent(JFrame start) {
		this.start = start;
		this.love = this;
		
		loveIn = new JPanel();
		loveIn.setLocation(100,50);
		loveIn.setSize(400,500);
		loveIn.setLayout(null);
		loveIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);

		JLabel label0 = new JLabel("���� ������ �Դϴ�!!");
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
		
		JButton info = new JButton("Info");
		info.setLocation(50,50);
		info.setSize(30,30);
		JButton shop = new JButton("shop");
		shop.setLocation(50,90);
		shop.setSize(30,30);
		JButton aff = new JButton("aff");
		aff.setLocation(50,130);
		aff.setSize(30,30);
		JButton coin = new JButton("coin");
		coin.setLocation(600,50);
		coin.setSize(30,30);
		JButton map = new JButton("map");
		map.setLocation(850,50);
		map.setSize(30,30);
		
		exit.addActionListener(new Change());
		
		loveIn.add(label0);
		loveIn.add(exit);
		loveIn.add(label1);
		loveIn.add(label2);
		loveIn.add(label3);
		loveIn.add(label4);
		loveIn.add(label5);

		this.add(loveIn);
		this.add(info);
		this.add(shop);
		this.add(aff);
		this.add(coin);
		this.add(map);
		
		

	}
	
class Change implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, love, new Main(start));
		}
		
	}

}

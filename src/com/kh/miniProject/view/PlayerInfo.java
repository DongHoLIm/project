package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PlayerInfo extends JPanel{
	private JFrame start;
	private JPanel pinfo;
	private JPanel playerInfoIn;

	public PlayerInfo(JFrame start) {
		this.start = start;
		this.pinfo = this;
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);
		
		playerInfoIn = new JPanel();
		playerInfoIn.setLayout(null);
		playerInfoIn.setLocation(100, 50);
		playerInfoIn.setSize(400,500);
		playerInfoIn.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		
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
		
		Image icon = new ImageIcon("images/people.png").getImage().getScaledInstance(200, 300, 0);;
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(icon));
		label.setLocation(100,200);
		label.setSize(200,300);
		JButton exit = new JButton("x");		
		exit.setLocation(350,20);
		exit.setSize(25,25);
		JButton cloth = new JButton("옷 장");		
		cloth.setLocation(310, 420);
		cloth.setSize(70,30);
		JLabel level = new JLabel("Level : ");
		level.setLocation(140,180);
		level.setSize(100,30);
		JLabel charm = new JLabel("매력도 : ");
		charm.setLocation(100,130);
		charm.setSize(50,20);
		JLabel exper = new JLabel("경험치 : ");
		exper.setLocation(100,150);
		exper.setSize(50,20);
		
		playerInfoIn.add(label);
		playerInfoIn.add(exit);
		playerInfoIn.add(cloth);
		playerInfoIn.add(level);
		playerInfoIn.add(charm);
		playerInfoIn.add(exper); 
		
//		cloth.addActionListener(new Change());
//		exit.addActionListener(new Delete());
		
		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
		this.add(playerInfoIn);
		
		
//		main.add(this);
//		main.repaint();
	}
	
//	class Change implements ActionListener{
//
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			ChangePanel.ChangePanel(main, pinfo, new ClothRoom(main));			
//		}
//
//		
//	}
//	
//	class Delete implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			DeletePanel.DeletePanel(main, pinfo);
//			
//		}
//		
//	}

}

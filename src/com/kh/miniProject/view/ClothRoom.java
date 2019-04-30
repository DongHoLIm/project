package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ClothRoom extends JPanel{
		private JFrame start;
		private JPanel colthroom;
		private JPanel colthroomIn;
		
		public ClothRoom(JFrame start) {
			
			this.start = start;
			this.colthroom = this;
			
			this.setLocation(0,0);
			this.setSize(960,720);
			this.setLayout(null);	
			
			JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    
			colthroomIn = new JPanel();
			colthroomIn.setLayout(null);
			colthroomIn.setLocation(100, 50);
			colthroomIn.setSize(400,500);
			colthroomIn.setBorder(BorderFactory.createLineBorder(Color.black,1));
			
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
			
			JButton exit=new JButton("x"); 
		    exit.setLocation(350,20);
		    exit.setSize(30,30);

		    
		    exit.addActionListener(new Change());
		    
		    JButton cloth = new JButton("ø ");
		    cloth.setBounds(10, 70, 60, 30);
		    JButton shoes = new JButton("Ω≈πﬂ");
		    shoes.setBounds(70, 70, 60, 30);
		    JButton acc = new JButton("æ«ººº≠∏Æ");
		    acc.setBounds(130, 70, 60, 30);
		    JButton item = new JButton("æ∆¿Ã≈€");
		    item.setBounds(190, 70, 60, 30);
		    
		    cloth.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.add(ClothPanel.cloth);
					colthroomIn.repaint();
				}
			});
		    
		    shoes.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.add(ShoesPanel.shoes);
					colthroomIn.repaint();
					
				}
			});
		    
		    acc.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.add(AccPanel.acc);
					colthroomIn.repaint();
					
				}
			});
		    
		    item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.add(ItemPanel.item);
					colthroomIn.repaint();
					
				}
			});
		    
		    
		    this.add(info);
		    this.add(shop);
		    this.add(aff);
		    this.add(coin);
		    this.add(map);
		    colthroomIn.add(exit);
		    colthroomIn.add(shoes);
		    colthroomIn.add(acc);
		    colthroomIn.add(item);
		    colthroomIn.add(cloth);
			
			this.add(colthroomIn);
			this.add(icon1);
			
		}
		
		class Change implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, colthroom, new Main(start));		
				
			}
			
		}
}

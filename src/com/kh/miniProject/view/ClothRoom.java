package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ClothRoom extends JPanel{
	private JFrame start;
	private JPanel colthroom;
	private JPanel colthroomIn;
	private Cloth cloth = null;
	private Shoes shoes = null;
	private Acc acc = null;
	private Item item = null;
	
	public ClothRoom(JFrame start) {
		this.start = start;
		this.colthroom = this;
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);	
		
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
	    
	    this.add(info);
	    this.add(shop);
	    this.add(aff);
	    this.add(coin);
	    this.add(map);
	    colthroomIn.add(exit);
		
		JTabbedPane clothTab = new JTabbedPane();
		clothTab.addTab("ø ", new Cloth());
		clothTab.addTab("Ω≈πﬂ", new Shoes());
		clothTab.addTab("æ«ººº≠∏Æ", new Acc());
		clothTab.addTab("æ∆¿Ã≈€", new Item());
		
		clothTab.setLocation(0,50);
		clothTab.setSize(400,500);
		colthroomIn.add(clothTab);
		
		this.add(colthroomIn);
	}
	
	class Cloth extends JPanel{
		public Cloth() {
			this.setBackground(Color.BLACK);
		}
	}
	
	class Shoes extends JPanel{
		public Shoes() {
			this.setBackground(Color.BLUE);
		}
	}
	
	class Acc extends JPanel{
		public Acc() {
			this.setBackground(Color.GRAY);
		}
	}
	
	class Item extends JPanel{
		public Item() {
			this.setBackground(Color.GREEN);
		}
	}
	
	class Change implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, colthroom, new Main(start));		
			
		}
		
	}

}

package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ClothRoom extends JPanel{
	private JPanel main;
	private JPanel colthroom;
	private Cloth cloth = null;
	private Shoes shoes = null;
	private Acc acc = null;
	private Item item = null;
	
	public ClothRoom(JPanel main) {
		
		this.main = main;
		this.colthroom = this;
		this.setLocation(100,60);
		this.setSize(400,500);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		JButton exit=new JButton("x"); 
	    exit.setLocation(350,20);
	    exit.setSize(30,30);
	    
	    exit.addActionListener(new Delete());
	    
	    this.add(exit);
		
		JTabbedPane clothTab = new JTabbedPane();
		clothTab.addTab("ø ", new Cloth());
		clothTab.addTab("Ω≈πﬂ", new Shoes());
		clothTab.addTab("æ«ººº≠∏Æ", new Acc());
		clothTab.addTab("æ∆¿Ã≈€", new Item());
		
		clothTab.setLocation(0,50);
		clothTab.setSize(400,500);
		this.add(clothTab);
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
	
	class Delete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DeletePanel.DeletePanel(main, colthroom);
			
		}
		
	}

}

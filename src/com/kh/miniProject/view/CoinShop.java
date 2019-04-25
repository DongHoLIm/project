package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CoinShop extends JPanel{
	private JPanel main;
	private JPanel coin;
	
	public CoinShop(JPanel main) {
		this.main = main;
		this.coin = this;
		
		this.setLocation(300,80);
		this.setSize(500,400);
		this.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

	    JLabel coinShop= new JLabel("\ncoinShop");
	    coinShop.setLocation(210,50);
	    coinShop.setSize(120,50);

	    JButton exit=new JButton("x"); 
	    exit.setLocation(450,25);
	    exit.setSize(30,30);

	    JButton btn1=new JButton("$500"); 
	    btn1.setLocation(50,280);
	    btn1.setSize(75,30);

	    JButton btn2=new JButton("$1000"); 
	    btn2.setLocation(150,280);
	    btn2.setSize(75,30);

	    JButton btn3=new JButton("$1500"); 
	    btn3.setLocation(250,280);
	    btn3.setSize(75,30);

	    JButton btn4=new JButton("$2000"); 
	    btn4.setLocation(350,280);
	    btn4.setSize(75,30);
	    
	    exit.addActionListener(new Delete());
//	    btn1.addActionListener(new Change());
//	    btn2.addActionListener(new Change());
//	    btn3.addActionListener(new Change());
//	    btn4.addActionListener(new Change());
	    
	    
	    this.add(coinShop);
	    this.add(exit);
	    this.add(btn1);
	    this.add(btn2);
	    this.add(btn3);
	    this.add(btn4);
	    
	    main.add(this);
	    main.repaint();
	}
	
//	class Change implements ActionListener{
//
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			ChangePanel.ChangePanel(main, coin, new PlusCoin(main));			
//		}
//
//		
//	}
	
	class Delete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DeletePanel.DeletePanel(main, coin);
			
		}
		
	}

}

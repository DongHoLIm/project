package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CoinShop extends JPanel{
	private JFrame start;
	private JPanel coin;
	private JPanel coinIn;
	Card d = new Card(start);
	
	public CoinShop(JFrame start) {
		this.start = start;
		this.coin = this;
		
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);
		
		coinIn=new JPanel();
		coinIn.setLayout(null);
		coinIn.setLocation(400, 80);
		coinIn.setSize(500,400);
		coinIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));
		
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
		
	    JLabel coinShop= new JLabel("\ncoinShop");
	    coinShop.setLocation(210,50);
	    coinShop.setSize(120,50);

	    JButton exit=new JButton("x"); 
	    exit.setLocation(450,25);
	    exit.setSize(30,30);
	    
	    
	    JButton btn1=new JButton("500"); 
	    btn1.setLocation(50,280);
	    btn1.setSize(75,30);
	    btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point1 =500;
				Card.plusCoin = point1;
								
			}
		});

	    JButton btn2=new JButton("1000"); 
	    btn2.setLocation(150,280);
	    btn2.setSize(75,30);
	    btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point2 =1000;
				Card.plusCoin =point2;
				
			}
		});

	    JButton btn3=new JButton("1500"); 
	    btn3.setLocation(250,280);
	    btn3.setSize(75,30);
	    btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point3 =1500;
				Card.plusCoin = point3;
				
			}
		});

	    JButton btn4=new JButton("2000"); 
	    btn4.setLocation(350,280);
	    btn4.setSize(75,30);
	    btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point4 = 2000;
				Card.plusCoin =point4;
				
			}
		});
	    
	    exit.addActionListener(new Change());
	    btn1.addActionListener(new Change2());
	    btn2.addActionListener(new Change2());
	    btn3.addActionListener(new Change2());
	    btn4.addActionListener(new Change2());
	    
	    
	    coinIn.add(coinShop);
	    coinIn.add(exit);
	    coinIn.add(btn1);
	    coinIn.add(btn2);
	    coinIn.add(btn3);
	    coinIn.add(btn4);
	    
	    this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
	    this.add(coinIn);
	    
//	    main.add(this);
//	    main.repaint();
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
	
//	class Delete implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			DeletePanel.DeletePanel(main, coin);
//			
////		}
//	
//			
//		}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, coin, new Main(start));			
		}

		
	}
	
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ChangePanel.ChangePanel(start, coin, new PlusCoin(start));
			
		}
		
	}

}

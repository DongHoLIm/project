package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.view.PlusCoin.Change;

public class PlusCoin extends JPanel{
	private JFrame start;
	private JPanel plus;
	private JPanel plusIn;

	public PlusCoin(JFrame start) {
		this.start = start;
		this.plus = this;
		
		this.setLocation(0,0);
		this.setSize(960, 720);
		this.setLayout(null);
		
		plusIn=new JPanel();
		plusIn.setLayout(null);
		plusIn.setLocation(400,180);
		plusIn.setSize(300,200);
		plusIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));
		
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

		JLabel pluscoin= new JLabel("이 상품을 구매 하시겠슴니까???");
		pluscoin.setLocation(50,45);
		pluscoin.setSize(300,50);

		JButton exit=new JButton("x"); 
		exit.setLocation(250,10);
		exit.setSize(30,30);

		JButton btn5=new JButton("Yes"); 
		btn5.setLocation(75,125);
		btn5.setSize(50,30);

		JButton btn6=new JButton("no"); 
		btn6.setLocation(200,125);
		btn6.setSize(50,30);

		exit.addActionListener(new Change());
		btn5.addActionListener(new Change2());

		plusIn.add(pluscoin);
		plusIn.add(exit);
		plusIn.add(btn5);
		plusIn.add(btn6);
		
		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
	    this.add(plusIn);
	}
	
//	class Delete implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			DeletePanel.DeletePanel(main, plus);
//			
//		}
//		
//	}
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, plus, new Main(start));			
		}

		
	}
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ChangePanel.ChangePanel(start, plus, new Card(start));
			
		}
		
	}

}

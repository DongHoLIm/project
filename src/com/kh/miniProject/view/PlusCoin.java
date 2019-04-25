package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlusCoin extends JPanel{
	private JPanel plus;
	private JPanel main;

	public PlusCoin(JPanel main) {
		this.main = main;
		this.plus = this;
		this.setLocation(400,180);
		this.setSize(300,200);
		this.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		JLabel coinShop= new JLabel("이 상품을 구매 하시겠슴니까???");
		coinShop.setLocation(50,45);
		coinShop.setSize(300,50);

		JButton exit=new JButton("x"); 
		exit.setLocation(250,10);
		exit.setSize(30,30);

		JButton btn5=new JButton("Yes"); 
		btn5.setLocation(75,125);
		btn5.setSize(50,30);

		JButton btn6=new JButton("Yes"); 
		btn6.setLocation(200,125);
		btn6.setSize(50,30);

		exit.addActionListener(new Delete());

		this.add(coinShop);
		this.add(exit);
		this.add(btn5);
		this.add(btn6);
	}
	
	class Delete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			DeletePanel.DeletePanel(main, plus);
			
		}
		
	}

}

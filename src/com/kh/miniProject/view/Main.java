package com.kh.miniProject.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.view.Main.Change2;

public class Main extends JPanel{
	private JFrame start;
	private JPanel main;

	public Main(JFrame start) {
		this.start = start;
		this.main = this;

		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);

		Image icon = new ImageIcon("images/people.png").getImage().getScaledInstance(200, 300, 0);;

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(icon));
		label.setLocation(250,210);
		label.setSize(200,300);
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
		JTextArea textArea = new JTextArea(10,30);
		textArea.setLocation(200,300);
		textArea.setSize(300,100);
		textArea.setText("\n\n 아 연애하고싶다~");
		textArea.setEditable(false);
		
		//상단 날짜 추가
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH )+1;
		int date = c.get(Calendar.DATE);
		String days = year + "년" + month + "월" + date + "일";
		JLabel day = new JLabel(days);
		day.setBounds(400, 20, 400, 10);
		this.add(day);
		
		
		info.addActionListener(new Change());

		//aff.addActionListener(new PlusLove());
		coin.addActionListener(new Change2());

		aff.addActionListener(new Change1());
		//coin.addActionListener(new PlusCoin());

		
		this.add(map);
		this.add(textArea);
		this.add(label);
		this.add(info);
		this.add(shop);
		this.add(aff);
		this.add(coin);
		
		//start.add(this);
		
//		Main main = this;
		
	}
//	class PlusInfo implements ActionListener{
//		
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			new PlayerInfo(main);
//			
//		}
//		
//	}
//	
//	class PlusLove implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			new MyLovePercent(main);
//			
//		}
//		
//	}
//	
//	class PlusCoin implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			new CoinShop(main);
//			
//		}
//		
//	}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new PlayerInfo(start));			
		}

		
	}

	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e1) {
			ChangePanel.ChangePanel(start, main, new CoinShop(start));
			
		}

	}
	

	
	
	class Change1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new MyLovePercent(start));
		}

	}


}

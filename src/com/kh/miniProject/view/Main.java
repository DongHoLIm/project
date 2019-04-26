package com.kh.miniProject.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class Main extends JPanel{
	private JFrame start;
	private JPanel main;
	static int day = 0;
	static int dayBreak = 0;
	static int totalDay = 1;

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
		
		map.addActionListener(new Change3());
		info.addActionListener(new Change());
		//aff.addActionListener(new PlusLove());
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
	class Change3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(day == 3 && totalDay != 11) {
				totalDay +=1;
				day = 0;
				dayBreak = 0;
				for(int clear = 0 ; clear < MiniMap.temp.length ; clear++) {
					MiniMap.temp[clear] = 0;
//					MiniMap.temp2[clear] = 0;
//					MiniMap.temp3[clear] = 0;
					
				}
				
			}else if(totalDay == 11) {
				System.out.println("10일째 지남 게임끝 엔딩");
			}
			if(dayBreak == 0 && totalDay != 11 ) {
				dayBreak = 1;
				ChangePanel.ChangePanel(start, main, new MiniMap(start));
			}else if(dayBreak == 3 && day == 1 && totalDay != 11) {
				dayBreak += 1;
				ChangePanel.ChangePanel(start, main, new MiniMap(start));
				
			}else if(dayBreak == 6 && day == 2 && totalDay != 11) {
				dayBreak += 1;
				ChangePanel.ChangePanel(start, main, new MiniMap(start));
			}else if(totalDay != 11) {
				ChangePanel.ChangePanel(start, main, new MiniMap(start));
			}
			
		
		
		}
	}

}

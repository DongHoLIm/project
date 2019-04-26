
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

public class Main extends JPanel{
	private JFrame start;
	private JPanel main;
	static int day = 0;
    static int dayBreak =0;
    static int totalDay =1;
    static int day2 = 0;
  //  static int totalDay2 = 1;

	public Main(JFrame start) {
		String str = "아침";
		 if(day2 == 0) {
			str = "아침";
		}else if(day2 == 1) {
			str = "점심";
		}else if(day2 == 2) {
			str = "저녁";
		}else if(day2 ==3) {
			//totalDay2 +=1;
			totalDay +=1;
			day2 = 0;
		}
	
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
		shop.addActionListener(new Change5()); 
		JButton aff = new JButton("aff");
		aff.setLocation(50,130);
		aff.setSize(30,30);
		JButton coin = new JButton("coin");
		coin.setLocation(600,50);
		coin.setSize(30,30);
		JButton map = new JButton("map");
		map.setLocation(850,50);
		map.setSize(30,30);
		map.addActionListener(new Change6()); 
		JTextArea textArea = new JTextArea(10,30);
		textArea.setLocation(200,300);
		textArea.setSize(300,100);
		textArea.setText("\n\n 아 연애 하고싶다~");
		textArea.setEditable(false);
		JLabel textlabel = new JLabel();
		textlabel.setText(str);
		textlabel.setLocation(350,20);
		textlabel.setSize(50,20);
		JLabel textlabel2 = new JLabel();
		textlabel2.setLocation(310,20);
		textlabel2.setSize(50,20);
		textlabel2.setText(totalDay + "일차");
		
		
		//�긽�떒 �궇吏� 異붽�
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH )+1;
		int date = c.get(Calendar.DATE)+totalDay-1;
		String days = year + "년" + month + "월" + date + "일";
		JLabel day = new JLabel(days);
		day.setBounds(400, 20, 400, 20);
		this.add(day);
		
		
		info.addActionListener(new Change());

		//aff.addActionListener(new PlusLove());
		coin.addActionListener(new Change2());

		aff.addActionListener(new Change1());
		//coin.addActionListener(new PlusCoin());

		
		this.add(map);
		this.add(textArea);
		this.add(textlabel);
		this.add(textlabel2);
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
	class Change5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new StoreMain(start));
			
		}
		
	}
	class Change6 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(day == 3 && totalDay != 11) {
					
					day = 0;
					dayBreak = 0;
					for(int clear = 0 ; clear < MiniMap.temp.length ; clear++) {
						MiniMap.temp[clear] = 0;
//						MiniMap.temp2[clear] = 0;
//						MiniMap.temp3[clear] = 0;
						
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



package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PlayerInfo extends JPanel{
	private JFrame start;
	private JPanel pinfo;
	private JPanel playerInfoIn;
	public static int lev = 5;

	private static int levBreak = 4;
	public static int getLevBreak() {
		return levBreak;
	}

	public static void setLevBreak(int levBreak) {
		PlayerInfo.levBreak = levBreak;
	}


	private JLabel levelIn;

	public PlayerInfo(JFrame start) {
		this.start = start;
		this.pinfo = this;    
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);
		
		playerInfoIn = new JPanel();
		playerInfoIn.setLayout(null);
		playerInfoIn.setLocation(100, 50);
		playerInfoIn.setSize(400,500);
		playerInfoIn.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		
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
		
		Image icon = new ImageIcon("images/people.png").getImage().getScaledInstance(200, 300, 0);;
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(icon));
		label.setLocation(100,200);
		label.setSize(200,300);
		JButton exit = new JButton("x");		
		exit.setLocation(350,20);
		exit.setSize(25,25);
		JButton cloth = new JButton("쩔횎 �책");		
		cloth.setLocation(310, 420);
		cloth.setSize(70,30);
		JLabel level = new JLabel("Level : ");
		level.setLocation(180,180);
		level.setSize(100,30);
		JLabel charm = new JLabel("쨍횇쨌횂쨉쨉 : ");
		charm.setLocation(100,130);
		charm.setSize(50,20);
		JLabel exper = new JLabel("째챈횉챔횆징 : ");
		exper.setLocation(100,150);
		exper.setSize(50,20);
		String strlev = String.valueOf(lev).toString();
		levelIn = new JLabel(strlev);
		levelIn.setBounds(210,145,100,100);
		
		exit.addActionListener(new Change());
		cloth.addActionListener(new Change2());
		
		playerInfoIn.add(label);
		playerInfoIn.add(exit);
		playerInfoIn.add(cloth);
		playerInfoIn.add(level);
		playerInfoIn.add(charm);
		playerInfoIn.add(exper); 
		playerInfoIn.add(levelIn);
		
		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
		this.add(playerInfoIn);
		
		
//		main.add(this);
//		main.repaint();
	}
	
	public JFrame getStart() {
		return start;
	}

	public void setStart(JFrame start) {
		this.start = start;
	}

	public JPanel getPinfo() {
		return pinfo;
	}

	public void setPinfo(JPanel pinfo) {
		this.pinfo = pinfo;
	}

	public JPanel getPlayerInfoIn() {
		return playerInfoIn;
	}

	public void setPlayerInfoIn(JPanel playerInfoIn) {
		this.playerInfoIn = playerInfoIn;
	}

	public static int getLev() {
		return lev;
	}

	public static void setLev(int lev) {
		PlayerInfo.lev = lev;
	}

	public JLabel getLevelIn() {
		return levelIn;
	}

	public void setLevelIn(JLabel levelIn) {
		this.levelIn = levelIn;
	}

	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, pinfo, new Main(start));			
		}

		
	}
	
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, pinfo, new ClothRoom(start));
			
		}
		
	}

}


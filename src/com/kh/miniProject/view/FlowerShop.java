package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;

public class FlowerShop extends JPanel {
	private JFrame start;

	private JPanel flowerShop;

	public FlowerShop(JFrame start) {
		this.start = start;
		flowerShop = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel FlowerShopBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//			FlowerShopBack.setBounds(0, 0, 960, 720);
		if(Main.day == 0) {JLabel icon1 = new JLabel(new ImageIcon("images/FlowerShop.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.day == 1) {
			JLabel icon1 = new JLabel(new ImageIcon("images/flower2.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.day == 2) {
			JLabel icon1 = new JLabel(new ImageIcon("images/flower3.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		System.out.println("�г� ����");

		FlowerShopInit();

	}

	public void FlowerShopInit() {
		System.out.println("FlowerShop ���� ����");
		flowerShop.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		flowerShop.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, flowerShop, new Main(start));
		}

	}
}


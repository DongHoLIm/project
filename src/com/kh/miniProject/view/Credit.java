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

public class Credit  extends JPanel {
	private JFrame start;

	private JPanel credit;

	public Credit(JFrame start) {
		this.start = start;
		credit = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel EndingBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//			EndingBack.setBounds(0, 0, 960, 720);
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		System.out.println("ũ���� �̵�");

		CreditInit();

	}

	public void CreditInit() {
		System.out.println("Ending ���� ����");
		credit.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeCredit());
		credit.add(exit);

	}
	class ChangeCredit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {


			ChangePanel.ChangeStart(start, credit, new Start());
		}

	}
}
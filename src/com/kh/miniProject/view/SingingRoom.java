package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.view.Movie.ChangeMain;

public class SingingRoom extends JPanel {
	private JFrame start;
	private JPanel singingRoom;

	public SingingRoom(JFrame start) {
		this.start = start;
		singingRoom = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel singingRoomBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//			singingRoomBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.magenta);
		System.out.println("패널 생성");

		SingingRoomInit();

	}

	public void SingingRoomInit() {
		System.out.println("singingRoom 내부 인터");
		singingRoom.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		singingRoom.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day++;
			Main.dayBreak++;
			ChangePanel.ChangePanel(start, singingRoom, new Main(start));
		}

	}
}

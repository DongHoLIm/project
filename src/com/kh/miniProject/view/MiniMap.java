package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.RandomPlace;

public class MiniMap extends JPanel {
	private JFrame start;
	private JPanel MiniMap;
	private JPanel main;
	public Map hmap;
	GirlImages gi = new GirlImages();
	public static int te[] = new int[5];
	public static int temp[] = new int[5];
	public static int temp2[] = new int[5];
	public static int temp3[] = new int[5];
	public static int[] girlImages = new int[5];
	RandomPlace rp = new RandomPlace();
	FileController fc = new FileController();
	// ImageIcon background;
	private JPanel place = new JPanel();

	public MiniMap(JFrame start) {
		// RandomPlaceManager rpm = new RandomPlaceManager(null);
		this.start = start;
		hmap = new HashMap();
		//main = this;
		MiniMap = this;
		this.setBounds(0, 0, 960, 720);
		//this.setBackground(Color.gray);
		this.setSize(960, 720);

		JLabel icon1 = new JLabel(new ImageIcon("images/minimab.png"));
	    icon1.setBounds(0, 0, 960, 720);

		// ��� Panel ������ �������������� ����
		// MiniMap = new JPanel() {
		// public void paintComponent(Graphics g) {
		// g.drawImage(icon.getImage(), 0, 0,960,720, null);
		// setOpaque(false);
		// super.paintComponent(g);
		// }
		// };

		this.setLayout(null);

		hmap.putAll(CreatPlace());
		hmap.putAll(CreatPlace2());

		JButton place11 = new JButton();
		place11.setLocation(850, 50);
		place11.setSize(30, 30);
		place11.setText("x");

		place11.addActionListener(new ChangeMain());

		this.add(place11);
		this.add(icon1);

	}

	public MiniMap() {
	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Main(start));
		}

	}

	class ChangeMovie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Movie(start));
			
		}

	}

	class ChangePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Park(start));
		}

	}

	class ChangeCafe implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Cafe(start));
		}

	}

	class ChangeBeach implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Beach(start));
		}

	}

	class ChangeRestaurant implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Restraurant(start));
		}

	}

	class ChangeHotPlace implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new HotPlace(start));
		}

	}

	class ChangeSiningRoom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new SingingRoom(start));
		}

	}

	class ChangePub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Pub(start));
		}

	}

	class ChangeFlowerShop implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new FlowerShop(start));
		}

	}

	class ChangeThemePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new ThemePark(start));
		}

	}

	public Map Movie() {
		JLabel placeName1 = new JLabel("��ȭ��");
		placeName1.setLocation(455, 260);
		placeName1.setSize(150, 50);
		JButton place1 = new JButton(new ImageIcon());

		place1.setLocation(450, 300);
		place1.setSize(50, 50);
		place1.setFocusPainted(false);
		place1.setContentAreaFilled(false);
		place1.setBorderPainted(false);
		place1.addActionListener(new ChangeMovie());

		this.add(place1);
		this.add(placeName1);

		return hmap;
	}

	public Map Cafe() {
		JLabel placeName2 = new JLabel("ī��");
		placeName2.setLocation(130, 160);
		placeName2.setSize(150, 50);

		JButton place2 = new JButton();
		place2.setLocation(120, 200);
		place2.setSize(50, 50);

		place2.addActionListener(new ChangeCafe());

		this.add(place2);
		this.add(placeName2);

		return hmap;
	}

	public Map Park() {
		JLabel placeName3 = new JLabel("����");
		placeName3.setLocation(260, 110);
		placeName3.setSize(150, 50);
		JButton place3 = new JButton();
		place3.setLocation(250, 150);
		place3.setSize(50, 50);

		place3.addActionListener(new ChangePark());
		this.add(place3);
		this.add(placeName3);

		return hmap;
	}

	public Map Beach() {
		JLabel placeName4 = new JLabel("�ٴ尡");
		placeName4.setLocation(275, 460);
		placeName4.setSize(150, 50);
		JButton place4 = new JButton();
		place4.setLocation(270, 500);
		place4.setSize(50, 50);

		place4.addActionListener(new ChangeBeach());
		this.add(place4);
		this.add(placeName4);

		return hmap;
	}

	public Map Restaurant() {
		JLabel placeName5 = new JLabel("�Ĵ�");
		placeName5.setLocation(660, 160);
		placeName5.setSize(150, 50);
		JButton place5 = new JButton();
		place5.setLocation(650, 200);
		place5.setSize(50, 50);

		place5.addActionListener(new ChangeRestaurant());
		this.add(place5);
		this.add(placeName5);

		return hmap;
	}

	public Map HotPlace() {
		JLabel placeName6 = new JLabel("��ȭ��");
		placeName6.setLocation(455, 500);
		placeName6.setSize(150, 50);
		JButton place6 = new JButton();
		place6.setLocation(450, 540);
		place6.setSize(50, 50);
		place6.addActionListener(new ChangeHotPlace());
		this.add(place6);
		this.add(placeName6);
		return hmap;
	}

	public Map SiningRoom() {
		JLabel placeName7 = new JLabel("�뷡��");
		placeName7.setLocation(55, 240);
		placeName7.setSize(150, 50);
		JButton place7 = new JButton();
		place7.setLocation(50, 280);
		place7.setSize(50, 50);
		place7.addActionListener(new ChangeSiningRoom());
		this.add(place7);
		this.add(placeName7);
		return hmap;
	}

	public Map Pub() {
		JLabel placeName8 = new JLabel("����");
		placeName8.setLocation(560, 10);
		placeName8.setSize(150, 50);
		JButton place8 = new JButton();
		place8.setLocation(550, 50);
		place8.setSize(50, 50);
		place8.addActionListener(new ChangePub());
		this.add(place8);
		this.add(placeName8);

		return hmap;
	}

	public Map FlowerShop() {
		JLabel placeName9 = new JLabel("����");
		placeName9.setLocation(610, 430);
		placeName9.setSize(150, 50);
		JButton place9 = new JButton();
		place9.setLocation(600, 470);
		place9.setSize(50, 50);
		place9.addActionListener(new ChangeFlowerShop());
		this.add(place9);
		this.add(placeName9);

		return hmap;

	}

	public Map ThemePark() {

		JLabel placeName10 = new JLabel("���̰���");
		placeName10.setLocation(190, 280);
		placeName10.setSize(150, 50);
		JButton place10 = new JButton();
		place10.setLocation(190, 320);
		place10.setSize(50, 50);
		place10.addActionListener(new ChangeThemePark());
		this.add(place10);
		this.add(placeName10);

		return hmap;
	}

	public Map CreatPlace() {
		for (int c = 0; c < rp.getRandom2().length; c++) {
			te[c] = rp.getRandom2()[c];

		}

		for (int f = 0; f < temp.length; f++) {
			if (Main.day == 0 && Main.dayBreak == 1 && Main.totalDay != 11) {
				temp[f] += te[f];

				System.out.println("ȣ���");
			}
			// else if (Main.day == 1 && Main.dayBreak == 4 && Main.totalDay != 11) {
			//
			// temp2[f] += te[f];
			//
			// } else if (Main.day == 2 && Main.dayBreak == 7 && Main.totalDay != 11) {
			//
			// temp3[f] += te[f];
			//
			// }

		}
		System.out.println("day" + Main.day);
		System.out.println("db" + Main.dayBreak);
		System.out.println("total" + Main.totalDay);
		if (Main.dayBreak == 1 && Main.totalDay != 11) {

			Main.dayBreak = 2;
			System.out.println("day2" + Main.day);
			System.out.println("db2" + Main.dayBreak);
		} else if (Main.dayBreak == 4 && Main.totalDay != 11) {

			Main.dayBreak = 5;
			System.out.println("day3" + Main.day);
			System.out.println("db3" + Main.dayBreak);
		} else if (Main.dayBreak == 7 && Main.totalDay != 11) {

			Main.dayBreak = 8;
			System.out.println("day4" + Main.day);
			System.out.println("db4" + Main.dayBreak);
		}

		return hmap;
	}

	public Map CreatPlace2() {
		place = new JPanel();
		place.setBounds(800, 350, 150, 400);
		place.setBorder(BorderFactory.createLineBorder(Color.black));
		place.setLayout(null);
		MiniMap.add(place);
		MiniMap.repaint();
		
		plusGirlImage();
	      
		int y = 0;
		for (int b = 0; b < temp.length; b++) {
			System.out.println("ȣ��� 2");
			if (Main.dayBreak == 2 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("��ȭ��");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("ī��");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("����");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("�ٴ�");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("�Ĵ�");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("��ȭ��");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("�뷡��");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("����");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("����");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("���̰���");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}

			} else if (Main.dayBreak == 5 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("��ȭ��");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("ī��");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("����");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("�ٴ�");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("�Ĵ�");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("��ȭ��");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("�뷡��");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("����");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("����");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("���̰���");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}
			} else if (Main.dayBreak == 8 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("��ȭ��");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("ī��");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("����");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("�ٴ�");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("�Ĵ�");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("��ȭ��");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("�뷡��");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("����");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("����");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("���̰���");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}
			}
		}
		return hmap;
	}
	
	public void plusGirlImage() {
		
		int levResult = PlayerInfo.lev;
		System.out.println("������ : " + levResult);
		String[] mmgi = fc.goGirlImages(levResult);
		System.out.println("�迭���� : " + mmgi.length);
		System.out.println("������ ? : " + mmgi[0]);
		Image[] gImage = new Image[mmgi.length];
		System.out.println("�̹��� �迭���� : " + gImage.length);
		JLabel[] gLabel = new JLabel[mmgi.length];
		System.out.println("�� �迭���� : " + gLabel.length);
		int sgoi = 10;
		for(int g = 0 ; g < gImage.length ; g++) {
			gImage[g] = new ImageIcon(mmgi[g]).getImage().getScaledInstance(50, 50, 0); 
			System.out.println("�������� ������? " + gImage[g]);
			JLabel la = new JLabel();
			la.setIcon(new ImageIcon(gImage[g]));
			System.out.println("����? " + la);
			la.setBounds(70 , sgoi , 50 , 50);
			place.add(la);
			sgoi +=50;

			
		}
	}

}

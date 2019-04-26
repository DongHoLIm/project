package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.RandomPlace;


public class MiniMap extends JPanel {
	private JFrame start;
	private JPanel MiniMap;
	private JPanel main;
	private Map hmap;
	static int te[] = new int[5];
	static int temp[] = new int[5];
	static int temp2[] = new int[5];
	static int temp3[] = new int[5];
	RandomPlace rp = new RandomPlace();

	// ImageIcon background;

	public MiniMap(JFrame start) {
		// RandomPlaceManager rpm = new RandomPlaceManager(null);
		this.start = start;
		hmap = new HashMap();
		main = this;
		MiniMap = this;
		MiniMap.setBounds(0, 0, 960, 720);
		this.setBackground(Color.gray);

		ImageIcon icon = new ImageIcon("E:/eclipse-workspace3/miniProject/miniMap.png");
		this.setSize(960, 720);

		// 배경 Panel 생성후 컨텐츠페인으로 지정
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

	}

	public MiniMap() {
	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new Main(start));
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
		JLabel placeName1 = new JLabel("영화관");
		placeName1.setLocation(455, 260);
		placeName1.setSize(150, 50);

		JButton place1 = new JButton();
		place1.setLocation(450, 300);
		place1.setSize(50, 50);

		place1.addActionListener(new ChangeMovie());

		this.add(place1);
		this.add(placeName1);

		return hmap;
	}

	public Map Cafe() {
		JLabel placeName2 = new JLabel("카페");
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
		JLabel placeName3 = new JLabel("공원");
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
		JLabel placeName4 = new JLabel("바닷가");
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
		JLabel placeName5 = new JLabel("식당");
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
		JLabel placeName6 = new JLabel("번화가");
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
		JLabel placeName7 = new JLabel("노래방");
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
		JLabel placeName8 = new JLabel("술집");
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
		JLabel placeName9 = new JLabel("꽃집");
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

		JLabel placeName10 = new JLabel("놀이공원");
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

				System.out.println("호출됨");
			} 
//			else if (Main.day == 1 && Main.dayBreak == 4 && Main.totalDay != 11) {
//				
//				temp2[f] += te[f];
//
//			} else if (Main.day == 2 && Main.dayBreak == 7 && Main.totalDay != 11) {
//				
//				temp3[f] += te[f];
//
//			}

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
		for (int b = 0; b < temp.length; b++) {
			System.out.println("호출됨 2");
			if (Main.dayBreak == 2 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
				}

			} else if (Main.dayBreak == 5 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
				}
			} else if (Main.dayBreak == 8 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
				}
			}
			
		}
		return hmap;
	}

}

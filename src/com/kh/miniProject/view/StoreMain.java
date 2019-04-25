package com.kh.miniProject.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class StoreMain extends JPanel {
	private JFrame start;
	private JPanel shopmain;
	
	public StoreMain(JFrame start) {
		this.start = start;
		this.shopmain = this;
		
		this.setSize(960,720);
		this.setLayout(null);
	
		
		JPanel clothItems = new JPanel();
		clothItems.setLayout(null);
		
		JButton citem1 = new JButton("item1");
		citem1.setSize(120,120);
		citem1.setLocation(20,20);
		clothItems.add(citem1);
		
		JButton citem2 = new JButton("item2");
		citem2.setSize(120,120);
		citem2.setLocation(20,160);
		clothItems.add(citem2);
		JButton citem3 = new JButton("item3");
		citem3.setSize(120,120);
		citem3.setLocation(380,20);
		clothItems.add(citem3);
		JButton citem4 = new JButton("item4");
		citem4.setSize(120,120);
		citem4.setLocation(380,160);
		clothItems.add(citem4);
		
		JPanel shoesItems = new JPanel();
		shoesItems.setLayout(null);
		
		JButton sitem1 = new JButton("item5");
		sitem1.setSize(120,120);
		sitem1.setLocation(20,20);
		shoesItems.add(sitem1);
		JButton sitem2 = new JButton("item6");
		sitem2.setSize(120,120);
		sitem2.setLocation(20,160);
		shoesItems.add(sitem2);
		JButton sitem3 = new JButton("item7");
		sitem3.setSize(120,120);
		sitem3.setLocation(380,20);
		shoesItems.add(sitem3);
		JButton sitem4 = new JButton("item8");
		sitem4.setSize(120,120);
		sitem4.setLocation(380,160);
		shoesItems.add(sitem4);
		
		JPanel jewerlyItems = new JPanel();
		jewerlyItems.setLayout(null);
		
		JButton jitem1 = new JButton("item9");
		jitem1.setSize(120,120);
		jitem1.setLocation(20,20);
		jewerlyItems.add(jitem1);
		JButton jitem2 = new JButton("item10");
		jitem2.setSize(120,120);
		jitem2.setLocation(20,160);
		jewerlyItems.add(jitem2);
		JButton jitem3 = new JButton("item11");
		jitem3.setSize(120,120);
		jitem3.setLocation(380,20);
		jewerlyItems.add(jitem3);
		JButton jitem4 = new JButton("item12");
		jitem4.setSize(120,120);
		jitem4.setLocation(380,160);
		jewerlyItems.add(jitem4);
		
		JPanel item = new JPanel();
		item.setLayout(null);
		
		JButton item1 = new JButton("item13");
		item1.setSize(120,120);
		item1.setLocation(20,20);
		item.add(item1);
		JButton item2 = new JButton("item14");
		item2.setSize(120,120);
		item2.setLocation(20,160);
		item.add(item2);
		JButton item3 = new JButton("item15");
		item3.setSize(120,120);
		item3.setLocation(380,20);
		item.add(item3);
		JButton item4 = new JButton("item16");
		item4.setSize(120,120);
		item4.setLocation(380,160);
		item.add(item4);
		
		JLabel coin = new JLabel("coin");
		coin.setSize(240,30);
		coin.setLocation(615, 100);
		
		JButton exit = new JButton("exit");
		
		exit.setLocation(760,100);
		exit.setSize(80,80);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, shopmain, new Main(start));
				
			}
		}); 
			
		JTabbedPane tp =new JTabbedPane();
		
		tp.setBounds(100, 234, 750, 350);
		tp.add("ø ",clothItems);
		tp.add("Ω≈πﬂ",shoesItems);
		tp.add("æ«ººªÁ∏Æ",jewerlyItems);
		tp.add("æ∆¿Ã≈€",item);
		
		this.add(coin);
		this.add(tp);
		this.add(exit);
		
		
	}
}

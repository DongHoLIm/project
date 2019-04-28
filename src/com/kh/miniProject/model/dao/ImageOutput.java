package com.kh.miniProject.model.dao;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageOutput {
	
	public Image imageOutput(int i) {
		String[] item = new String[8];
		item[0] = new String("images/girl1.png");
		item[1] = new String("images/girl2.png");
		item[2] = new String("images/girl3.png");
		item[3] = new String("images/girl4.png");
		item[4] = new String("images/item1.PNG");
		item[5] = new String("images/item2.PNG");
		item[6] = new String("images/item3.PNG");
		item[7] = new String("images/item4.PNG");
		
		for(int j = 0; j < item.length; j++) {
			if(j+1 == i) {
				Image icon = new ImageIcon(item[j]).getImage().getScaledInstance(70, 70, 0);
				return icon;
			}
		}
		return null;
	}

}

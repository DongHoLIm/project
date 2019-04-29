package com.kh.miniProject.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RandomTextOutput {
	private FileInputStream fi ;
	private int in = (int) (Math.random()*10)+1;
	private String str;
	
	public void FlowerShop() {
		if(in == 1) {
			str = "FlowerShop1";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 2) {
			str = "FlowerShop2";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 3) {
			str = "FlowerShop3";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 4) {
			str = "FlowerShop4";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 5) {
			str = "FlowerShop5";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 6) {
			str = "FlowerShop6";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 7) {
			str = "FlowerShop7";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 8) {
			str = "FlowerShop8";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 9) {
			str = "FlowerShop9";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if(in == 10) {
			str = "FlowerShop10s";
			try {
				fi = new FileInputStream(str);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
			
		
	}

}

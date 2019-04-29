package com.kh.miniProject.controller;

import java.awt.Image;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.ImageOutput;
import com.kh.miniProject.model.vo.GirlImageOut;

public class FileController {
	
	public String[] goGirlImages(int lev) {
		
		return new GirlImageOut().girlImageOut(lev, new GirlImages().girlImages(lev));
		
	}
	
	public Image goImageOutput(int i) {
		
		return new ImageOutput().imageOutput(i);
	}
	
	public String goRandomTextOutput() {
		
		return null;
	}
	
	public String goTextOutput() {
		
		return null;
	}



}

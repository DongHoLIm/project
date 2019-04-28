package com.kh.miniProject.controller;

import java.awt.Image;

import com.kh.miniProject.model.dao.ImageOutput;

public class FileController {
	
	public Image goRandomImageOutput() {
		
		return null;
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

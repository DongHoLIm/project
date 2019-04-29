package com.kh.miniProject.model.vo;

public class GirlImageOut {
	
	public String[] girlImageOut(int lev, String[] image) {
		
		String[] imageResult = new String[5];
		String[] imageResult2 = new String[2];
		String[] imageResult3 = new String[3];
		String[] imageResult4 = new String[4];
		
		if(lev == 1) {
			return image;
		}else if(lev == 2) {
			for(int i = 0; i < imageResult2.length; i++) {
				int random = (int)(Math.random()*2);
				imageResult2[i] = image[random];
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult2;
		}else if(lev == 3) {
			for(int i = 0; i < imageResult3.length; i++) {
				int random = (int)(Math.random()*2);
				imageResult3[i] = image[random];
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult3;
		}else if(lev == 4) {
			for(int i = 0; i < imageResult4.length; i++) {
				int random = (int)(Math.random()*2);
				imageResult4[i] = image[random];
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult4;
		}else if(lev == 5) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*2);
				imageResult[i] = image[random];
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}else if(lev == 6) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*6);
				imageResult[i] = image[random]; 
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}else if(lev == 7) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*6);
				imageResult[i] = image[random]; 
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}
		else if(lev == 8) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*6);
				imageResult[i] = image[random]; 
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}else if(lev == 9) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*6);
				imageResult[i] = image[random]; 
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}else if(lev == 10) {
			for(int i = 0; i < imageResult.length; i++) {
				int random = (int)(Math.random()*6);
				imageResult[i] = image[random]; 
				for(int j = 0; j < i; j++) {
					if(imageResult[i] == imageResult[j]) {
						i--;
						break;
					}
				}
			}
			return imageResult;
		}	
		return null;
	}

}

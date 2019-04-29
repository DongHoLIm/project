package com.kh.miniProject.model.vo;

public class PointMinus {
	public static int resultcoin =5000;
	   public void pointMinus(int minus) {   
		  if (resultcoin>=minus) {
			  resultcoin = resultcoin-minus;  
			  System.out.println(resultcoin);
		}else {
			System.out.println("µ∑ ∫Œ¡∑");
		}

	   }
	   public void pointPlus(int plus) {
		   resultcoin = resultcoin+plus;
	      
	   }	
	

}

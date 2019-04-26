package com.kh.miniProject.model.vo;

public class RandomPlace {
	public static int random2[] = new int [5];
	public RandomPlace() {
			System.out.println("test"); 
			

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			
		
	}
	public int[] getRandom2() {
		return random2;
	}
	public void setRandom2(int[] random2) {
		this.random2 = random2;
	}
}

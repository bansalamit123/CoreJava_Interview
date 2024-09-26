
package com.rays.javabasic;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {

		 Random random = new Random();
	        
		for (int i = 1; i <= 5; i++) {

			//int a = (int) (Math.random() * 10000);
			
			 int randomNumber =1000+ random.nextInt(9000);

			System.out.println(randomNumber);
			// System.out.println("Amit"+"\r"+"is");

		}
	}

}

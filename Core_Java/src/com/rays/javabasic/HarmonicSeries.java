package com.rays.javabasic;

public class HarmonicSeries {

	public static void main(String[] args) {
		/*
		 * for(float i=1;i<=5;i++){ System.out.println(1/i+",");
		 * 
		 * }
		 */

		//int n = 5;
		//double sum = 0.0;

		for (int i = 1; i <= 5; i++) {

			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(" +1/"+i);
			}
		}

	}

}
package com.rays.javabasic;

public class SecondHig {

	public static void main(String[] args) {
		int[] num = { 1, 5000, 8, 6000, 10, 15, 25, 01 };

		int b = 0;
		int c = 0;

		for (int i = 0; i < num.length; i++) {	
			if (b < num[i]) {

				c = b;

				b = num[i];

			}

			if (c < num[i] && b > num[i]) {

				c = num[i];

			}
		}

		System.out.println(c);
	}

}
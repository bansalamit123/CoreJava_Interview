
package com.rays.javabasic;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123;
		//int num2 = num;
		int temp = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			temp = temp * 10 + r;

			num = num / 10;
		
		}
		System.out.println(temp);
		
	}
	
}

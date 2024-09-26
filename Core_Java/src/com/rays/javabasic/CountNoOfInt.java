
package com.rays.javabasic;

public class CountNoOfInt {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 10, 8, 58 };
		int num = 8;
		int temp=0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				temp = i;

			}

		}
		System.out.println(temp);

	}

}

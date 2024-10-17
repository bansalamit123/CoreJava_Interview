
package com.rays.exception;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		int i = 10;
		try {
			int j = i / 0;
		} catch (ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}

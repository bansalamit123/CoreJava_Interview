
package com.rays.oop;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(10, 20, 30));

	}

}

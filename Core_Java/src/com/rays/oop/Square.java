
package com.rays.oop;

public class Square extends Shape {

	public void draw() {
		//super.sound();
		System.out.println("Square shape");
	}

	public static void main(String[] args) {
		Shape b = new Square();

		b.draw();

	}
}

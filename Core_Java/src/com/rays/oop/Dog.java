
package com.rays.oop;

public class Dog extends Animal {

	public void sound() {
		System.out.println("this is dog");
	}

	public static void main(String[] args) {
		Animal b = new Dog();

		b.sound();

	}
}

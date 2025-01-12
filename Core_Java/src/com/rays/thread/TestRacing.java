
package com.rays.thread;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("Kapil");

		Racing t2 = new Racing("Dudhe");

		t1.start();
		t2.start();
	}
}

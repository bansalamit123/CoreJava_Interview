
package com.rays.thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("amit");

		PriorityThread t2 = new PriorityThread("bansal");

		t1.setPriority(2);
		t2.setPriority(10);

		t1.start();
		t2.start();

	}

}

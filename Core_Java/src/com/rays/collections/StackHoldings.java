
package com.rays.collections;

import java.util.Stack;

public class StackHoldings {

	public static void main(String[] args) {

		/*
		 * The pop() method removes the top element from s1 and returns it, and that
		 * element is then pushed onto s2. Effect: This reverses the order of the
		 * elements, since stacks are LIFO (Last In, First Out). After this loop, s1
		 * will be empty, and s2 will have all the elements in reverse order (with 'a'
		 * on top and 'z' at the bottom).
		 * 
		 */
		Stack s1 = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {

			System.out.print(s1.push(i) + " ");
		}
		System.out.println();

		Stack s2 = new Stack();
		while (!s1.isEmpty()) {
			System.out.print(s2.push(s1.pop()) + " "); //pop() method  last in last out
		}
		System.out.println();
		/*
		 * while (!s2.isEmpty()) { System.out.print(s1.push(s2.pop()) + " "); }
		 */
		
	}

}

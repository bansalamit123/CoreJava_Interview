
package com.rays.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // Allow Repeatation and all almost
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);

		System.out.println(list.get(2));
		System.out.println(list.hashCode());
		System.out.println(list.indexOf(200));
		System.out.println(list.subList(1, 3));
		System.out.println(list.lastIndexOf(400));

		System.out.println("=====================================");

		LinkedList l = new LinkedList(); // Similar as ArrayList and follow insertion order!!

		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		/*
		 * offer() and offerLast() both add elements to the end of the deque, but
		 * offerLast() explicitly indicates adding to the last position for clarity.
		 */
		System.out.println(l.element());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.peek() + "pekkkk"); // return 10;
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());

		System.out.println(l.offer(20));

		System.out.println(l);
		System.out.println(l.offerFirst(120));
		System.out.println(l.offerLast(150));
		System.out.println(l);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

		Stack s = new Stack(); // allow as that arraylist

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		System.out.println(s);

		System.out.println(s.isEmpty()); // return false, since the stack is not empty.

		System.out.println(s.peek() + "guggg"); // return 5guggg, since 5 is the top element of the stack.
		System.out.println(s.search(1) + "search");// return 1search, since 5 is at position 1 from the top (1-based
													// index).
		System.out.println(s.pop()); // return 5, since it removes and returns the top element if values return empty
										// it return -1 allways
		System.out.println(s + "endddddddddd"); // print the current state of the stack, which is [1, 2, 3, 4] after
												// popping 5.
		System.out.println("=========+++++++++++++++++++++=====================");

		Vector v = new Vector(); // Allow Repeatation
		v.add(50);
		v.add(100);
		v.add(150);
		v.add(200);

		System.out.println(v.elementAt(2));// Based on Index
		System.out.println(v.subList(1, 3));
		System.out.println(v.hashCode());
		System.out.println(v.size());

		/*
		 * When you initialize a Vector with a capacity of 10 and then add 4 elements,
		 * the size becomes 4, but the capacity remains at 10 because it still has space
		 * to accommodate more elements (6 more in this case).
		 * 
		 * The Vector will only change its capacity when you exceed its current
		 * capacity. For example, if you add an 11th element to the Vector, it will
		 * automatically resize to accommodate the new element. Typically, the capacity
		 * is doubled when resizing occurs, but this behavior can depend on the
		 * implementation.
		 */
		System.out.println(v.capacity());// return default capicity of vactor-10;

	}

}

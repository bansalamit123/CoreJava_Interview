
package com.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {
		// ArrayBlockingQueue l = new ArrayBlockingQueue(5);// Exception Not raise and,String also allow
		// dosn't allow null values if allow it throw nullpointer
		// If queue full then throw java.lang.IllegalStateException: Queue full
		
		// ArrayBlockingQueue l = new ArrayBlockingQueue(5);
     	List l = new ArrayList();
		
		/*
		 * Important: Adding elements after creating the iterator does not immediately
		 * throw an exception in an ArrayBlockingQueue. This is because
		 * ArrayBlockingQueue does not enforce fail-fast behavior like other collections
		 * (e.g., ArrayList). However, the iterator wil still only see the state of the
		 * queue at the time it was created (i.e., [1, 3, 2])
		 * 
		 */

		l.add(1);

		l.add(3);
		l.add(2);

		/*
		 * In this code, once you modify the list after creating the iterator, calling
		 * it.next() will throw a ConcurrentModificationException. This happens because
		 * Java's Iterator is designed to fail quickly (fail-fast) if it detects that
		 * the list has been modified structurally (e.g., adding or removing elements)
		 * after the iterator was created.
		 */
		Iterator it = l.iterator();
		l.add(5);
		l.add("abc");
		 l.add(4); // Here we cannot add or remove elements when list object
		// l.clear(); // Here we clear

		/*
		 * Why gives out put 1 after called clear method? Ans-Despite the fact that the
		 * queue is now empty (due to clear()), the iterator it was created before the
		 * queue was modified. Therefore, it still holds references to the elements that
		 * were in the queue at the time it was initialized, which were [1, 3, 2].
		 * Expected out put 1,2,3
		 */
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


package com.rays.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Diffrence element() method and peek()?Ans.queue.element()-Throws Exception:
		 * If the queue is empty, this method throws a NoSuchElementException.
		 * queue.peek()-Returns null: If the queue is empty, it returns null instead of
		 * throwing an exception.
		 */

		/*
		 * Diffrence poll() method and remove()?Ans.queue.poll()-Returns null if Empty:
		 * If the queue is empty, it returns null instead of throwing an exception.
		 * queue.remove()-Throws Exception: If the queue is empty, it throws a
		 * NoSuchElementException.
		 */
		Queue queue = new PriorityQueue();
		// Queue queue = new LinkedList();

		queue.offer(100);
		queue.offer(200);
		queue.offer(30);
		queue.add(400);

		System.out.println("queue.element() : " + queue.element());// element() returns the head of the queue, which is
																	// the smallest element (because it's
																	// aPriorityQueue).Since the smallest element is 30,
		System.out.println(queue.isEmpty()); // the output will be
		System.out.println("queue.peek() : " + queue.peek());// Since the smallest element is 30, the output will be
		System.out.println("queue.poll() : " + queue.poll());// poll() returns and removes the head of the queue. So, it
																// will remove the smallest element, which is 30:
		System.out.println("queue.remove() : " + queue.remove());// remove() removes and returns the head of the queue.
																	// After 30 has been removed, the next smallest
																// element is 100, so it will remove 100:
		System.out.println(queue);
		System.out.println("queue.remove(200) : " + queue.remove(200)); // true if it exist then remove
		System.out.println(queue);
		//queue.poll();
		/*
		 * 1. offer() Function: Attempts to add an element to the queue. Returns false
		 * if Capacity is Full: In bounded queues, if the queue is full, offer() returns
		 * false instead of throwing an exception. Non-Blocking: It is a non-blocking
		 * method, meaning it doesn't wait if the queue is full and just returns false.
		 * Use Case: Use offer() when you want to safely try to add an element and
		 * handle a failure (like the queue being full) without an exception.
		 */

		/*
		 * 2. add() Function: Adds an element to the queue. Throws an Exception if
		 * Capacity is Full: In bounded queues, if the queue is full, add() throws an
		 * IllegalStateException. Strict Behavior: It enforces the insertion, expecting
		 * the operation to succeed. If it doesn't, it throws an exception. Use Case:
		 * Use add() when you expect the element to be added successfully and want
		 * strict behavior, allowing an exception to be thrown if there's a failure.
		 */

		/*
		 * IMPNote:This description is wrote according to PriorityQueue not LinkedList
		 * LinkedList- returns the head(top like-100) of the queue not smallest
		 */
		/*
		 * PriorityQueue: Maintains a priority-based order. LinkedList: Maintains
		 * insertion order (FIFO-First-In-First-Out).
		 */
	}
}

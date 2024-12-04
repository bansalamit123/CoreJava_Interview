
package com.rays.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestAddOffer {
	public static void main(String[] args) {
		
		/*
		 * The offer() method attempts to insert elements into the queue. If the queue
		 * is full, offer() returns false and does not throw an exception.
		 */
		
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer("3");   // This will return false (not added)
		System.out.println(q1);
		
		
		/*
		 * The add() method behaves differently from offer(). If the queue is full,
		 * add() will throw an IllegalStateException rather than returning false.
		 */
		Queue q = new ArrayBlockingQueue(1);
		q.add(4);
		//q.add(5);  // This will throw an IllegalStateException
//		q.add(6);
//		q.add(7);
		System.out.println(q);
         
		// We can use Iterator to iterate

      // Queue q2 = new PriorityQueue();
      //  q2.offer(3);
      // q2.offer(4);
    // System.out.println(q2.poll());//The poll() method retrieves and removes{3} the head of the queue 

	}
}

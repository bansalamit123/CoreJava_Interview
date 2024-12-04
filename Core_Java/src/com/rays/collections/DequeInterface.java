
package com.rays.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
	
	/*
	 * ArrayDeque: It generally maintains insertion order because it's backed by a
	 * resizable array and allows elements to be added or removed from both ends of
	 * the queue. While it doesn't explicitly guarantee insertion order, as long as
	 * you use the addLast() or addFirst() methods (for adding at the end or front,
	 * respectively), the order in which elements are added is preserved.
	 * 
	 * LinkedList: This class also maintains insertion order because it's a
	 * doubly-linked list. Elements are linked in the order they are inserted, so
	 * iterating through the list will return them in the order of insertion.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque dequ = new ArrayDeque();  //Does not allow null elements. If you try to add null, it will throw a NullPointerException.Duplicate values allow
		// Deque dequ = new LinkedList();  //LinkedList:Allows multiple null elements, so you can add null to a LinkedList.
		
		  dequ.offer(1.1);
		  dequ.offer("amit"); 
		  dequ.offer(300);
		  dequ.offer(400);
		  dequ.offer(500);
		  dequ.offer(600); 
		  
		// dequ.offer(null);// result java.lang.NullPointerException
		// dequ.offer("amit"); //allow in both interface
		/*
		 * getFirst() vs peek(): Both retrieve the first element without removing it.
		 * The main difference is that getFirst() throws an exception when the deque is
		 * empty, while peek() returns null.
		 */

		/*
		 * ArrayDeque: Fast (O(1)) for adding/removing at ends, uses a dynamic array,
		 * can resize.
		 * 
		 * LinkedList: O(1) for adding/removing at both ends and middle, uses more
		 * memory due to pointers, slower access (Oddequ(n)).
		 */
         
		System.out.println("dequ.offerFirst(1000) : " + dequ.offerFirst(1000));
		// System.out.println("dequ.offerFirst(1000) : "+dequ.offerLast(1000));
		System.out.println(dequ);
		System.out.println("dequ.getFirst() : " + dequ.getFirst()); ///return value if empty Throw  NoSuchElementException
         System.out.println("dequ.peek() : " + dequ.peek()); //return value if empty then return null
		System.out.println(dequ);

		System.out.println("dequ.poll() : " + dequ.poll());// provide first and remove it but return value if empty then
															// return null,Does'nt throw an exception
		System.out.println(dequ);
		System.out.println("dequ.pop() : " + dequ.pop());// provide first and remove it but return value if empty Throw
															// NoSuchElementException
		System.out.println(dequ);
		System.out.println("dequ.pollFirst() : " + dequ.pollFirst()); // provide first and remove it but return value if empty then return null
		System.out.println(dequ);
    
	}

}

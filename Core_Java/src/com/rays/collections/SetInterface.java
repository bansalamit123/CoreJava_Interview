
package com.rays.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);

		// h.add("e"); // Allow String
		// h.add(null); //Null allow only single
		System.out.println(h.contains(100));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.remove(100));
		

		System.out.println(h);

		System.out.println("====================================");

		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
	//	t.add(40); //allow single value
        
		// t.add(null); //Does'nt Allow null when you add null values it throw a
		// NullpointerException
		// t.add("e"); //Does'nt Allow when you add String values it throw a
		// java.lang.ClassCastException
		System.out.println(t.contains(10));
		System.out.println(t.ceiling(10)); // Returns the least element greater than or equal to 10
		System.out.println(t.first());
		System.out.println(t.pollFirst()); // Retrieves and removes the first element
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.pollLast()); // Retrieves and removes the last element
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
       
		LinkedHashSet l = new LinkedHashSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(4);
	//	l.add("e"); //Allow
	//	l.add(null);  //Allow only single null or value
		
		
		System.out.println(l.contains(2));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.remove(4));
		System.out.println(l);
		System.out.println(l.hashCode());
		System.out.println(l.toArray());
	}
}


package com.rays.collections;

import java.util.HashSet;
import java.util.Set;

public class EqualHashCodeTesttt {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "amit", 120);
		EqualHashCode e2 = new EqualHashCode(1, "amit", 120);
		EqualHashCode e3 = new EqualHashCode(1, "amit", 120);
		EqualHashCode e4 = new EqualHashCode(10, "amit", 120);

		/*
		 * A HashSet uses the hashCode() and equals() methods to determine if two
		 * objects are considered equal. If two objects have the same hashCode() and
		 * equals() returns true for them, they are treated as duplicates, and the
		 * second one won't be added.
		 */		
		Set s = new HashSet();   // does not allow duplicate elements
		s.add(e1);
		//s.add(e2);
		System.out.println(s);
		s.remove(e1);
	//	System.out.println(s);
		s.add(e4);
		System.out.println(s);

	}

}

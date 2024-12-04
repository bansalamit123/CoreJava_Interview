
package com.rays.collections;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "amit", 500);
		EqualHashCode e1 = new EqualHashCode(100, "amit", 500);
		EqualHashCode e2 = new EqualHashCode(2, "amit", 100);

		List l = new ArrayList(); 
		l.add(e1);
	//	l.add(e1);   //Allow duplicates values and multiple null
		
		System.out.println(l);

		l.remove(e);  //interally hashcode method call ho rahi h
		System.out.println(l);

		System.out.println("setttttttttt");
		Set s = new HashSet();     // Does'nt Allow duplicates values
		s.add(e);
		//s.add("e"); //allow
	//	s.add(null);  //Allow only single null value
		System.out.println(s);

		s.add(e);
		System.out.println(s);

		s.add(e2);
		System.out.println(s);
		

		System.out.println("mapppppppp");
		Map m = new HashMap();  // /Allow duplicates values also multiple null values

		m.put(1, e);
		m.put(2, e1);
		System.out.println(m + "hhhh");

		m.remove(1, e);
		System.out.println(m);
	}
}

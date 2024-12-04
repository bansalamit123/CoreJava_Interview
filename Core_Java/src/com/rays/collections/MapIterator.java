
package com.rays.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterator {

	public static void main(String[] args) {
		/*
		 * HashMap does not maintain insertion order How to Maintain Insertion Order: If
		 * you need to preserve the order in which the entries are inserted, you should
		 * use a LinkedHashMap instead of a HashMap. A LinkedHashMap maintains insertion
		 * order.
		 */
		HashMap m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(40000, "fourh");
		m.put(4, null);
		m.put(4, "kpnull");

		
		//  Set s = m.entrySet();
		  
		  for (Object o : m.entrySet()) {
			  Map.Entry p = (Map.Entry) o;
		  System.out.println(p.getKey()+" "+p.getValue());
		  }
		 
		 
		for (Object o : m.entrySet()) {

			System.out.println(o);

		}
		// System.out.println(m);

		for (Object o : m.values()) {

			System.out.println(o);

			// System.out.println(m);
		}
		for (Object o : m.keySet()) {

			System.out.println(o);
		}

	}

}

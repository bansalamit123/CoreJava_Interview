
package com.rays.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterface {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");

		/*
		 * A HashMap does not allow duplicate keys. If you try to insert a key that
		 * already exists in the map, the new value will replace the old value
		 * associated with that key. m.put(5, "g"); multiple null allow but key must
		 * diffrent
		 */
	
        
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get(5));
		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));
		System.out.println(m);
		System.out.println("+++++++++++++++++++++++++++++++++");

		TreeMap t = new TreeMap(); //allow null value

		t.put(1, "amit");
		t.put(2, "bansal");
		t.put(3, "prs");
		t.put(4, "dp");
		t.put(5, "e");
		
       
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry()); // return 1=amit
		System.out.println(t.lastEntry());
          
		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "kgn");
		l.put(2, "jh");
		l.put(3, "indore");
		l.put(2, "amit");
		l.put(5, "bansal");

		System.out.println(l.get(2));
		System.out.println(l.containsKey(3));
		System.out.println(l.containsValue("kgn"));
		System.out.println(l.entrySet()); // [1=kgn, 2=amit, 3=indore, 5=bansal]
		System.out.println(l.keySet()); // [1, 2, 3, 5]
		System.out.println(l.values()); // [kgn, amit, indore, bansal]
		
		
	//	HashMap: Unordered, allows null keys/values, uses hashing for fast lookups.
	//TreeMap: Sorted by natural order or a comparator, no null keys, slower than HashMap.
	//LinkedHashMap: Maintains insertion order, allows null keys/values, slightly slower than HashMap.
	}

}

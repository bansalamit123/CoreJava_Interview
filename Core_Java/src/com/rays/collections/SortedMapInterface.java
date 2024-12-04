
package com.rays.collections;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		SortedMap s=new TreeMap();
		s.put(1, "one");
		s.put(2, "two");
		s.put(5, "three");
		s.put(5, "one");
		s.put(4, "one");
	//	s.put(6,null); //allow null value
		
		
		System.out.println(s.lastKey());
		System.out.println(s.firstKey());
		System.out.println(s.tailMap(2));
		System.out.println(s.entrySet());
		System.out.println(s.subMap(2, 4));  //Output: {2=two}, as 2 is included but 4 is excluded.
		System.out.println(s.values());
		System.out.println(s.keySet());
		
	}        

}

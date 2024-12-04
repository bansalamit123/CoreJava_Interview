
package com.rays.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();  //allow multiple null values

		v.add(1);
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('e');
		
           // Enumeration is a legacy interface;
		Enumeration e = v.elements();

		v.add(100);
		v.remove(2);// Based only Index  if return indexing not found throw java.lang.ArrayIndexOutOfBoundsException: 
        
		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}

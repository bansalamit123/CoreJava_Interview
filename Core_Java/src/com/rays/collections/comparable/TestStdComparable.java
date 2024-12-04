
package com.rays.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStdComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Student(4, "e"));
		list.add(new Student(2, "k"));
		list.add(new Student(3, "j"));
		list.add(new Student(1, "a"));
       //System.out.println("bansal");
		Collections.sort(list); // This method internally calls the compareTo() method for each comparison between two Student objects.

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());  // Implicit call to toString() on Student object
		}
		
		

	}

}

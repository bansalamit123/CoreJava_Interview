
package com.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		// AutoBoxing
		// primitive data is converted into Object, it is called Auto-boxing
		int a = 1;
		Integer b = a;

		System.out.println("Wrapper Int :" + b);

		// Unboxing

		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);
		
		/*
		 * List<Integer> intList = new ArrayList<>(); intList.add(5); intList.add(10);
		 * // Autoboxing: primitive int to Integer
		 * System.out.println("Autoboxing in collections: " + intList.get(0));
		 * System.out.println("Autoboxing in collections: " + intList.get(1));
		 */


	}
}

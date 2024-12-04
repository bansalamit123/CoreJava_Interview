package com.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = new ArrayList();
		l1.add('a');
		l1.add('b');
		l1.add('c');
		l1.add('d');

		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add('c');
		l.add('d');
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('E');

		System.out.println(l.removeAll(l1));
		System.out.println(l);

	}

}

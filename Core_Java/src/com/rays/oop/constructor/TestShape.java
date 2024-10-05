
package com.rays.oop.constructor;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle(10);
		s[1] = new Rectangle(10, 5);

		System.out.println(s[0].area());
		System.out.println(s[1].area());

		
		 double a = area(s);
		 System.out.println(a);
	}

	private  static double area(Shape[] s) {
		  double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}

		
		return totalArea;

	}
}

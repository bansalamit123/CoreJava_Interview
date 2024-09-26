
package com.rays.string;

public class StringMethods {
	public static void main(String[] args) {

		String str = "Hello";
		String s = " java";

		String s1 = str.toLowerCase();
		String s2 = s.toUpperCase();
		String s3 = s.trim();
		String s4 = str.substring(1, 2);
		String s5 = str.concat(s);
		char cd = str.charAt(2);

		String name = "Amit Bansal";
		String[] words = name.split(" ");
		for (String word : words) {
			System.out.print("wdeifnifnienf"+word);

		}

		System.out.println();
		System.out.println(str);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("charAttttt   "+cd);
	}
}

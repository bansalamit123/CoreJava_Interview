
package com.rays.string;

public class CountOccuraceOfaChar {

	public static void main(String[] args) {
		String name = "amit bansal";
        // char[]ch=name.toCharArray();
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

		//	char ch = name.charAt(i);

			String m = String.valueOf(name.charAt(i));

			if (m.matches("a")) {
				count++;
			}

		}
		System.out.println("a:"+count);
	}

}

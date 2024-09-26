
package com.rays.string;

public class StringArrayCount {

	public static void main(String[] args) {
		String[] names = { "abcabc" };
		
		int count = 0;
		for (String s : names) {
			

			for (char a = 'a'; a <= 'z'; a++) {

				for (int i = 0; i < s.length(); i++) {
					if (a == s.charAt(i)) {
						count++;
					}
				}
				if (count != 0) {
					System.out.println(a + ""+ count);
					count = 0;
				}

			}

		}
	}

}

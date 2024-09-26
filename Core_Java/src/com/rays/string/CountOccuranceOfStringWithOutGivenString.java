
package com.rays.string;

public class CountOccuranceOfStringWithOutGivenString {

	public static void main(String[] args) {
		String name = "amit bansal";
		
		for (char a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				if (a == name.charAt(i)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(a);
			
			}
		}
	}

}

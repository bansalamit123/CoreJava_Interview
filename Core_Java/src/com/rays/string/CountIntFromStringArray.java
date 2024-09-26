package com.rays.string;

import java.util.Arrays;

public class CountIntFromStringArray {

	public static void main(String[] args) {
		
		String[] names = { "bansal52464" };
		String r ="";

		for (String s : names) {
			char[] ch = s.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				if (Character.isDigit(ch[i])) {
					r=r + ch[i];
				}
			}
			int [] intArray=new int [r.length()];
			for(int i=0;i<r.length();i++) {
				intArray[i]=Character.getNumericValue(r.charAt(i));
			}
			System.out.println(Arrays.toString(intArray));
	}

	}

}

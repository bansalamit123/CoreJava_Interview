
package com.rays.streamapi;

import java.util.Arrays;

public class MinimumMaximum {
	public static void main(String[] args) {
		int[] i = { 10, 12, 45, 25, 23 };
		Arrays.stream(i).min().ifPresent(e->System.out.println(e));
	//	Arrays.stream(i).max().ifPresent(e->System.out.println(e)); If you want Max value 
		
	}

}

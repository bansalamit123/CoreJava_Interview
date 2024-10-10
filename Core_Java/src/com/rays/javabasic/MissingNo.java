package com.rays.javabasic;

public class MissingNo {
	public static void main(String[] args) {
		int a[] = { 2, 5, 77, 45, 3 };
		int b[] = { 2, 5, 45, 3 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag=true;
					break;
				}
			}if(!flag) {
			System.out.println(a[i]);
			}
		}

	}
}

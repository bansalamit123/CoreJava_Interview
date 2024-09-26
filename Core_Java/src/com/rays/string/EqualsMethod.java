package com.rays.string;

public class EqualsMethod {

	public static void main(String[] args) {

		String s = "amit";
		String s1 = "amit";

		String s2 = new String("amit");
		String s3=new String("amit");
		
		StringBuffer sb=new StringBuffer("amit");
		StringBuffer sb1=new StringBuffer("amit");
		
		StringBuilder ss=new StringBuilder("amit");
		StringBuilder ss1=new StringBuilder("amit");
		
		
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		
		System.out.println(ss.equals(ss1));
		System.out.println(ss==ss1);
		
		

	}

}

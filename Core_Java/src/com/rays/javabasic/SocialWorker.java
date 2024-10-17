package com.rays.javabasic;

public class SocialWorker implements Businessman, Richman {
	

	@Override
	public int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String[] args) {
		
		SocialWorker s = new SocialWorker();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
	}

	
}


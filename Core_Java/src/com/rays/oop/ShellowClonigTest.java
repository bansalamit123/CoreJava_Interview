
package com.rays.oop;

public class ShellowClonigTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		ShellowClonig s = new ShellowClonig();
		s.balance = 100;

		ShellowClonig s2 = (ShellowClonig) s.clone();
		s2.balance = 200;
		System.out.println(s.balance);
		System.out.println(s2.balance);
	}

}


package com.rays.oop;

public class ConstructorCalling {

	String fName;
	String lName;
	String address;

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	public ConstructorCalling(String fName, String lName, String address) {
		this(fName, lName);
		
		this.address = address;
		System.out.println(address);
	}
}

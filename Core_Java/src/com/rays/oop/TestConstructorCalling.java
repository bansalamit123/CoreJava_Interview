
package com.rays.oop;

public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fName, String lName, String address) {
		super(fName, lName, address);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("amit", "bansal", "indore");
	}

}

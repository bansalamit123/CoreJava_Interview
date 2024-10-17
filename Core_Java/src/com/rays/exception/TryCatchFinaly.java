
package com.rays.exception;

public class TryCatchFinaly {

	public static void main(String[] args) {

		try {

			String name =null;

			System.out.println(name.length());
			
			 // System.exit(0); System.out.println("This will not be executed");
			 
		} catch (NullPointerException e) {

			System.out.println(e);

			//System.exit(0);// Program terminates here

		} finally {

			System.out.println("This is Finally Block");
			// System.exit(0); // Program terminates here
		}
		//System.out.println("This will not be executed");

	}

}

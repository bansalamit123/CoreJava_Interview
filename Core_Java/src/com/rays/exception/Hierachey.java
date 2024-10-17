
package com.rays.exception;

public class Hierachey {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;

		} 
		/*
		 * catch (ArithmeticException e) { System.out.println(e); }
		 */
		
		catch (Exception e) {
			System.out.println(e);
		}
		/*
		 * } catch (StringIndexOutOfBoundsException e) { System.out.println(e); // TODO:
		 * handle exception //Compilte time error because Unreachable catch block for
		 * StringIndexOutOfBoundsException. It is already handled by the catch block for
		 * Exception
		 */
		finally {
			System.out.println("finally block");
		}
	}

}

package com.rays.javabasic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		double num1 = sc.nextDouble();

		System.out.println("Enter second number");
		double num2 = sc.nextDouble();

		System.out.println("Choose an operator(+,-,*,/):");

		char operator = sc.next().charAt(0);

		double result ;

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			if (num2 != 0) {
				result = num1 / num2;

			} else {
				System.out.println("Error!Division by zero");
				return;
			}

			break;

		default:
			System.out.println("Invalid operator");
			return;

		}

		System.out.println(result);

	}

}

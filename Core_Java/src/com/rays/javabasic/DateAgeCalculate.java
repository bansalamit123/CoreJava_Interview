package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {


	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDate empBiryth = LocalDate.of(1998, 10, 9);

		Period p = Period.between(empBiryth, today);

		System.out.println("employe age : " + p.getYears());

	}

}
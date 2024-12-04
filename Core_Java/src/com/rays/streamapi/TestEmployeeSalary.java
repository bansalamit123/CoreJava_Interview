
package com.rays.streamapi;

import java.util.ArrayList;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(20000, "kapil"));
		list.add(new EmployeeSalary(25000, "dudhe"));
		list.add(new EmployeeSalary(1000, "raj"));
		list.add(new EmployeeSalary(522, "naman"));
		list.add(new EmployeeSalary(600, "paras"));

		list.stream().distinct().filter(c -> (c.getSalary() >= 20000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}

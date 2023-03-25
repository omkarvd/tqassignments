////WAP to print Emp who have name "Sachin"
package com.employee;

import java.util.ArrayList;

public class EmployeeListSachin {

	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee(1, "Sachin", 100000));
		elist.add(new Employee(2, "Danny", 999000));
		elist.add(new Employee(3, "Sunny", 992000));

		for (Employee e : elist) {
			if (e.getName() == "Sachin") {
				System.out.println(e);
			}
		}
	}

}

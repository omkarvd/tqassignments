package com.paper;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee(1, "Omkar", 44000, 22));
		elist.add(new Employee(2, "Suyog", 50000, 26));
		elist.add(new Employee(3, "Vivek", 55000, 24));
		elist.add(new Employee(4, "Virat", 40000, 25));

		for (Employee e : elist) {
			System.out.println(e);
		}

		System.out.println();

		// Collections.sort(elist, new NameComparator());
		Collections.sort(elist, new SalaryComparator());
		// Collections.sort(elist, new AgeComparator());
		// Collections.sort(elist, new IdComparator());
		for (Employee e : elist) {
			System.out.println(e);
		}
	}
}

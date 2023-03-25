//WAP to print Emp who have highest number of salary
package com.employee2;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeHighestSalary {

	public static void main(String[] args) {
		ArrayList<Employe> elist = new ArrayList<>();
		elist.add(new Employe(1, "Sachin", 100000));
		elist.add(new Employe(2, "Danny", 999000));
		elist.add(new Employe(3, "Sunny", 992000));

		Iterator<Employe> i = elist.iterator();
		int maxsalary = 0;
		int sal = 0;

		while (i.hasNext()) {
			Employe e1 = i.next();
			sal = e1.salary;
			if (sal > maxsalary) {
				maxsalary = sal;
			}
		}
		System.out.println("maximum salary..." + maxsalary);
		// System.out.println();
	}
}

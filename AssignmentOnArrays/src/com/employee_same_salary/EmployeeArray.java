/*WAP to print the employees from Employee[] array who has same salary (Create 
Employee class which has 3 attributes id, name, salary and add employee objects to 
your array)*/
package com.employee_same_salary;

public class EmployeeArray {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "Omkar", 50000), new Employee(2, "Suyog", 50000),
				new Employee(3, "Vivek", 50000) };

		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getSalary() == employees[j].getSalary()) {
					System.out.println("Employees with same salary:");
					System.out.println(employees[i]);
					System.out.println(employees[j]);
				}

			}

		}

	}

}

/*Create a hashmap where employee is key and string is value. Employee ( int emp_id , emp_name , emp_salary) Implement hashcode and equals methd so that map should not allow duplicate entry of employees with same salary in the map
*/
package com.question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Employee, String> em = new HashMap<>();
		em.put(new Employee(1, "Omkar", 50000), "IT");
		em.put(new Employee(1, "Omkar", 50000), "IT");
		em.put(new Employee(2, "Suyog", 50000), "HR");

		// Print the contents of the map
		for (Map.Entry<Employee, String> entry : em.entrySet()) {
			System.out.println(
					entry.getKey().getEmp_name() + " - " + entry.getKey().getEmp_salary() + " - " + entry.getValue());
		}
	}
}

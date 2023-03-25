/*Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
of Employee and display the array element*/
package com.employee_display_arrayelement;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept1 = new Department(1, "Engineering");
		Department dept2 = new Department(2, "Sales");

		MyDate date1 = new MyDate(11, 4, 2023);
		MyDate date2 = new MyDate(15, 5, 2023);

		Employee[] em = new Employee[2];
		em[0] = new Employee(1, "Omkar", 50000, dept1, date1);
		em[1] = new Employee(2, "sandip", 45000, dept2, date2);

		for (Employee e : em) {
			System.out.println(e);
		}
	}

}

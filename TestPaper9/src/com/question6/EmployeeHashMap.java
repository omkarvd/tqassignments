package com.question6;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {
	public static void main(String[] args) {

		// Employee Create
		Employee e1 = new Employee(1, "Vivek");
		Employee e2 = new Employee(2, "Suyog");
		Employee e3 = new Employee(3, "Omkar");
		Employee e4 = new Employee(4, "Suraj");

		// HashMap Of Department_Employee......
		HashMap<Department, Employee> hm = new HashMap<>();
		hm.put(new Department(101, "IT"), e1);
		hm.put(new Department(102, "HR"), e2);
		hm.put(new Department(103, "IT"), e3);
		hm.put(new Department(104, "HR"), e4);

		for (Map.Entry<Department, Employee> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

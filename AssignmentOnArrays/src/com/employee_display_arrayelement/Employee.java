package com.employee_display_arrayelement;

public class Employee {
	private int emp_id;
	private String emp_name;
	private int emp_salary;
	private Department department;
	private MyDate mydate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, int emp_salary, Department department, MyDate mydate) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.department = department;
		this.mydate = mydate;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public MyDate getMydate() {
		return mydate;
	}

	public void setMydate(MyDate mydate) {
		this.mydate = mydate;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", department="
				+ department + ", mydate=" + mydate + "]";
	}

}

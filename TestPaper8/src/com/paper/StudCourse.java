//There is Student class { int id , string name ,Boolean isSpecial , Course c } . Course { String cname , int fees } Assume that there is array of 10 student objects. Write a program to set isspecial to be true if course fee of that student is more than 50000.

package com.paper;

class Student {
	private int id;
	private String name;
	private boolean isSpecial;
	private Course course;

	public Student(int id, String name, boolean isSpecial, Course course) {
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isSpecial() {
		return isSpecial;
	}

	public Course getCourse() {
		return course;
	}

	public void setIsSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}
}

class Course {
	private String cname;
	private int fees;

	public Course(String cname, int fees) {
		this.cname = cname;
		this.fees = fees;
	}

	public String getCname() {
		return cname;
	}

	public int getFees() {
		return fees;
	}
}

public class StudCourse {
	public static void main(String[] args) {
		Student[] students = new Student[] {

				new Student(1, "Gaurav", false, new Course("java", 45000)),
				new Student(2, "Adinath", false, new Course("Science", 60000)),
				new Student(3, "YAshank", false, new Course("math", 55000)),
				new Student(4, "Ratnadeep", false, new Course("c", 50000)),
				new Student(5, "Suyog", false, new Course("c++", 70000)),
				new Student(6, "Sagar", false, new Course("html", 48000)),
				new Student(7, "Vivek", false, new Course("css", 52000)),
				new Student(8, "Omkar", false, new Course("os", 65000)),
				new Student(9, "Rahul", false, new Course("python", 40000)),
				new Student(10, "Pritish", false, new Course("sql", 58000)) };

		for (Student student : students) {
			if (student.getCourse().getFees() >= 50000) {
				student.setIsSpecial(true);
			}
		}

		for (Student student : students) {
			System.out.println(student.getName() + "   course:    " + student.getCourse().getCname()
					+ ":  course fee = " + student.getCourse().getFees() + ",   isspecial = " + student.isSpecial());
		}
	}
}

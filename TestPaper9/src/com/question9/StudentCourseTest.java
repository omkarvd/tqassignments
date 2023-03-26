//Create a hashmap of student has a course and sort it by student marks
package com.question9;

import java.util.HashMap;
import java.util.Map;

public class StudentCourseTest {

	public static void main(String[] args) {

		Course c1 = new Course(1, "Java", 6000);
		Course c2 = new Course(2, "Python", 5000);
		Course c3 = new Course(3, "Angular", 9000);
		Course c4 = new Course(4, "NodeJs", 7000);

		HashMap<Student, Course> smap = new HashMap<>();

		smap.put(new Student("omkar", 89), c1);
		smap.put(new Student("Ajay", 98), c3);
		smap.put(new Student("Sagar", 78), c2);
		smap.put(new Student("Ratan", 72), c4);
		smap.put(new Student("Vivek", 72), c1);

		for (Map.Entry<Student, Course> en : smap.entrySet()) {
			System.out.println(en.getKey() + "  >>" + en.getValue());
		}
	}

}

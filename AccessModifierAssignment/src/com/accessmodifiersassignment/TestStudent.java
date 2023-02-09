package com.accessmodifiersassignment;

class Student {
	public int rollNum;
	protected int admissionNumber;
	int age;
	private String courseId;

	public void doPublic() {
		System.out.println("Public method implemented");
	}

	void doDefault() {
		System.out.println("Default method implemented");
	}

	protected void doProtected() {

	}

	private void doPrivate() {
		System.out.println("Private method implemented");
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.rollNum = 10;
		s.admissionNumber = 444;
		s.age = 20;
		// s.courseId;// it is private so we cant
	}

}

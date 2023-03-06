package com.single;

public class Child extends Parent {
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public static void main(String[] a) {
		Child c = new Child();
		c.setAge(30);
		c.setName("Sujay");
		c.setSchool("New English school");
		System.out.println(
				"Parent Age : " + c.getAge() + " Parent Name : " + c.getName() + " Child School : " + c.getSchool());
	}
}
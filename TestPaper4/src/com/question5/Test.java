package com.question5;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book(101, "Sachin", 99f, new Author(1, "Chanrashekhar", "pune"));
		Book b2 = new Book(101, "Man me hain vishwas", 99f, new Author(1, "Vishwas", "Mumbai"));
		System.out.println(b1);
		System.out.println(b2);
	}

}

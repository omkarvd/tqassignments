//program class got functionalities of class programmer and also person's class.
package com.multilevel;

class Person {
	String getName() {
		return "Programmer Omkar";
	}
}

class Programmer extends Person {
	String getcodingLanguage() {
		return "Java";
	}
}

public class Program extends Programmer {
	int getlineOfCode() {
		return 20;
	}

	public static void main(String[] args) {
		Program p = new Program();
		p.getName();
		p.getcodingLanguage();
		p.getlineOfCode();
		System.out.println(p.getName() + " " + p.getcodingLanguage() + " " + p.getlineOfCode());
	}

}

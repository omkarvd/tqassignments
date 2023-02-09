//1. Create a class Account with member Variable: long accountNo, String customerName.Make them public.

package com.constructorassignment;

public class Account {
	public long accountNo;
	public String customerName;

	// After commenting default constructor we cannot create account object
	Account() {
		long accountNo = 89899889;
		String customerName = "Bharat";
		System.out.println("I am in default constructor");
	}

	public Account(long an, String cn) {
		System.out.println("I am in parameterized constructor");
		long accountNo = an;
		String customerName = cn;
	}

	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println(ac.accountNo = 394000493);
		System.out.println(ac.customerName = "Sunny");

		Account ac2 = new Account();
		System.out.println(ac2.accountNo = 40404079);
		System.out.println(ac2.customerName = "karan");

	}

}

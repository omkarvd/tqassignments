//43.	Write a program using Regular Expression to check valid mobile number or not .Use matches method
package com.assignment;

public class CheckMobileNumberValid {
	public static void main(String[] args) {
		String mobileNumber = "9527741458";
		boolean isValid = mobileNumber.matches("[1-9][0-9]{9}");
		if (isValid) {
			System.out.println(mobileNumber + " is a valid mobile number.");
		} else {
			System.out.println(mobileNumber + " is not a valid mobile number.");
		}
	}
}

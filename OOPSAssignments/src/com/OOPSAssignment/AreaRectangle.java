//14)calculate the area of rectangle

package com.OOPSAssignment;

public class AreaRectangle {
	static int calculateArea(int length, int breadth) {
		int area;
		area = length * breadth;
		return area;
	}

	public static void main(String[] args) {
		AreaRectangle a = new AreaRectangle();
		System.out.println("Area of Rectangle is :" + a.calculateArea(10, 3));
	}
}

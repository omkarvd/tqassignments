package com.single;

class Shape {
	public int calArea(int l, int b) {
		return l * b;
	}
}

public class Rectangle extends Shape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		System.out.println(r.calArea(2, 3));
	}

}

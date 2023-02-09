//13)Create class Box and calculate the volume of box
//volume=length x width x height
package com.OOPSAssignment;

public class Box {

	static int calculateVolume(int l, int w, int h) {
		int volume;
		volume = l * w * h;
		return volume;
	}

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println(b.calculateVolume(3, 3, 3));
	}

}

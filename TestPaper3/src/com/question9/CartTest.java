package com.question9;

public class CartTest {

	public static void main(String[] args) {
		Item i1 = new Item("I1", "Biscuits", 15f);
		Item i2 = new Item("I2", "Juice", 75f);
		Item i3 = new Item("I3", "Nachos", 67f);
		Item i4 = new Item("I4", "Sugar", 36f);
		Item i5 = new Item("I5", "Chocolates", 25f);

		ShoppingCart c1 = new ShoppingCart(101, "Omkar");
		c1.setItem(i1);
		c1.setItem(i3);

		System.out.println(c1);

	}

}

package com.question8;

import java.util.Objects;

class Order implements Comparable<Order> {
	private double price;

	public Order() {

		// TODO Auto-generated constructor stub
	}

	public Order(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Order [price=" + price + "]";
	}

	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		if (this.price == o.price)
			return 0;
		else
			return 1;
	}

}

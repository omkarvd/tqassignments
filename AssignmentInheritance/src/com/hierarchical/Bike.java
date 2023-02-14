package com.hierarchical;

public class Bike {
	private String company;
	private float price;

	Bike() {

	}

	Bike(String company, float price) {
		this.company = company;
		this.price = price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "Bike :" + company + " " + price;
	}
}

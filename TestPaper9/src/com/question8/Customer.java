package com.question8;

class Customer {
	private String name;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {
		super();
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

}

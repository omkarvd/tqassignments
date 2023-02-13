package com.question4;

public class Car {
	private int cnum;
	private String model;

	public Car() {

	}

	public Car(int cnum, String model) {

		this.cnum = cnum;
		this.model = model;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString() {
		return "Car [cnum=" + cnum + ", model=" + model + "]";
	}

}

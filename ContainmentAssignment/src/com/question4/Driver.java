package com.question4;

public class Driver {
	private int licenceno;
	private String name;
	private int exp;
	private Car car;

	public Driver() {

	}

	public Driver(int licenceno, String name, int exp) {
		this.licenceno = licenceno;
		this.name = name;
		this.exp = exp;
	}

	public Driver(int licenceno, String name, int exp, Car car) {
		this(licenceno, name, exp);
		this.car = car;

	}

	public int getLicenceno() {
		return licenceno;
	}

	public void setLicenceno(int licenceno) {
		this.licenceno = licenceno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String toString() {
		return "Driver [licenceno=" + licenceno + ", name=" + name + ", exp=" + exp + ", car=" + car + "]";
	}

}

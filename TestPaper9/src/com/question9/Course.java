package com.question9;

public class Course {
	private int cid;
	private String cname;
	private double fees;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, double fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
}

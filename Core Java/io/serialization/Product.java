package com.evergent.corejava.io.serialization;

import java.io.Serializable;

public class Product implements Serializable {
	
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	private double price;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
